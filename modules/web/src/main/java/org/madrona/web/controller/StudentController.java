package org.madrona.web.controller;

import org.madrona.common.Student;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

    @Autowired
    public StudentService studentService;

    @RequestMapping("/student/register")
    public String showRegisterStudentPage(){
        return "student/register-student";
    }

    @RequestMapping(name = "/student/register-action", method = RequestMethod.POST)
    public String registerStudent(){
        Student student = new Student();
        student.setFirstName("Mayooran");
        studentService.insert(student);
        return "student/register-student";
    }
}
