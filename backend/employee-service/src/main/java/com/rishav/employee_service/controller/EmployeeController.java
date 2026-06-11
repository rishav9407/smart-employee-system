package com.rishav.employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping("/hello")
    public String hello() {
        return "Employee Service Running Nice work Rishav";
    }
}