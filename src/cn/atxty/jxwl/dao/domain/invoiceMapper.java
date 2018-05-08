package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.invoice;
import cn.atxty.jxwl.dao.domain.invoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface invoiceMapper {
    long countByExample(invoiceExample example);

    int deleteByExample(invoiceExample example);

    int deleteByPrimaryKey(String invoiceId);

    int insert(invoice record);

    int insertSelective(invoice record);

    List<invoice> selectByExample(invoiceExample example);

    invoice selectByPrimaryKey(String invoiceId);

    int updateByExampleSelective(@Param("record") invoice record, @Param("example") invoiceExample example);

    int updateByExample(@Param("record") invoice record, @Param("example") invoiceExample example);

    int updateByPrimaryKeySelective(invoice record);

    int updateByPrimaryKey(invoice record);
}