package com.company.project.core.dao.auto;

import com.company.project.core.bean.auto.UserBean;
import com.company.project.core.bean.auto.UserBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface UserBeanMapper {
    int countByExample(UserBeanExample example);

    int deleteByExample(UserBeanExample example);

    @Delete({
        "delete from user",
        "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String userName);

    @Insert({
        "insert into user (user_name, password)",
        "values (#{userName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR})"
    })
    int insert(UserBean record);

    int insertSelective(UserBean record);

    List<UserBean> selectByExample(UserBeanExample example);

    @Select({
        "select",
        "user_name, password",
        "from user",
        "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    UserBean selectByPrimaryKey(String userName);

    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByPrimaryKeySelective(UserBean record);

    @Update({
        "update user",
        "set password = #{password,jdbcType=VARCHAR}",
        "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UserBean record);
}