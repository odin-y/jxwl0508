package cn.atxty.jxwl.dao;

import cn.atxty.jxwl.domain.ShippingOrder;


public interface ShippingOrderMapper {

    int deleteByPrimaryKey(String shippingOrderId);

    int insert(ShippingOrder record);

    int insertSelective(ShippingOrder record);

    ShippingOrder selectByPrimaryKey(String shippingOrderId);
    
    int updateByPrimaryKeySelective(ShippingOrder record);

    int updateByPrimaryKey(ShippingOrder record);
}