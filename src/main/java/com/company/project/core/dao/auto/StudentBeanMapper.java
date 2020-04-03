package com.company.project.core.dao.auto;

import com.company.project.core.bean.auto.StudentBean;
import com.company.project.core.bean.auto.StudentBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentBeanMapper {
    int countByExample(StudentBeanExample example);

    int deleteByExample(StudentBeanExample example);

    @Delete({
        "delete from student",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into student (id, name, ",
        "club, major)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=LONGVARCHAR}, ",
        "#{club,jdbcType=LONGVARCHAR}, #{major,jdbcType=LONGVARCHAR})"
    })
    int insert(StudentBean record);

    int insertSelective(StudentBean record);

    List<StudentBean> selectByExampleWithBLOBs(StudentBeanExample example);

    List<StudentBean> selectByExample(StudentBeanExample example);

    @Select({
        "select",
        "id, name, club, major",
        "from student",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("ResultMapWithBLOBs")
    StudentBean selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StudentBean record, @Param("example") StudentBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") StudentBean record, @Param("example") StudentBeanExample example);

    int updateByExample(@Param("record") StudentBean record, @Param("example") StudentBeanExample example);

    int updateByPrimaryKeySelective(StudentBean record);

    @Update({
        "update student",
        "set name = #{name,jdbcType=LONGVARCHAR},",
          "club = #{club,jdbcType=LONGVARCHAR},",
          "major = #{major,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(StudentBean record);
}