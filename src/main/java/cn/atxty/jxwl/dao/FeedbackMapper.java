package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.Feedback;
import cn.atxty.jxwl.domain.FeedbackWithBLOBs;
public interface FeedbackMapper {

    int deleteByPrimaryKey(String feedbackId);

    int insert(FeedbackWithBLOBs record);

    int insertSelective(FeedbackWithBLOBs record);

    FeedbackWithBLOBs selectByPrimaryKey(String feedbackId);


    int updateByPrimaryKeySelective(FeedbackWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FeedbackWithBLOBs record);

    int updateByPrimaryKey(Feedback record);
}