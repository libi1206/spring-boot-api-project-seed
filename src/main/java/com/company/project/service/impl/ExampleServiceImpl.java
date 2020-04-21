package com.company.project.service.impl;

import com.company.project.core.bean.auto.StudentBean;
import com.company.project.core.constent.Code;
import com.company.project.core.dao.auto.StudentBeanMapper;
import com.company.project.core.exception.BusinessException;
import com.company.project.core.model.StudentDTO;
import com.company.project.response.BaseResult;
import com.company.project.response.BaseResultFactory;
import com.company.project.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-04-03 15:24
 */
@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    private StudentBeanMapper studentBeanMapper;

    @Override
    public BaseResult addStudent(StudentDTO studentDTO) {
        StudentBean bean = new StudentBean();

        bean.setName(studentDTO.getName());
        bean.setId(studentDTO.getStudentId());
        bean.setMajor(studentDTO.getMajor());
        bean.setClub(studentDTO.getClub());

        studentBeanMapper.insert(bean);
        return BaseResultFactory.produceResult(Code.SUCCESS, bean);
    }

    @Override
    public BaseResult selectStudent(String studentId) {
        StudentBean bean = studentBeanMapper.selectByPrimaryKey(studentId);
        //异常可以直接抛出，有已成处理器进行统一处理
        if (bean == null) {
            throw new BusinessException(Code.ERROR);
        }
        return BaseResultFactory.produceResult(Code.SUCCESS, bean);
    }

}
