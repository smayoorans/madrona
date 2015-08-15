package org.madrona.web.controller;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.common.Student;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap modelMap) {
        modelMap.addAttribute("student", new Student());
        return "student/add";
    }

    @RequestMapping(value = "/insert-student", method = RequestMethod.POST)
    public String onInsertStudentAction(@ModelAttribute Student student){
        boolean isSaved = studentService.save(student);
        return "dash-board";
    }

    @RequestMapping(value = "/view-student", method = RequestMethod.GET)
    public String onViewStudent(HttpServletRequest request, ModelMap modelMap){
        Student student = studentService.get(Long.parseLong(request.getParameter("id")));
        modelMap.addAttribute("student", student);
        return "student/view";
    }


    @RequestMapping(value = "/view-all-student", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap){
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "student/view-all";
    }

}
