package org.prcode.business.basedomain.loginLog.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.prcode.business.basedomain.loginLog.domain.LoginLog;
import org.prcode.business.basedomain.loginLog.domain.LoginLogExample;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    long countByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int insert(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int insertSelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    List<LoginLog> selectByExample(LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    LoginLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LoginLog record, @Param("example") LoginLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_login_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginLog record);
}