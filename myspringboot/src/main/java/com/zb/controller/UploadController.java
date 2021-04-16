package com.zb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


@RestController
@RequestMapping("/api")
@Slf4j
public class UploadController {
    // @Value("${sava_path}")
    // private String sava_path;

    @PostMapping(value = "/file/upload")
    public String addDish(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
        // 文件路径
        String path = null;
        double fileSize = file.getSize();
        System.out.println("文件的大小是" + fileSize);

        byte[] sizebyte = file.getBytes();
        System.out.println("文件的byte大小是" + sizebyte.toString());

        // 判断上传的文件是否为空
        String type = null;// 文件类型
        String fileName = file.getOriginalFilename();// 文件原名称
        System.out.println("上传的文件原名称:" + fileName);
        // 判断文件类型
        type = fileName.contains(".") ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
        if (type != null) {// 判断文件类型是否为空

            if ("GIF".equalsIgnoreCase(type.toUpperCase()) || "PNG".equalsIgnoreCase(type.toUpperCase())
                || "JPG".equalsIgnoreCase(type.toUpperCase())) {

                // 项目在容器中实际发布运行的根路径
                String realPath = request.getSession().getServletContext().getRealPath("/");
                // 自定义的文件名称
                // String trueFileName = String.valueOf(System.currentTimeMillis()) + "." + type;
                // 设置存放图片文件的路径
                path = "/opt/video/"+ fileName;

//                path = realPath + fileName;
                log.info("存放图片文件的路径:" + path);

                // 转存文件到指定的路径
                file.transferTo(new File(path));
                log.info("文件成功上传到指定目录下");

                return path.replace("/opt/video/","http://47.117.70.226:8097/");
            } else {
                log.info("不是我们想要的文件类型,请按要求重新上传");
                return "不是我们想要的文件类型,请按要求重新上传";
            }
        } else {
            return "文件不存在";
        }

    }
}
