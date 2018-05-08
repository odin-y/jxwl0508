package cn.atxty.jxwl.dao.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class exportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public exportExample() {
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

        public Criteria andExportIdIsNull() {
            addCriterion("EXPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andExportIdIsNotNull() {
            addCriterion("EXPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExportIdEqualTo(String value) {
            addCriterion("EXPORT_ID =", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotEqualTo(String value) {
            addCriterion("EXPORT_ID <>", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThan(String value) {
            addCriterion("EXPORT_ID >", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXPORT_ID >=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThan(String value) {
            addCriterion("EXPORT_ID <", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLessThanOrEqualTo(String value) {
            addCriterion("EXPORT_ID <=", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdLike(String value) {
            addCriterion("EXPORT_ID like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotLike(String value) {
            addCriterion("EXPORT_ID not like", value, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdIn(List<String> values) {
            addCriterion("EXPORT_ID in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotIn(List<String> values) {
            addCriterion("EXPORT_ID not in", values, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdBetween(String value1, String value2) {
            addCriterion("EXPORT_ID between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andExportIdNotBetween(String value1, String value2) {
            addCriterion("EXPORT_ID not between", value1, value2, "exportId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdIsNull() {
            addCriterion("PACKING_LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackingListIdIsNotNull() {
            addCriterion("PACKING_LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackingListIdEqualTo(String value) {
            addCriterion("PACKING_LIST_ID =", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotEqualTo(String value) {
            addCriterion("PACKING_LIST_ID <>", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdGreaterThan(String value) {
            addCriterion("PACKING_LIST_ID >", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_LIST_ID >=", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLessThan(String value) {
            addCriterion("PACKING_LIST_ID <", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLessThanOrEqualTo(String value) {
            addCriterion("PACKING_LIST_ID <=", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdLike(String value) {
            addCriterion("PACKING_LIST_ID like", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotLike(String value) {
            addCriterion("PACKING_LIST_ID not like", value, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdIn(List<String> values) {
            addCriterion("PACKING_LIST_ID in", values, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotIn(List<String> values) {
            addCriterion("PACKING_LIST_ID not in", values, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdBetween(String value1, String value2) {
            addCriterion("PACKING_LIST_ID between", value1, value2, "packingListId");
            return (Criteria) this;
        }

        public Criteria andPackingListIdNotBetween(String value1, String value2) {
            addCriterion("PACKING_LIST_ID not between", value1, value2, "packingListId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("INPUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("INPUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(Date value) {
            addCriterion("INPUT_DATE =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(Date value) {
            addCriterion("INPUT_DATE <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(Date value) {
            addCriterion("INPUT_DATE >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INPUT_DATE >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(Date value) {
            addCriterion("INPUT_DATE <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(Date value) {
            addCriterion("INPUT_DATE <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<Date> values) {
            addCriterion("INPUT_DATE in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<Date> values) {
            addCriterion("INPUT_DATE not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(Date value1, Date value2) {
            addCriterion("INPUT_DATE between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(Date value1, Date value2) {
            addCriterion("INPUT_DATE not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNull() {
            addCriterion("CONTRACT_IDS is null");
            return (Criteria) this;
        }

        public Criteria andContractIdsIsNotNull() {
            addCriterion("CONTRACT_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdsEqualTo(String value) {
            addCriterion("CONTRACT_IDS =", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotEqualTo(String value) {
            addCriterion("CONTRACT_IDS <>", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThan(String value) {
            addCriterion("CONTRACT_IDS >", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_IDS >=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThan(String value) {
            addCriterion("CONTRACT_IDS <", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_IDS <=", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsLike(String value) {
            addCriterion("CONTRACT_IDS like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotLike(String value) {
            addCriterion("CONTRACT_IDS not like", value, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsIn(List<String> values) {
            addCriterion("CONTRACT_IDS in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotIn(List<String> values) {
            addCriterion("CONTRACT_IDS not in", values, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsBetween(String value1, String value2) {
            addCriterion("CONTRACT_IDS between", value1, value2, "contractIds");
            return (Criteria) this;
        }

        public Criteria andContractIdsNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_IDS not between", value1, value2, "contractIds");
            return (Criteria) this;
        }

        public Criteria andCustomerContractIsNull() {
            addCriterion("CUSTOMER_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContractIsNotNull() {
            addCriterion("CUSTOMER_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContractEqualTo(String value) {
            addCriterion("CUSTOMER_CONTRACT =", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractNotEqualTo(String value) {
            addCriterion("CUSTOMER_CONTRACT <>", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractGreaterThan(String value) {
            addCriterion("CUSTOMER_CONTRACT >", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTRACT >=", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractLessThan(String value) {
            addCriterion("CUSTOMER_CONTRACT <", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTRACT <=", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractLike(String value) {
            addCriterion("CUSTOMER_CONTRACT like", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractNotLike(String value) {
            addCriterion("CUSTOMER_CONTRACT not like", value, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractIn(List<String> values) {
            addCriterion("CUSTOMER_CONTRACT in", values, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractNotIn(List<String> values) {
            addCriterion("CUSTOMER_CONTRACT not in", values, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTRACT between", value1, value2, "customerContract");
            return (Criteria) this;
        }

        public Criteria andCustomerContractNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTRACT not between", value1, value2, "customerContract");
            return (Criteria) this;
        }

        public Criteria andLcnoIsNull() {
            addCriterion("LCNO is null");
            return (Criteria) this;
        }

        public Criteria andLcnoIsNotNull() {
            addCriterion("LCNO is not null");
            return (Criteria) this;
        }

        public Criteria andLcnoEqualTo(String value) {
            addCriterion("LCNO =", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoNotEqualTo(String value) {
            addCriterion("LCNO <>", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoGreaterThan(String value) {
            addCriterion("LCNO >", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoGreaterThanOrEqualTo(String value) {
            addCriterion("LCNO >=", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoLessThan(String value) {
            addCriterion("LCNO <", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoLessThanOrEqualTo(String value) {
            addCriterion("LCNO <=", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoLike(String value) {
            addCriterion("LCNO like", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoNotLike(String value) {
            addCriterion("LCNO not like", value, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoIn(List<String> values) {
            addCriterion("LCNO in", values, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoNotIn(List<String> values) {
            addCriterion("LCNO not in", values, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoBetween(String value1, String value2) {
            addCriterion("LCNO between", value1, value2, "lcno");
            return (Criteria) this;
        }

        public Criteria andLcnoNotBetween(String value1, String value2) {
            addCriterion("LCNO not between", value1, value2, "lcno");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("CONSIGNEE is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("CONSIGNEE is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("CONSIGNEE =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("CONSIGNEE <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("CONSIGNEE >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("CONSIGNEE >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("CONSIGNEE <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("CONSIGNEE <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("CONSIGNEE like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("CONSIGNEE not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("CONSIGNEE in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("CONSIGNEE not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("CONSIGNEE between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("CONSIGNEE not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("MARKS is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("MARKS is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("MARKS =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("MARKS <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("MARKS >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("MARKS >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("MARKS <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("MARKS <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("MARKS like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("MARKS not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("MARKS in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("MARKS not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("MARKS between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("MARKS not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andShipmentPortIsNull() {
            addCriterion("SHIPMENT_PORT is null");
            return (Criteria) this;
        }

        public Criteria andShipmentPortIsNotNull() {
            addCriterion("SHIPMENT_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andShipmentPortEqualTo(String value) {
            addCriterion("SHIPMENT_PORT =", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortNotEqualTo(String value) {
            addCriterion("SHIPMENT_PORT <>", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortGreaterThan(String value) {
            addCriterion("SHIPMENT_PORT >", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_PORT >=", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortLessThan(String value) {
            addCriterion("SHIPMENT_PORT <", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortLessThanOrEqualTo(String value) {
            addCriterion("SHIPMENT_PORT <=", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortLike(String value) {
            addCriterion("SHIPMENT_PORT like", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortNotLike(String value) {
            addCriterion("SHIPMENT_PORT not like", value, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortIn(List<String> values) {
            addCriterion("SHIPMENT_PORT in", values, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortNotIn(List<String> values) {
            addCriterion("SHIPMENT_PORT not in", values, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortBetween(String value1, String value2) {
            addCriterion("SHIPMENT_PORT between", value1, value2, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andShipmentPortNotBetween(String value1, String value2) {
            addCriterion("SHIPMENT_PORT not between", value1, value2, "shipmentPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNull() {
            addCriterion("DESTINATION_PORT is null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIsNotNull() {
            addCriterion("DESTINATION_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationPortEqualTo(String value) {
            addCriterion("DESTINATION_PORT =", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotEqualTo(String value) {
            addCriterion("DESTINATION_PORT <>", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThan(String value) {
            addCriterion("DESTINATION_PORT >", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortGreaterThanOrEqualTo(String value) {
            addCriterion("DESTINATION_PORT >=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThan(String value) {
            addCriterion("DESTINATION_PORT <", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLessThanOrEqualTo(String value) {
            addCriterion("DESTINATION_PORT <=", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortLike(String value) {
            addCriterion("DESTINATION_PORT like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotLike(String value) {
            addCriterion("DESTINATION_PORT not like", value, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortIn(List<String> values) {
            addCriterion("DESTINATION_PORT in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotIn(List<String> values) {
            addCriterion("DESTINATION_PORT not in", values, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortBetween(String value1, String value2) {
            addCriterion("DESTINATION_PORT between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andDestinationPortNotBetween(String value1, String value2) {
            addCriterion("DESTINATION_PORT not between", value1, value2, "destinationPort");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNull() {
            addCriterion("TRANSPORT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andTransportModeIsNotNull() {
            addCriterion("TRANSPORT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andTransportModeEqualTo(String value) {
            addCriterion("TRANSPORT_MODE =", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotEqualTo(String value) {
            addCriterion("TRANSPORT_MODE <>", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThan(String value) {
            addCriterion("TRANSPORT_MODE >", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_MODE >=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThan(String value) {
            addCriterion("TRANSPORT_MODE <", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORT_MODE <=", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeLike(String value) {
            addCriterion("TRANSPORT_MODE like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotLike(String value) {
            addCriterion("TRANSPORT_MODE not like", value, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeIn(List<String> values) {
            addCriterion("TRANSPORT_MODE in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotIn(List<String> values) {
            addCriterion("TRANSPORT_MODE not in", values, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeBetween(String value1, String value2) {
            addCriterion("TRANSPORT_MODE between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andTransportModeNotBetween(String value1, String value2) {
            addCriterion("TRANSPORT_MODE not between", value1, value2, "transportMode");
            return (Criteria) this;
        }

        public Criteria andPriceConditionIsNull() {
            addCriterion("PRICE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andPriceConditionIsNotNull() {
            addCriterion("PRICE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andPriceConditionEqualTo(String value) {
            addCriterion("PRICE_CONDITION =", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionNotEqualTo(String value) {
            addCriterion("PRICE_CONDITION <>", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionGreaterThan(String value) {
            addCriterion("PRICE_CONDITION >", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_CONDITION >=", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionLessThan(String value) {
            addCriterion("PRICE_CONDITION <", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionLessThanOrEqualTo(String value) {
            addCriterion("PRICE_CONDITION <=", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionLike(String value) {
            addCriterion("PRICE_CONDITION like", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionNotLike(String value) {
            addCriterion("PRICE_CONDITION not like", value, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionIn(List<String> values) {
            addCriterion("PRICE_CONDITION in", values, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionNotIn(List<String> values) {
            addCriterion("PRICE_CONDITION not in", values, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionBetween(String value1, String value2) {
            addCriterion("PRICE_CONDITION between", value1, value2, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andPriceConditionNotBetween(String value1, String value2) {
            addCriterion("PRICE_CONDITION not between", value1, value2, "priceCondition");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNull() {
            addCriterion("BOX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNotNull() {
            addCriterion("BOX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumEqualTo(Integer value) {
            addCriterion("BOX_NUM =", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotEqualTo(Integer value) {
            addCriterion("BOX_NUM <>", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThan(Integer value) {
            addCriterion("BOX_NUM >", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM >=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThan(Integer value) {
            addCriterion("BOX_NUM <", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM <=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumIn(List<Integer> values) {
            addCriterion("BOX_NUM in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotIn(List<Integer> values) {
            addCriterion("BOX_NUM not in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM not between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("CNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("CNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Integer value) {
            addCriterion("CNUMBER =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Integer value) {
            addCriterion("CNUMBER <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Integer value) {
            addCriterion("CNUMBER >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Integer value) {
            addCriterion("CNUMBER <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Integer> values) {
            addCriterion("CNUMBER in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Integer> values) {
            addCriterion("CNUMBER not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER not between", value1, value2, "cnumber");
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

        public Criteria andGrossWeightIsNull() {
            addCriterion("GROSS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("GROSS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(BigDecimal value) {
            addCriterion("GROSS_WEIGHT >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<BigDecimal> values) {
            addCriterion("GROSS_WEIGHT in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<BigDecimal> values) {
            addCriterion("GROSS_WEIGHT not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSS_WEIGHT between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSS_WEIGHT not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("NET_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("NET_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(BigDecimal value) {
            addCriterion("NET_WEIGHT >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(BigDecimal value) {
            addCriterion("NET_WEIGHT <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<BigDecimal> values) {
            addCriterion("NET_WEIGHT in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<BigDecimal> values) {
            addCriterion("NET_WEIGHT not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_WEIGHT between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_WEIGHT not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNull() {
            addCriterion("SIZE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNotNull() {
            addCriterion("SIZE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH =", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH <>", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThan(BigDecimal value) {
            addCriterion("SIZE_LENGTH >", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH >=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThan(BigDecimal value) {
            addCriterion("SIZE_LENGTH <", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH <=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGTH in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGTH not in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGTH between", value1, value2, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGTH not between", value1, value2, "sizeLength");
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

        public Criteria andCsizeIsNull() {
            addCriterion("CSIZE is null");
            return (Criteria) this;
        }

        public Criteria andCsizeIsNotNull() {
            addCriterion("CSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCsizeEqualTo(BigDecimal value) {
            addCriterion("CSIZE =", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotEqualTo(BigDecimal value) {
            addCriterion("CSIZE <>", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThan(BigDecimal value) {
            addCriterion("CSIZE >", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CSIZE >=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThan(BigDecimal value) {
            addCriterion("CSIZE <", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CSIZE <=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeIn(List<BigDecimal> values) {
            addCriterion("CSIZE in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotIn(List<BigDecimal> values) {
            addCriterion("CSIZE not in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSIZE between", value1, value2, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CSIZE not between", value1, value2, "csize");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andNoTaxIsNull() {
            addCriterion("NO_TAX is null");
            return (Criteria) this;
        }

        public Criteria andNoTaxIsNotNull() {
            addCriterion("NO_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andNoTaxEqualTo(BigDecimal value) {
            addCriterion("NO_TAX =", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotEqualTo(BigDecimal value) {
            addCriterion("NO_TAX <>", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxGreaterThan(BigDecimal value) {
            addCriterion("NO_TAX >", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_TAX >=", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxLessThan(BigDecimal value) {
            addCriterion("NO_TAX <", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_TAX <=", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxIn(List<BigDecimal> values) {
            addCriterion("NO_TAX in", values, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotIn(List<BigDecimal> values) {
            addCriterion("NO_TAX not in", values, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_TAX between", value1, value2, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_TAX not between", value1, value2, "noTax");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNull() {
            addCriterion("COST_TAX is null");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNotNull() {
            addCriterion("COST_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andCostTaxEqualTo(BigDecimal value) {
            addCriterion("COST_TAX =", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotEqualTo(BigDecimal value) {
            addCriterion("COST_TAX <>", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThan(BigDecimal value) {
            addCriterion("COST_TAX >", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TAX >=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThan(BigDecimal value) {
            addCriterion("COST_TAX <", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TAX <=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxIn(List<BigDecimal> values) {
            addCriterion("COST_TAX in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotIn(List<BigDecimal> values) {
            addCriterion("COST_TAX not in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TAX between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TAX not between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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