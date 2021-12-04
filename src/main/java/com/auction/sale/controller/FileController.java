package com.auction.sale.controller;

import com.auction.sale.domain.RestResponse;
import com.auction.sale.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("fileController")
public class FileController {

    @Autowired
    FileService fileService;

    @RequestMapping(value = "upload",method = RequestMethod.GET)
    @ResponseBody
    public RestResponse uploadFileTest(@RequestParam("uploadFile") MultipartFile file) {
        return RestResponse.buildSuccess(fileService.uploadFile(file));
    }
}
