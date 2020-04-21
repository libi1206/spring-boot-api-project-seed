package com.company.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.company.project.core.constent.ProjectConstant.*;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {MAPPER_PACKAGE})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

