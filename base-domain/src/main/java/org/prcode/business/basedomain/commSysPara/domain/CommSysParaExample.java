package org.prcode.business.basedomain.commSysPara.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommSysParaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public CommSysParaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
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
            addCriterion("commSysPara.f_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("commSysPara.f_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("commSysPara.f_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("commSysPara.f_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("commSysPara.f_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("commSysPara.f_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("commSysPara.f_id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("commSysPara.f_id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("commSysPara.f_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("commSysPara.f_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("commSysPara.f_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeIsNull() {
            addCriterion("commSysPara.f_sys_para_code is null");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeIsNotNull() {
            addCriterion("commSysPara.f_sys_para_code is not null");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_code =", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_code <>", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_para_code >", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_code >=", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeLessThan(String value) {
            addCriterion("commSysPara.f_sys_para_code <", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_code <=", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeLike(String value) {
            addCriterion("commSysPara.f_sys_para_code like", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeNotLike(String value) {
            addCriterion("commSysPara.f_sys_para_code not like", value, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_code in", values, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_code not in", values, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_code between", value1, value2, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaCodeNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_code not between", value1, value2, "sysParaCode");
            return (Criteria) this;
        }

        public Criteria andSysParaValueIsNull() {
            addCriterion("commSysPara.f_sys_para_value is null");
            return (Criteria) this;
        }

        public Criteria andSysParaValueIsNotNull() {
            addCriterion("commSysPara.f_sys_para_value is not null");
            return (Criteria) this;
        }

        public Criteria andSysParaValueEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_value =", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_value <>", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_para_value >", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_value >=", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueLessThan(String value) {
            addCriterion("commSysPara.f_sys_para_value <", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_value <=", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueLike(String value) {
            addCriterion("commSysPara.f_sys_para_value like", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueNotLike(String value) {
            addCriterion("commSysPara.f_sys_para_value not like", value, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_value in", values, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_value not in", values, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_value between", value1, value2, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaValueNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_value not between", value1, value2, "sysParaValue");
            return (Criteria) this;
        }

        public Criteria andSysParaDescIsNull() {
            addCriterion("commSysPara.f_sys_para_desc is null");
            return (Criteria) this;
        }

        public Criteria andSysParaDescIsNotNull() {
            addCriterion("commSysPara.f_sys_para_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSysParaDescEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_desc =", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_desc <>", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_para_desc >", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_desc >=", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescLessThan(String value) {
            addCriterion("commSysPara.f_sys_para_desc <", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_para_desc <=", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescLike(String value) {
            addCriterion("commSysPara.f_sys_para_desc like", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescNotLike(String value) {
            addCriterion("commSysPara.f_sys_para_desc not like", value, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_desc in", values, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_para_desc not in", values, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_desc between", value1, value2, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysParaDescNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_para_desc not between", value1, value2, "sysParaDesc");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeIsNull() {
            addCriterion("commSysPara.f_sys_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeIsNotNull() {
            addCriterion("commSysPara.f_sys_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_add_time =", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeNotEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_add_time <>", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeGreaterThan(Date value) {
            addCriterion("commSysPara.f_sys_add_time >", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_add_time >=", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeLessThan(Date value) {
            addCriterion("commSysPara.f_sys_add_time <", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_add_time <=", value, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_add_time in", values, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeNotIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_add_time not in", values, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_add_time between", value1, value2, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_add_time not between", value1, value2, "sysAddTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeIsNull() {
            addCriterion("commSysPara.f_sys_upd_time is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeIsNotNull() {
            addCriterion("commSysPara.f_sys_upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_upd_time =", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeNotEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_upd_time <>", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeGreaterThan(Date value) {
            addCriterion("commSysPara.f_sys_upd_time >", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_upd_time >=", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeLessThan(Date value) {
            addCriterion("commSysPara.f_sys_upd_time <", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_upd_time <=", value, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_upd_time in", values, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeNotIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_upd_time not in", values, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_upd_time between", value1, value2, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_upd_time not between", value1, value2, "sysUpdTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeIsNull() {
            addCriterion("commSysPara.f_sys_del_time is null");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeIsNotNull() {
            addCriterion("commSysPara.f_sys_del_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_del_time =", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeNotEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_del_time <>", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeGreaterThan(Date value) {
            addCriterion("commSysPara.f_sys_del_time >", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_del_time >=", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeLessThan(Date value) {
            addCriterion("commSysPara.f_sys_del_time <", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("commSysPara.f_sys_del_time <=", value, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_del_time in", values, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeNotIn(List<Date> values) {
            addCriterion("commSysPara.f_sys_del_time not in", values, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_del_time between", value1, value2, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("commSysPara.f_sys_del_time not between", value1, value2, "sysDelTime");
            return (Criteria) this;
        }

        public Criteria andSysAddUserIsNull() {
            addCriterion("commSysPara.f_sys_add_user is null");
            return (Criteria) this;
        }

        public Criteria andSysAddUserIsNotNull() {
            addCriterion("commSysPara.f_sys_add_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysAddUserEqualTo(String value) {
            addCriterion("commSysPara.f_sys_add_user =", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_add_user <>", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_add_user >", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_add_user >=", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserLessThan(String value) {
            addCriterion("commSysPara.f_sys_add_user <", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_add_user <=", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserLike(String value) {
            addCriterion("commSysPara.f_sys_add_user like", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserNotLike(String value) {
            addCriterion("commSysPara.f_sys_add_user not like", value, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserIn(List<String> values) {
            addCriterion("commSysPara.f_sys_add_user in", values, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_add_user not in", values, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_add_user between", value1, value2, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysAddUserNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_add_user not between", value1, value2, "sysAddUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserIsNull() {
            addCriterion("commSysPara.f_sys_upd_user is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserIsNotNull() {
            addCriterion("commSysPara.f_sys_upd_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserEqualTo(String value) {
            addCriterion("commSysPara.f_sys_upd_user =", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_upd_user <>", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_upd_user >", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_upd_user >=", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserLessThan(String value) {
            addCriterion("commSysPara.f_sys_upd_user <", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_upd_user <=", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserLike(String value) {
            addCriterion("commSysPara.f_sys_upd_user like", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserNotLike(String value) {
            addCriterion("commSysPara.f_sys_upd_user not like", value, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserIn(List<String> values) {
            addCriterion("commSysPara.f_sys_upd_user in", values, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_upd_user not in", values, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_upd_user between", value1, value2, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdUserNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_upd_user not between", value1, value2, "sysUpdUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserIsNull() {
            addCriterion("commSysPara.f_sys_del_user is null");
            return (Criteria) this;
        }

        public Criteria andSysDelUserIsNotNull() {
            addCriterion("commSysPara.f_sys_del_user is not null");
            return (Criteria) this;
        }

        public Criteria andSysDelUserEqualTo(String value) {
            addCriterion("commSysPara.f_sys_del_user =", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserNotEqualTo(String value) {
            addCriterion("commSysPara.f_sys_del_user <>", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserGreaterThan(String value) {
            addCriterion("commSysPara.f_sys_del_user >", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserGreaterThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_del_user >=", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserLessThan(String value) {
            addCriterion("commSysPara.f_sys_del_user <", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserLessThanOrEqualTo(String value) {
            addCriterion("commSysPara.f_sys_del_user <=", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserLike(String value) {
            addCriterion("commSysPara.f_sys_del_user like", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserNotLike(String value) {
            addCriterion("commSysPara.f_sys_del_user not like", value, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserIn(List<String> values) {
            addCriterion("commSysPara.f_sys_del_user in", values, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserNotIn(List<String> values) {
            addCriterion("commSysPara.f_sys_del_user not in", values, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_del_user between", value1, value2, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelUserNotBetween(String value1, String value2) {
            addCriterion("commSysPara.f_sys_del_user not between", value1, value2, "sysDelUser");
            return (Criteria) this;
        }

        public Criteria andSysDelStateIsNull() {
            addCriterion("commSysPara.f_sys_del_state is null");
            return (Criteria) this;
        }

        public Criteria andSysDelStateIsNotNull() {
            addCriterion("commSysPara.f_sys_del_state is not null");
            return (Criteria) this;
        }

        public Criteria andSysDelStateEqualTo(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state =", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateNotEqualTo(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state <>", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateGreaterThan(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state >", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state >=", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateLessThan(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state <", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateLessThanOrEqualTo(Boolean value) {
            addCriterion("commSysPara.f_sys_del_state <=", value, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateIn(List<Boolean> values) {
            addCriterion("commSysPara.f_sys_del_state in", values, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateNotIn(List<Boolean> values) {
            addCriterion("commSysPara.f_sys_del_state not in", values, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateBetween(Boolean value1, Boolean value2) {
            addCriterion("commSysPara.f_sys_del_state between", value1, value2, "sysDelState");
            return (Criteria) this;
        }

        public Criteria andSysDelStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("commSysPara.f_sys_del_state not between", value1, value2, "sysDelState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_comm_sys_para
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andDeleted(boolean deleted) {
            return deleted ? andSysDelStateEqualTo(CommSysPara.DEL_FLAG_OFF) : andSysDelStateNotEqualTo(CommSysPara.DEL_FLAG_OFF);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_comm_sys_para
     *
     * @mbg.generated
     */
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