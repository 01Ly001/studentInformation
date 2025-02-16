package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Information;

import java.util.List;

public interface InformationService {
    List<Information> selectAllInformation();
}
