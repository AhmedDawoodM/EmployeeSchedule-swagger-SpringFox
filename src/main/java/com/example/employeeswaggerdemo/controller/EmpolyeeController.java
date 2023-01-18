package com.example.employeeswaggerdemo.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpolyeeController {

    @ApiOperation(value = "Get the default schedule for employees", notes = "All employees share the same schedule.")
    @GetMapping("/employeev1/schedule")
    public String getSchedule1(){

        return "Your v1 schedule is M-F 9-5";
    }

    @ApiOperation(value = "Get the default schedule for employees", notes = "All employees share the same schedule.")
    @GetMapping("/employeev2/schedule")
    public String getSchedule2(){

        return "Your v2 schedule is M-W 9-9";
    }

    @ApiOperation(value = "Get the default schedule for employees", notes = "All employees share the same schedule.")
    @GetMapping("/employeev3/schedule")
    public String getSchedule3(){

        return "Your v3 schedule is T-F 8-6";
    }
}
