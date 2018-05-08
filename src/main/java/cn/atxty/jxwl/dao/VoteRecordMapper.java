package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.VoteRecord;

public interface VoteRecordMapper {

    int deleteByPrimaryKey(String voteRecordId);

    int insert(VoteRecord record);

    int insertSelective(VoteRecord record);

    VoteRecord selectByPrimaryKey(String voteRecordId);

    int updateByPrimaryKeySelective(VoteRecord record);

    int updateByPrimaryKey(VoteRecord record);
}