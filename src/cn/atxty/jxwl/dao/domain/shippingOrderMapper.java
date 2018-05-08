package cn.atxty.jxwl.dao.domain;

import cn.atxty.jxwl.dao.domain.shippingOrder;
import cn.atxty.jxwl.dao.domain.shippingOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shippingOrderMapper {
    long countByExample(shippingOrderExample example);

    int deleteByExample(shippingOrderExample example);

    int deleteByPrimaryKey(String shippingOrderId);

    int insert(shippingOrder record);

    int insertSelective(shippingOrder record);

    List<shippingOrder> selectByExample(shippingOrderExample example);

    shippingOrder selectByPrimaryKey(String shippingOrderId);

    int updateByExampleSelective(@Param("record") shippingOrder record, @Param("example") shippingOrderExample example);

    int updateByExample(@Param("record") shippingOrder record, @Param("example") shippingOrderExample example);

    int updateByPrimaryKeySelective(shippingOrder record);

    int updateByPrimaryKey(shippingOrder record);
}