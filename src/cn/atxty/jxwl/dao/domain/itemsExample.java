package cn.atxty.jxwl.dao.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class itemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public itemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andItemsIdIsNull() {
            addCriterion("ITEMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemsIdIsNotNull() {
            addCriterion("ITEMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsIdEqualTo(String value) {
            addCriterion("ITEMS_ID =", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotEqualTo(String value) {
            addCriterion("ITEMS_ID <>", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThan(String value) {
            addCriterion("ITEMS_ID >", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_ID >=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThan(String value) {
            addCriterion("ITEMS_ID <", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_ID <=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLike(String value) {
            addCriterion("ITEMS_ID like", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotLike(String value) {
            addCriterion("ITEMS_ID not like", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdIn(List<String> values) {
            addCriterion("ITEMS_ID in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotIn(List<String> values) {
            addCriterion("ITEMS_ID not in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdBetween(String value1, String value2) {
            addCriterion("ITEMS_ID between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotBetween(String value1, String value2) {
            addCriterion("ITEMS_ID not between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(String value) {
            addCriterion("ITEM_NO =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(String value) {
            addCriterion("ITEM_NO <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(String value) {
            addCriterion("ITEM_NO >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NO >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(String value) {
            addCriterion("ITEM_NO <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NO <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLike(String value) {
            addCriterion("ITEM_NO like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotLike(String value) {
            addCriterion("ITEM_NO not like", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<String> values) {
            addCriterion("ITEM_NO in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<String> values) {
            addCriterion("ITEM_NO not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(String value1, String value2) {
            addCriterion("ITEM_NO between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(String value1, String value2) {
            addCriterion("ITEM_NO not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemImageIsNull() {
            addCriterion("ITEM_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andItemImageIsNotNull() {
            addCriterion("ITEM_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andItemImageEqualTo(String value) {
            addCriterion("ITEM_IMAGE =", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotEqualTo(String value) {
            addCriterion("ITEM_IMAGE <>", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThan(String value) {
            addCriterion("ITEM_IMAGE >", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_IMAGE >=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLessThan(String value) {
            addCriterion("ITEM_IMAGE <", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLessThanOrEqualTo(String value) {
            addCriterion("ITEM_IMAGE <=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLike(String value) {
            addCriterion("ITEM_IMAGE like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotLike(String value) {
            addCriterion("ITEM_IMAGE not like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageIn(List<String> values) {
            addCriterion("ITEM_IMAGE in", values, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotIn(List<String> values) {
            addCriterion("ITEM_IMAGE not in", values, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageBetween(String value1, String value2) {
            addCriterion("ITEM_IMAGE between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotBetween(String value1, String value2) {
            addCriterion("ITEM_IMAGE not between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("FACTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("FACTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(String value) {
            addCriterion("FACTORY_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(String value) {
            addCriterion("FACTORY_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(String value) {
            addCriterion("FACTORY_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(String value) {
            addCriterion("FACTORY_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLike(String value) {
            addCriterion("FACTORY_ID like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotLike(String value) {
            addCriterion("FACTORY_ID not like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<String> values) {
            addCriterion("FACTORY_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<String> values) {
            addCriterion("FACTORY_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(String value1, String value2) {
            addCriterion("FACTORY_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(String value1, String value2) {
            addCriterion("FACTORY_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNull() {
            addCriterion("FACTORY is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIsNotNull() {
            addCriterion("FACTORY is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryEqualTo(String value) {
            addCriterion("FACTORY =", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotEqualTo(String value) {
            addCriterion("FACTORY <>", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThan(String value) {
            addCriterion("FACTORY >", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY >=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThan(String value) {
            addCriterion("FACTORY <", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLessThanOrEqualTo(String value) {
            addCriterion("FACTORY <=", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryLike(String value) {
            addCriterion("FACTORY like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotLike(String value) {
            addCriterion("FACTORY not like", value, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryIn(List<String> values) {
            addCriterion("FACTORY in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotIn(List<String> values) {
            addCriterion("FACTORY not in", values, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryBetween(String value1, String value2) {
            addCriterion("FACTORY between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andFactoryNotBetween(String value1, String value2) {
            addCriterion("FACTORY not between", value1, value2, "factory");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtIsNull() {
            addCriterion("SIZE_LENGHT is null");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtIsNotNull() {
            addCriterion("SIZE_LENGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGHT =", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGHT <>", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtGreaterThan(BigDecimal value) {
            addCriterion("SIZE_LENGHT >", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGHT >=", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtLessThan(BigDecimal value) {
            addCriterion("SIZE_LENGHT <", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGHT <=", value, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGHT in", values, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGHT not in", values, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGHT between", value1, value2, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeLenghtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGHT not between", value1, value2, "sizeLenght");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNull() {
            addCriterion("SIZE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNotNull() {
            addCriterion("SIZE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH =", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH <>", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThan(BigDecimal value) {
            addCriterion("SIZE_WIDTH >", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH >=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThan(BigDecimal value) {
            addCriterion("SIZE_WIDTH <", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH <=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIn(List<BigDecimal> values) {
            addCriterion("SIZE_WIDTH in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_WIDTH not in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_WIDTH between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_WIDTH not between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNull() {
            addCriterion("SIZE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNotNull() {
            addCriterion("SIZE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT =", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <>", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThan(BigDecimal value) {
            addCriterion("SIZE_HEIGHT >", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT >=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThan(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIn(List<BigDecimal> values) {
            addCriterion("SIZE_HEIGHT in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_HEIGHT not in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_HEIGHT between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_HEIGHT not between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("COLOR is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("COLOR =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("COLOR <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("COLOR >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("COLOR >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("COLOR <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("COLOR <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("COLOR like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("COLOR not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("COLOR in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("COLOR not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("COLOR between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("COLOR not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andPackingIsNull() {
            addCriterion("PACKING is null");
            return (Criteria) this;
        }

        public Criteria andPackingIsNotNull() {
            addCriterion("PACKING is not null");
            return (Criteria) this;
        }

        public Criteria andPackingEqualTo(String value) {
            addCriterion("PACKING =", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotEqualTo(String value) {
            addCriterion("PACKING <>", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThan(String value) {
            addCriterion("PACKING >", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING >=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThan(String value) {
            addCriterion("PACKING <", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLessThanOrEqualTo(String value) {
            addCriterion("PACKING <=", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingLike(String value) {
            addCriterion("PACKING like", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotLike(String value) {
            addCriterion("PACKING not like", value, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingIn(List<String> values) {
            addCriterion("PACKING in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotIn(List<String> values) {
            addCriterion("PACKING not in", values, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingBetween(String value1, String value2) {
            addCriterion("PACKING between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingNotBetween(String value1, String value2) {
            addCriterion("PACKING not between", value1, value2, "packing");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("PACKING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("PACKING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("PACKING_UNIT =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("PACKING_UNIT <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("PACKING_UNIT >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("PACKING_UNIT <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("PACKING_UNIT like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("PACKING_UNIT not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("PACKING_UNIT in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("PACKING_UNIT not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andType20IsNull() {
            addCriterion("TYPE20 is null");
            return (Criteria) this;
        }

        public Criteria andType20IsNotNull() {
            addCriterion("TYPE20 is not null");
            return (Criteria) this;
        }

        public Criteria andType20EqualTo(BigDecimal value) {
            addCriterion("TYPE20 =", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20NotEqualTo(BigDecimal value) {
            addCriterion("TYPE20 <>", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20GreaterThan(BigDecimal value) {
            addCriterion("TYPE20 >", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE20 >=", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20LessThan(BigDecimal value) {
            addCriterion("TYPE20 <", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE20 <=", value, "type20");
            return (Criteria) this;
        }

        public Criteria andType20In(List<BigDecimal> values) {
            addCriterion("TYPE20 in", values, "type20");
            return (Criteria) this;
        }

        public Criteria andType20NotIn(List<BigDecimal> values) {
            addCriterion("TYPE20 not in", values, "type20");
            return (Criteria) this;
        }

        public Criteria andType20Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE20 between", value1, value2, "type20");
            return (Criteria) this;
        }

        public Criteria andType20NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE20 not between", value1, value2, "type20");
            return (Criteria) this;
        }

        public Criteria andType40IsNull() {
            addCriterion("TYPE40 is null");
            return (Criteria) this;
        }

        public Criteria andType40IsNotNull() {
            addCriterion("TYPE40 is not null");
            return (Criteria) this;
        }

        public Criteria andType40EqualTo(BigDecimal value) {
            addCriterion("TYPE40 =", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40NotEqualTo(BigDecimal value) {
            addCriterion("TYPE40 <>", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40GreaterThan(BigDecimal value) {
            addCriterion("TYPE40 >", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE40 >=", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40LessThan(BigDecimal value) {
            addCriterion("TYPE40 <", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40LessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE40 <=", value, "type40");
            return (Criteria) this;
        }

        public Criteria andType40In(List<BigDecimal> values) {
            addCriterion("TYPE40 in", values, "type40");
            return (Criteria) this;
        }

        public Criteria andType40NotIn(List<BigDecimal> values) {
            addCriterion("TYPE40 not in", values, "type40");
            return (Criteria) this;
        }

        public Criteria andType40Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE40 between", value1, value2, "type40");
            return (Criteria) this;
        }

        public Criteria andType40NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE40 not between", value1, value2, "type40");
            return (Criteria) this;
        }

        public Criteria andType40hcIsNull() {
            addCriterion("TYPE40HC is null");
            return (Criteria) this;
        }

        public Criteria andType40hcIsNotNull() {
            addCriterion("TYPE40HC is not null");
            return (Criteria) this;
        }

        public Criteria andType40hcEqualTo(BigDecimal value) {
            addCriterion("TYPE40HC =", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcNotEqualTo(BigDecimal value) {
            addCriterion("TYPE40HC <>", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcGreaterThan(BigDecimal value) {
            addCriterion("TYPE40HC >", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE40HC >=", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcLessThan(BigDecimal value) {
            addCriterion("TYPE40HC <", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE40HC <=", value, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcIn(List<BigDecimal> values) {
            addCriterion("TYPE40HC in", values, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcNotIn(List<BigDecimal> values) {
            addCriterion("TYPE40HC not in", values, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE40HC between", value1, value2, "type40hc");
            return (Criteria) this;
        }

        public Criteria andType40hcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE40HC not between", value1, value2, "type40hc");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(Integer value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(Integer value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(Integer value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(Integer value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(Integer value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(Integer value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<Integer> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<Integer> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(Integer value1, Integer value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(Integer value1, Integer value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andCbmIsNull() {
            addCriterion("CBM is null");
            return (Criteria) this;
        }

        public Criteria andCbmIsNotNull() {
            addCriterion("CBM is not null");
            return (Criteria) this;
        }

        public Criteria andCbmEqualTo(BigDecimal value) {
            addCriterion("CBM =", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotEqualTo(BigDecimal value) {
            addCriterion("CBM <>", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmGreaterThan(BigDecimal value) {
            addCriterion("CBM >", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CBM >=", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmLessThan(BigDecimal value) {
            addCriterion("CBM <", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CBM <=", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmIn(List<BigDecimal> values) {
            addCriterion("CBM in", values, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotIn(List<BigDecimal> values) {
            addCriterion("CBM not in", values, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBM between", value1, value2, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBM not between", value1, value2, "cbm");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtIsNull() {
            addCriterion("MPSIZE_LENGHT is null");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtIsNotNull() {
            addCriterion("MPSIZE_LENGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT =", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtNotEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT <>", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtGreaterThan(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT >", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT >=", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtLessThan(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT <", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_LENGHT <=", value, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_LENGHT in", values, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtNotIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_LENGHT not in", values, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_LENGHT between", value1, value2, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeLenghtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_LENGHT not between", value1, value2, "mpsizeLenght");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthIsNull() {
            addCriterion("MPSIZE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthIsNotNull() {
            addCriterion("MPSIZE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH =", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthNotEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH <>", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthGreaterThan(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH >", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH >=", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthLessThan(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH <", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_WIDTH <=", value, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_WIDTH in", values, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthNotIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_WIDTH not in", values, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_WIDTH between", value1, value2, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_WIDTH not between", value1, value2, "mpsizeWidth");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightIsNull() {
            addCriterion("MPSIZE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightIsNotNull() {
            addCriterion("MPSIZE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT =", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightNotEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT <>", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightGreaterThan(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT >", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT >=", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightLessThan(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT <", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MPSIZE_HEIGHT <=", value, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_HEIGHT in", values, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightNotIn(List<BigDecimal> values) {
            addCriterion("MPSIZE_HEIGHT not in", values, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_HEIGHT between", value1, value2, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andMpsizeHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MPSIZE_HEIGHT not between", value1, value2, "mpsizeHeight");
            return (Criteria) this;
        }

        public Criteria andCnoteIsNull() {
            addCriterion("CNOTE is null");
            return (Criteria) this;
        }

        public Criteria andCnoteIsNotNull() {
            addCriterion("CNOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCnoteEqualTo(String value) {
            addCriterion("CNOTE =", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotEqualTo(String value) {
            addCriterion("CNOTE <>", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteGreaterThan(String value) {
            addCriterion("CNOTE >", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteGreaterThanOrEqualTo(String value) {
            addCriterion("CNOTE >=", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLessThan(String value) {
            addCriterion("CNOTE <", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLessThanOrEqualTo(String value) {
            addCriterion("CNOTE <=", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteLike(String value) {
            addCriterion("CNOTE like", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotLike(String value) {
            addCriterion("CNOTE not like", value, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteIn(List<String> values) {
            addCriterion("CNOTE in", values, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotIn(List<String> values) {
            addCriterion("CNOTE not in", values, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteBetween(String value1, String value2) {
            addCriterion("CNOTE between", value1, value2, "cnote");
            return (Criteria) this;
        }

        public Criteria andCnoteNotBetween(String value1, String value2) {
            addCriterion("CNOTE not between", value1, value2, "cnote");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNull() {
            addCriterion("INPUT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInputTimeIsNotNull() {
            addCriterion("INPUT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInputTimeEqualTo(Date value) {
            addCriterion("INPUT_TIME =", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotEqualTo(Date value) {
            addCriterion("INPUT_TIME <>", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThan(Date value) {
            addCriterion("INPUT_TIME >", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUT_TIME >=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThan(Date value) {
            addCriterion("INPUT_TIME <", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeLessThanOrEqualTo(Date value) {
            addCriterion("INPUT_TIME <=", value, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeIn(List<Date> values) {
            addCriterion("INPUT_TIME in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotIn(List<Date> values) {
            addCriterion("INPUT_TIME not in", values, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeBetween(Date value1, Date value2) {
            addCriterion("INPUT_TIME between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andInputTimeNotBetween(Date value1, Date value2) {
            addCriterion("INPUT_TIME not between", value1, value2, "inputTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("CREATE_BY =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("CREATE_BY <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("CREATE_BY >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_BY >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("CREATE_BY <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("CREATE_BY <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("CREATE_BY like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("CREATE_BY not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("CREATE_BY in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("CREATE_BY not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("CREATE_BY between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("CREATE_BY not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNull() {
            addCriterion("CREATE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIsNotNull() {
            addCriterion("CREATE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDeptEqualTo(String value) {
            addCriterion("CREATE_DEPT =", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotEqualTo(String value) {
            addCriterion("CREATE_DEPT <>", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThan(String value) {
            addCriterion("CREATE_DEPT >", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT >=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThan(String value) {
            addCriterion("CREATE_DEPT <", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLessThanOrEqualTo(String value) {
            addCriterion("CREATE_DEPT <=", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptLike(String value) {
            addCriterion("CREATE_DEPT like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotLike(String value) {
            addCriterion("CREATE_DEPT not like", value, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptIn(List<String> values) {
            addCriterion("CREATE_DEPT in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotIn(List<String> values) {
            addCriterion("CREATE_DEPT not in", values, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateDeptNotBetween(String value1, String value2) {
            addCriterion("CREATE_DEPT not between", value1, value2, "createDept");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}