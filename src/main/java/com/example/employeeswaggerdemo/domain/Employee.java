package com.example.employeeswaggerdemo.domain;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@EqualsAndHashCode
@Import(BeanValidatorPluginsConfiguration.class)
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    @ApiModelProperty(value = "First and last name")
    public String name;

    public String title;

    @ApiModelProperty(value = "Description", required = true)
    @NotNull
    public String department;

    public Employee() {
    }

    public Employee(String name, String title, String department) {
        this.name = name;
        this.title = title;
        this.department = department;
    }
}
