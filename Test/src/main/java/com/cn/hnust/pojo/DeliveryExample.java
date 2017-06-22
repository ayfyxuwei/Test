package com.cn.hnust.pojo;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryExample() {
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

        public Criteria andDelIdIsNull() {
            addCriterion("del_id is null");
            return (Criteria) this;
        }

        public Criteria andDelIdIsNotNull() {
            addCriterion("del_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelIdEqualTo(Integer value) {
            addCriterion("del_id =", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotEqualTo(Integer value) {
            addCriterion("del_id <>", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdGreaterThan(Integer value) {
            addCriterion("del_id >", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_id >=", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdLessThan(Integer value) {
            addCriterion("del_id <", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdLessThanOrEqualTo(Integer value) {
            addCriterion("del_id <=", value, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdIn(List<Integer> values) {
            addCriterion("del_id in", values, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotIn(List<Integer> values) {
            addCriterion("del_id not in", values, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdBetween(Integer value1, Integer value2) {
            addCriterion("del_id between", value1, value2, "delId");
            return (Criteria) this;
        }

        public Criteria andDelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("del_id not between", value1, value2, "delId");
            return (Criteria) this;
        }

        public Criteria andDelNameIsNull() {
            addCriterion("del_name is null");
            return (Criteria) this;
        }

        public Criteria andDelNameIsNotNull() {
            addCriterion("del_name is not null");
            return (Criteria) this;
        }

        public Criteria andDelNameEqualTo(String value) {
            addCriterion("del_name =", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotEqualTo(String value) {
            addCriterion("del_name <>", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameGreaterThan(String value) {
            addCriterion("del_name >", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameGreaterThanOrEqualTo(String value) {
            addCriterion("del_name >=", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLessThan(String value) {
            addCriterion("del_name <", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLessThanOrEqualTo(String value) {
            addCriterion("del_name <=", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameLike(String value) {
            addCriterion("del_name like", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotLike(String value) {
            addCriterion("del_name not like", value, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameIn(List<String> values) {
            addCriterion("del_name in", values, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotIn(List<String> values) {
            addCriterion("del_name not in", values, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameBetween(String value1, String value2) {
            addCriterion("del_name between", value1, value2, "delName");
            return (Criteria) this;
        }

        public Criteria andDelNameNotBetween(String value1, String value2) {
            addCriterion("del_name not between", value1, value2, "delName");
            return (Criteria) this;
        }

        public Criteria andDelTelIsNull() {
            addCriterion("del_tel is null");
            return (Criteria) this;
        }

        public Criteria andDelTelIsNotNull() {
            addCriterion("del_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDelTelEqualTo(String value) {
            addCriterion("del_tel =", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelNotEqualTo(String value) {
            addCriterion("del_tel <>", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelGreaterThan(String value) {
            addCriterion("del_tel >", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelGreaterThanOrEqualTo(String value) {
            addCriterion("del_tel >=", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelLessThan(String value) {
            addCriterion("del_tel <", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelLessThanOrEqualTo(String value) {
            addCriterion("del_tel <=", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelLike(String value) {
            addCriterion("del_tel like", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelNotLike(String value) {
            addCriterion("del_tel not like", value, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelIn(List<String> values) {
            addCriterion("del_tel in", values, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelNotIn(List<String> values) {
            addCriterion("del_tel not in", values, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelBetween(String value1, String value2) {
            addCriterion("del_tel between", value1, value2, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelTelNotBetween(String value1, String value2) {
            addCriterion("del_tel not between", value1, value2, "delTel");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNull() {
            addCriterion("del_date is null");
            return (Criteria) this;
        }

        public Criteria andDelDateIsNotNull() {
            addCriterion("del_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelDateEqualTo(String value) {
            addCriterion("del_date =", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotEqualTo(String value) {
            addCriterion("del_date <>", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThan(String value) {
            addCriterion("del_date >", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateGreaterThanOrEqualTo(String value) {
            addCriterion("del_date >=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThan(String value) {
            addCriterion("del_date <", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLessThanOrEqualTo(String value) {
            addCriterion("del_date <=", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateLike(String value) {
            addCriterion("del_date like", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotLike(String value) {
            addCriterion("del_date not like", value, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateIn(List<String> values) {
            addCriterion("del_date in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotIn(List<String> values) {
            addCriterion("del_date not in", values, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateBetween(String value1, String value2) {
            addCriterion("del_date between", value1, value2, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDateNotBetween(String value1, String value2) {
            addCriterion("del_date not between", value1, value2, "delDate");
            return (Criteria) this;
        }

        public Criteria andDelDzIsNull() {
            addCriterion("del_dz is null");
            return (Criteria) this;
        }

        public Criteria andDelDzIsNotNull() {
            addCriterion("del_dz is not null");
            return (Criteria) this;
        }

        public Criteria andDelDzEqualTo(String value) {
            addCriterion("del_dz =", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzNotEqualTo(String value) {
            addCriterion("del_dz <>", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzGreaterThan(String value) {
            addCriterion("del_dz >", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzGreaterThanOrEqualTo(String value) {
            addCriterion("del_dz >=", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzLessThan(String value) {
            addCriterion("del_dz <", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzLessThanOrEqualTo(String value) {
            addCriterion("del_dz <=", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzLike(String value) {
            addCriterion("del_dz like", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzNotLike(String value) {
            addCriterion("del_dz not like", value, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzIn(List<String> values) {
            addCriterion("del_dz in", values, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzNotIn(List<String> values) {
            addCriterion("del_dz not in", values, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzBetween(String value1, String value2) {
            addCriterion("del_dz between", value1, value2, "delDz");
            return (Criteria) this;
        }

        public Criteria andDelDzNotBetween(String value1, String value2) {
            addCriterion("del_dz not between", value1, value2, "delDz");
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