package com.wdk.meal.basic.dal.dataobject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MealDeskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MealDeskExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andDeskCodeIsNull() {
            addCriterion("desk_code is null");
            return (Criteria) this;
        }

        public Criteria andDeskCodeIsNotNull() {
            addCriterion("desk_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeskCodeEqualTo(String value) {
            addCriterion("desk_code =", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeNotEqualTo(String value) {
            addCriterion("desk_code <>", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeGreaterThan(String value) {
            addCriterion("desk_code >", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("desk_code >=", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeLessThan(String value) {
            addCriterion("desk_code <", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeLessThanOrEqualTo(String value) {
            addCriterion("desk_code <=", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeLike(String value) {
            addCriterion("desk_code like", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeNotLike(String value) {
            addCriterion("desk_code not like", value, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeIn(List<String> values) {
            addCriterion("desk_code in", values, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeNotIn(List<String> values) {
            addCriterion("desk_code not in", values, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeBetween(String value1, String value2) {
            addCriterion("desk_code between", value1, value2, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskCodeNotBetween(String value1, String value2) {
            addCriterion("desk_code not between", value1, value2, "deskCode");
            return (Criteria) this;
        }

        public Criteria andDeskSpecIsNull() {
            addCriterion("desk_spec is null");
            return (Criteria) this;
        }

        public Criteria andDeskSpecIsNotNull() {
            addCriterion("desk_spec is not null");
            return (Criteria) this;
        }

        public Criteria andDeskSpecEqualTo(String value) {
            addCriterion("desk_spec =", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecNotEqualTo(String value) {
            addCriterion("desk_spec <>", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecGreaterThan(String value) {
            addCriterion("desk_spec >", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecGreaterThanOrEqualTo(String value) {
            addCriterion("desk_spec >=", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecLessThan(String value) {
            addCriterion("desk_spec <", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecLessThanOrEqualTo(String value) {
            addCriterion("desk_spec <=", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecLike(String value) {
            addCriterion("desk_spec like", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecNotLike(String value) {
            addCriterion("desk_spec not like", value, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecIn(List<String> values) {
            addCriterion("desk_spec in", values, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecNotIn(List<String> values) {
            addCriterion("desk_spec not in", values, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecBetween(String value1, String value2) {
            addCriterion("desk_spec between", value1, value2, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andDeskSpecNotBetween(String value1, String value2) {
            addCriterion("desk_spec not between", value1, value2, "deskSpec");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Long value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Long value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Long value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Long value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Long> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Long> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Long value1, Long value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIsNull() {
            addCriterion("desk_type is null");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIsNotNull() {
            addCriterion("desk_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeskTypeEqualTo(Byte value) {
            addCriterion("desk_type =", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotEqualTo(Byte value) {
            addCriterion("desk_type <>", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeGreaterThan(Byte value) {
            addCriterion("desk_type >", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("desk_type >=", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeLessThan(Byte value) {
            addCriterion("desk_type <", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeLessThanOrEqualTo(Byte value) {
            addCriterion("desk_type <=", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIn(List<Byte> values) {
            addCriterion("desk_type in", values, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotIn(List<Byte> values) {
            addCriterion("desk_type not in", values, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeBetween(Byte value1, Byte value2) {
            addCriterion("desk_type between", value1, value2, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("desk_type not between", value1, value2, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskNameIsNull() {
            addCriterion("desk_name is null");
            return (Criteria) this;
        }

        public Criteria andDeskNameIsNotNull() {
            addCriterion("desk_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeskNameEqualTo(String value) {
            addCriterion("desk_name =", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotEqualTo(String value) {
            addCriterion("desk_name <>", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameGreaterThan(String value) {
            addCriterion("desk_name >", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameGreaterThanOrEqualTo(String value) {
            addCriterion("desk_name >=", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLessThan(String value) {
            addCriterion("desk_name <", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLessThanOrEqualTo(String value) {
            addCriterion("desk_name <=", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLike(String value) {
            addCriterion("desk_name like", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotLike(String value) {
            addCriterion("desk_name not like", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameIn(List<String> values) {
            addCriterion("desk_name in", values, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotIn(List<String> values) {
            addCriterion("desk_name not in", values, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameBetween(String value1, String value2) {
            addCriterion("desk_name between", value1, value2, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotBetween(String value1, String value2) {
            addCriterion("desk_name not between", value1, value2, "deskName");
            return (Criteria) this;
        }

        public Criteria andArCodeIsNull() {
            addCriterion("ar_code is null");
            return (Criteria) this;
        }

        public Criteria andArCodeIsNotNull() {
            addCriterion("ar_code is not null");
            return (Criteria) this;
        }

        public Criteria andArCodeEqualTo(String value) {
            addCriterion("ar_code =", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeNotEqualTo(String value) {
            addCriterion("ar_code <>", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeGreaterThan(String value) {
            addCriterion("ar_code >", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ar_code >=", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeLessThan(String value) {
            addCriterion("ar_code <", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeLessThanOrEqualTo(String value) {
            addCriterion("ar_code <=", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeLike(String value) {
            addCriterion("ar_code like", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeNotLike(String value) {
            addCriterion("ar_code not like", value, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeIn(List<String> values) {
            addCriterion("ar_code in", values, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeNotIn(List<String> values) {
            addCriterion("ar_code not in", values, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeBetween(String value1, String value2) {
            addCriterion("ar_code between", value1, value2, "arCode");
            return (Criteria) this;
        }

        public Criteria andArCodeNotBetween(String value1, String value2) {
            addCriterion("ar_code not between", value1, value2, "arCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNull() {
            addCriterion("warehouse_code is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIsNotNull() {
            addCriterion("warehouse_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeEqualTo(String value) {
            addCriterion("warehouse_code =", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotEqualTo(String value) {
            addCriterion("warehouse_code <>", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThan(String value) {
            addCriterion("warehouse_code >", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("warehouse_code >=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThan(String value) {
            addCriterion("warehouse_code <", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLessThanOrEqualTo(String value) {
            addCriterion("warehouse_code <=", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeLike(String value) {
            addCriterion("warehouse_code like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotLike(String value) {
            addCriterion("warehouse_code not like", value, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeIn(List<String> values) {
            addCriterion("warehouse_code in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotIn(List<String> values) {
            addCriterion("warehouse_code not in", values, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeBetween(String value1, String value2) {
            addCriterion("warehouse_code between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andWarehouseCodeNotBetween(String value1, String value2) {
            addCriterion("warehouse_code not between", value1, value2, "warehouseCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(String value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(String value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLike(String value) {
            addCriterion("shop_code like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotLike(String value) {
            addCriterion("shop_code not like", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<String> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeIsNull() {
            addCriterion("restaurant_code is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeIsNotNull() {
            addCriterion("restaurant_code is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeEqualTo(String value) {
            addCriterion("restaurant_code =", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeNotEqualTo(String value) {
            addCriterion("restaurant_code <>", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeGreaterThan(String value) {
            addCriterion("restaurant_code >", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_code >=", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeLessThan(String value) {
            addCriterion("restaurant_code <", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeLessThanOrEqualTo(String value) {
            addCriterion("restaurant_code <=", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeLike(String value) {
            addCriterion("restaurant_code like", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeNotLike(String value) {
            addCriterion("restaurant_code not like", value, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeIn(List<String> values) {
            addCriterion("restaurant_code in", values, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeNotIn(List<String> values) {
            addCriterion("restaurant_code not in", values, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeBetween(String value1, String value2) {
            addCriterion("restaurant_code between", value1, value2, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andRestaurantCodeNotBetween(String value1, String value2) {
            addCriterion("restaurant_code not between", value1, value2, "restaurantCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andDeskIdIsNull() {
            addCriterion("desk_id is null");
            return (Criteria) this;
        }

        public Criteria andDeskIdIsNotNull() {
            addCriterion("desk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeskIdEqualTo(String value) {
            addCriterion("desk_id =", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotEqualTo(String value) {
            addCriterion("desk_id <>", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdGreaterThan(String value) {
            addCriterion("desk_id >", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdGreaterThanOrEqualTo(String value) {
            addCriterion("desk_id >=", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdLessThan(String value) {
            addCriterion("desk_id <", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdLessThanOrEqualTo(String value) {
            addCriterion("desk_id <=", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdLike(String value) {
            addCriterion("desk_id like", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotLike(String value) {
            addCriterion("desk_id not like", value, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdIn(List<String> values) {
            addCriterion("desk_id in", values, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotIn(List<String> values) {
            addCriterion("desk_id not in", values, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdBetween(String value1, String value2) {
            addCriterion("desk_id between", value1, value2, "deskId");
            return (Criteria) this;
        }

        public Criteria andDeskIdNotBetween(String value1, String value2) {
            addCriterion("desk_id not between", value1, value2, "deskId");
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