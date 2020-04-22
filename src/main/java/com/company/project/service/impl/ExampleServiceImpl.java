package com.company.project.service.impl;

import com.company.project.core.bean.auto.StudentExampleBean;
import com.company.project.core.constent.Code;
import com.company.project.core.dao.auto.StudentExampleBeanMapper;
import com.company.project.core.exception.BusinessException;
import com.company.project.core.model.StudentDTO;
import com.company.project.core.response.BaseResult;
import com.company.project.core.response.BaseResultFactory;
import com.company.project.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-04-03 15:24
 */
@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    private StudentExampleBeanMapper studentExampleBeanMapper;

    @Override
    public BaseResult addStudent(StudentDTO studentDTO) {
        StudentExampleBean bean = new StudentExampleBean();
        bean.setId(studentDTO.getStudentId());
        bean.setMajor(studentDTO.getMajor());
        bean.setLevel(studentDTO.getLevel());
        bean.setName(studentDTO.getName());

        studentExampleBeanMapper.insertSelective(bean);
        return BaseResultFactory.produceResult(Code.SUCCESS, bean);
    }

    @Override
    public BaseResult selectStudent(String studentId) {
        StudentExampleBean bean = studentExampleBeanMapper.selectByPrimaryKey(studentId);
        if (ObjectUtils.isEmpty(bean)) {
            throw new BusinessException(Code.ERROR);
        }
        return BaseResultFactory.produceResult(Code.SUCCESS, bean);
    }

}
