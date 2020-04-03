package com.conpany.project.dao;

import com.company.project.Application;
import com.company.project.core.bean.auto.StudentBean;
import com.company.project.core.dao.auto.StudentBeanMapper;
import com.conpany.project.Tester;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-04-03 11:07
 */

public class TestStudentDao extends Tester {
    @Autowired
    StudentBeanMapper studentBeanMapper;

    @Test
    public void testDao() {
        StudentBean bean = new StudentBean();
        bean.setId("11611111");
        bean.setClub("123");
        bean.setMajor("3321");
        bean.setName("阿比");
        studentBeanMapper.insert(bean);
    }

}
