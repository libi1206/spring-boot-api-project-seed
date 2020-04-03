package com.company.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.company.project.core.constent.ProjectConstant.*;

@SpringBootApplication
@MapperScan(basePackages = {MAPPER_PACKAGE})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

