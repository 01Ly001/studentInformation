package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Information;
import com.tencent.wxcloudrun.service.InformationService;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {
    final InformationService informationService;
    final Logger logger;

    public InformationController(InformationService informationService, Logger logger) {
        this.informationService = informationService;
        this.logger = logger;
    }
    @GetMapping(value = "/api/informationAll")
    ApiResponse get() {
        logger.info("/api/informationAll get request");
       List<Information> information = informationService.selectAllInformation();
        return ApiResponse.ok(information);
    }

}
