package com.company.project.service;

import com.company.project.core.model.StudentDTO;
import com.company.project.response.BaseResult;

/**
 * @author :Libi
 * @version :1.0
 * @date :2020-04-03 14:56
 *
 */
public interface ExampleService {
    BaseResult addStudent(StudentDTO studentDTO);

    BaseResult selectStudent(String studentId);
}
