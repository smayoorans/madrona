package org.madrona.web.controller;

import org.madrona.common.Student;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

    @Autowired
    public StudentService studentService;

    @RequestMapping("/student/register")
    public String showRegisterStudentPage() {
        return "student/register-student";
    }

    @RequestMapping(name = "/student/register-action", method = RequestMethod.POST)
    public String registerStudent(HttpServletRequest request) {
        Student student = new Student();
        student.setEmailAddress(request.getParameter("email-address"));
        student.setMobileNumber(request.getParameter("mobile-number"));
        //TODO: Need to validate student details before inserting
        studentService.insert(student);
        return "redirect:student/register";
    }
}
