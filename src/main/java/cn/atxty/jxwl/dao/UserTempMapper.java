package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.UserTemp;

public interface UserTempMapper {

    int deleteByPrimaryKey(String userTempId);

    int insert(UserTemp record);

    int insertSelective(UserTemp record);

    UserTemp selectByPrimaryKey(String userTempId);

    int updateByPrimaryKeySelective(UserTemp record);

    int updateByPrimaryKey(UserTemp record);
}