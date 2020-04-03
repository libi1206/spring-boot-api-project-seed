package com.company.project.core.dao.auto;

import com.company.project.core.bean.auto.RecordBean;
import com.company.project.core.bean.auto.RecordBeanExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface RecordBeanMapper {
    int countByExample(RecordBeanExample example);

    int deleteByExample(RecordBeanExample example);

    @Delete({
        "delete from record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into record (id, student_id, ",
        "time_lenth, week_num, ",
        "create_time, screenshot)",
        "values (#{id,jdbcType=INTEGER}, #{studentId,jdbcType=VARCHAR}, ",
        "#{timeLenth,jdbcType=INTEGER}, #{weekNum,jdbcType=INTEGER}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{screenshot,jdbcType=LONGVARCHAR})"
    })
    int insert(RecordBean record);

    int insertSelective(RecordBean record);

    List<RecordBean> selectByExampleWithBLOBs(RecordBeanExample example);

    List<RecordBean> selectByExample(RecordBeanExample example);

    @Select({
        "select",
        "id, student_id, time_lenth, week_num, create_time, screenshot",
        "from record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    RecordBean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByExampleWithBLOBs(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByExample(@Param("record") RecordBean record, @Param("example") RecordBeanExample example);

    int updateByPrimaryKeySelective(RecordBean record);

    @Update({
        "update record",
        "set student_id = #{studentId,jdbcType=VARCHAR},",
          "time_lenth = #{timeLenth,jdbcType=INTEGER},",
          "week_num = #{weekNum,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "screenshot = #{screenshot,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(RecordBean record);

    @Update({
        "update record",
        "set student_id = #{studentId,jdbcType=VARCHAR},",
          "time_lenth = #{timeLenth,jdbcType=INTEGER},",
          "week_num = #{weekNum,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(RecordBean record);
}