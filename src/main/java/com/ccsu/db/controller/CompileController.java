package com.ccsu.db.controller;

import com.ccsu.db.pojo.ResultMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

@RestController
public class CompileController {

    @RequestMapping("/run")
    @ResponseBody
    public ResultMessage runCode(@RequestParam("code") String code) {
        ResultMessage rm = new ResultMessage();
        StringBuilder sb = new StringBuilder();
        File dir = new File("G:/Pratice/毕设/db/File");//此处是指定路径
        File tempFile = new File(dir, "Main.java");
        try {
            ByteArrayOutputStream errOut = new ByteArrayOutputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            fileOutputStream.write(code.getBytes());
            fileOutputStream.close();
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            int result = compiler.run(null, null, errOut, tempFile + "");
            if (result == 1) {
                sb.append("[ Main.java ]遇到编译错误...\n");
                sb.append(errOut.toString("utf-8") + "\n");
                //输出错误信息
                rm.setErrcode(-1);
            } else {
                sb.append("[ Main.java ]编译成功！&\n");
                //通过类加载器来动态运行编译好的类
                URL[] urls = new URL[]{new URL("file:/" + "G:/Pratice/毕设/db/File/")};
                URLClassLoader loader = new URLClassLoader(urls);
//                Class c = loader.loadClass("Main");
                //调用加载类的main方法
//                Method m = c.getMethod("main");
                Method mainMethod = loader.loadClass("Main")
                        .getMethod("main", String[].class);
                //
                PrintStream oldPrintStream = System.out;		//将原来的System.out交给printStream 对象保存
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                System.setOut(new PrintStream(bos));         //设置新的out
                mainMethod.invoke(null, (Object)new String[]{"111", "222", "333"});
                sb.append(bos+"&");
                System.setOut(oldPrintStream);   //恢复原来的System.out


                //注意上面的代码,如果不加(Object)转型的话,
                //则会编译成:m.invoke(null,"aa","bb"),就发生了参数个数不匹配的问题。
                //因此,必须要加上(Object)转型,避免这个问题。
                sb.append("[ Main.java ]运行成功！\n");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        rm.setData(sb.toString());
        return rm;
    }
}
