package com.ccsu.db.controller;

import com.ccsu.db.pojo.Resource;
import com.ccsu.db.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/Resource")
public class ResourceController {
    //依赖注入
    @Autowired
    private ResourceService resourceService;

    //根据Id查询指定用户
    @RequestMapping("/queryById")
    @ResponseBody
    Resource selectByPrimaryKey(int id) {
        return this.resourceService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getAllResource")
    @ResponseBody
    public List<Resource> queryAll() {
        return this.resourceService.queryAll();
    }

    @RequestMapping("/insert")
    @ResponseBody
    int insert(Resource resource) {
        List<Resource> r = this.resourceService.queryAll();
        for(Resource re: r) {
            System.out.println(re.getAuthor().equals(resource.getAuthor()));
            if(re.getResourcename().equals(resource.getResourcename()) && re.getAuthor().equals(resource.getAuthor())) {
                re.setIsusable("等待审核");

                return this.resourceService.updateByPrimaryKey(re);
            }
        }
        return this.resourceService.insert(resource);
    }

    @RequestMapping("/updateById")
    @ResponseBody
    int updateByPrimaryKey(Resource resource) {
        return this.resourceService.updateByPrimaryKey(resource);
    }

    @RequestMapping("/deleteById")
    @ResponseBody
    int deleteByPrimaryKey(int id) {
        return this.resourceService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/getFile")
    @ResponseBody
    String getFile(String fileName){
        String innerText = "";
        StringBuffer content = new StringBuffer();
        if (fileName != null) {
            //设置文件路径
            int position=0;
            String[] bufstring=new String[1024];
            try {
                //打开带读取的文件
                BufferedReader br = new BufferedReader(new FileReader(new File("").getCanonicalPath()+"\\File\\"+fileName));
                String line = null;
                while ((line = br.readLine()) != null) {
                    bufstring[position] = line;
                    position++;
                }
                br.close();//关闭文件
                for (int i = 0; i < position; i++) {
                    content.append(bufstring[i]);
                    content.append("<br />");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        innerText = content.toString();
      return innerText;
    }
}
