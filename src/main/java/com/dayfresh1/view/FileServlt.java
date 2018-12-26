package com.dayfresh1.view;

import com.dayfresh1.page.PageRespond;
import com.dayfresh1.pojo.Commodity;
import com.dayfresh1.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/commodity", name = "文件系统")
public class FileServlt {
    @Value("${web.upload-path}")
    private static String filePath;

    @Autowired
    CommodityService commodityService;

    @RequestMapping(value = "/show", method = RequestMethod.GET, name = "文件查看权限")
    public PageRespond toDownshow(String page, String limit, String type) {
        System.out.println("to Down show");
//        Integer pge = Integer.valueOf(page);
//        Integer lit = Integer.valueOf(limit);
//        System.out.println("pge--"+page+"--lit--"+lit);
        List<Commodity> list = commodityService.selectAll(type);
        if (list != null || list.size() != 0) {
            return new PageRespond(200, type + "类商品信息获取成功", list);
        }
        return new PageRespond(200, type + "类商品信息获取失败");
    }

    @RequestMapping(value = "/toUps", method = RequestMethod.POST, name = "文件上传权限")
    public PageRespond toUps(MultipartFile file) throws IOException {
//        String fileName = System.currentTimeMillis() + "";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date();
//        String time = sdf.format(date);
//
//        String fileOldName = file.getOriginalFilename();
//        String suffix = getSuffix(fileOldName);
//
//        String path = filePath + time + "/";
//        String newName = fileName + suffix;
//
//        FileSystem fs = new FileSystem();
//        fs.setFileSystemOldname(fileOldName);
//        fs.setFileSystemNewname(newName);
//        fs.setFileSystemPath(path + newName);
//        fs.setFileSystemType(suffix);
//        fs.setFileSystemUploaddate(time);
//
//
//        File target = new File(path, newName);
//        if (!target.exists()) {
//            target.mkdirs();
//        }
//        file.transferTo(target);
//        boolean flag = insertFile(fs);
//        MyResponse mr = new MyResponse();
//        mr.setCode(0);
//        mr.setMsg("上传成功");
//
//        return mr;
        return null;
    }


}
