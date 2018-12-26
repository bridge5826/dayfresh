package com.dayfresh1.view;

import com.alibaba.fastjson.JSONObject;
import com.dayfresh1.pojo.FileFrom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("/fileFrom")
public class FileFromController {

    @RequestMapping("/upFrom")
    public void test(FileFrom fileFrom , MultipartFile[] files){
        System.out.println("--------");
//        FileFrom ff = JSONObject.parseObject(fileFrom , FileFrom.class);
        System.out.println(files);
        System.out.println(fileFrom);
    }

    @RequestMapping(value = "/upFrom2", method = RequestMethod.POST, produces = "text/html;charset=utf-8")
    public String uploadTrainProduct(
            @RequestParam(value = "file") MultipartFile[] files,  //这样接收文件
            HttpServletRequest request,
            FileFrom fileFrom
    ) {
        System.out.println("---------2-----------");

        return null;
    }
}
