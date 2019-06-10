package com.websitehouduan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@SpringBootApplication
@RequestMapping(value = "/everywhere")
public class UserController {
    @RequestMapping(value = "/getpicnum", method = RequestMethod.GET)
    int getUserByGet(@RequestParam(value = "userName") String userName) {
        String filepath = "/opt/website/html/1.basic/images/content/";
        File file = new File(filepath);
        File[] fileList = file.listFiles();
        System.out.println(fileList.length);
        return fileList.length;
    }
}