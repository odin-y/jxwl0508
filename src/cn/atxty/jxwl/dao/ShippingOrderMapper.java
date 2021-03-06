package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ShippingOrder;
import cn.atxty.jxwl.domain.ShippingOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingOrderMapper {
    long countByExample(ShippingOrderExample example);

    int deleteByExample(ShippingOrderExample example);

    int deleteByPrimaryKey(String shippingOrderId);

    int insert(ShippingOrder record);

    int insertSelective(ShippingOrder record);

    List<ShippingOrder> selectByExample(ShippingOrderExample example);

    ShippingOrder selectByPrimaryKey(String shippingOrderId);

    int updateByExampleSelective(@Param("record") ShippingOrder record, @Param("example") ShippingOrderExample example);

    int updateByExample(@Param("record") ShippingOrder record, @Param("example") ShippingOrderExample example);

    int updateByPrimaryKeySelective(ShippingOrder record);

    int updateByPrimaryKey(ShippingOrder record);
}