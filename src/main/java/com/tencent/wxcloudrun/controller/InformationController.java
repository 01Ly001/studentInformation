package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.Information;
import com.tencent.wxcloudrun.service.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {
    final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }
    @GetMapping(value = "/api/informationAll")
    ApiResponse get() {
       List<Information> information = informationService.selectAllInformation();
        return ApiResponse.ok(information);
    }

}
