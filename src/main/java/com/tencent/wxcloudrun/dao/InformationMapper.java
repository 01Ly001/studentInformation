package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Information;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InformationMapper {
void insertInformation(Information information);
    List<Information> selectAllInformation();
}
