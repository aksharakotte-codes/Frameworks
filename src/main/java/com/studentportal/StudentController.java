package com.studentportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;

    @GetMapping("/student")
    String home() {
        return "student";
    }

    @GetMapping("/studentList")
    String getAllStudents() {
        return "student-list";
    }

    @PostMapping("/saveStudent")
    String saveStudent(@ModelAttribute Student student) {

        studentDAO.saveStudent(student);

        return "redirect:/studentList";
    }
}