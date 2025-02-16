package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.InformationMapper;
import com.tencent.wxcloudrun.model.Information;
import com.tencent.wxcloudrun.service.InformationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {
    final InformationMapper informationMapper;

    public InformationServiceImpl(InformationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }
    @Override
    public List<Information> selectAllInformation() {
        return informationMapper.selectAllInformation();
    }
}
