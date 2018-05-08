package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Onlineinfo;

public interface OnlineinfoMapper {

    int deleteByPrimaryKey(String a1);

    int insert(Onlineinfo record);

    int insertSelective(Onlineinfo record);


    Onlineinfo selectByPrimaryKey(String a1);

    int updateByPrimaryKeySelective(Onlineinfo record);

    int updateByPrimaryKey(Onlineinfo record);
}