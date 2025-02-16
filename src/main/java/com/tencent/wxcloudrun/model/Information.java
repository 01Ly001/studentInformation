package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.sql.Date;

@Data
public class Information {
    private  int id;
    private String title;
    private String informationClassify;
    private Date informationTime;
    private String  informationUrl;
}
