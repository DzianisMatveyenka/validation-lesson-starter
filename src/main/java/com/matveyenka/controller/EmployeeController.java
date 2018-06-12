package com.matveyenka.controller;

import com.matveyenka.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employee")
    public String showEmployeePage(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee";
    }

    @PostMapping("/employee")
    public String saveEmployee(Employee employee) {
        System.out.println(employee);
        return "employee";
    }
}
