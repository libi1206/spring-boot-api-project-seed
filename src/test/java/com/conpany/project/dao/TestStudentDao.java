package com.conpany.project.dao;

import com.company.project.core.bean.auto.StudentExampleBean;
import com.company.project.core.dao.auto.StudentExampleBeanMapper;
import com.conpany.project.Tester;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-04-03 11:07
 */

@Slf4j
public class TestStudentDao extends Tester {
    @Autowired
    StudentExampleBeanMapper studentExampleBeanMapper;

    @Test
    public void testDao() {
        StudentExampleBean student = new StudentExampleBean();
        student.setId("1161020054");
        student.setName("libi");
        student.setLevel(4);
        student.setMajor("计算机科学与技术");

        studentExampleBeanMapper.insertSelective(student);
        log.info("插入完成");
    }

}
