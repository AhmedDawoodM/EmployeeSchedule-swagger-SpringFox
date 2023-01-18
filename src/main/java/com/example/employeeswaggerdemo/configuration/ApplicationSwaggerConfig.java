package com.example.employeeswaggerdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ApplicationSwaggerConfig {

    @Bean
    public Docket employeeApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo("v1"));
    }

    @Bean
    public Docket employeeApi1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("employee-api-v1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.employeeswaggerdemo"))
                .paths(PathSelectors.ant("/employeev1/**"))
                .build()
                .apiInfo(getApiInfo("v1"));
    }

    @Bean
    public Docket employeeApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("employee-api-v2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.employeeswaggerdemo"))
                .paths(PathSelectors.ant("/employeev2/**"))
                .build()
                .apiInfo(getApiInfo("v2"));
    }

    @Bean
    public Docket employeeApi3() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("employee-api-v3")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.employeeswaggerdemo"))
                .paths(PathSelectors.ant("/employeev3/**"))
                .build()
                .apiInfo(getApiInfo("v3"));
    }


    //create api metadata that goes at the top of the generated page
    private ApiInfo getApiInfo(String version){
        return new ApiInfoBuilder()
                .title("Employee API")
                .version(version)
                .description("API for managing Employees")
                .contact(new Contact("Ahmed Dawood", "https://www.facebook.com/ADawo0od/", "ahmeddawood9898@gmail.com"))
                .license("Apache License Version 2.0")
                .build();
    }

}
