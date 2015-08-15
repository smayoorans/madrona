package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.common.Student;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@Controller
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap modelMap) {
        modelMap.addAttribute("student", new Student());
        return "student/add";
    }

    @RequestMapping(value = "/insert-student", method = RequestMethod.POST)
    @ResponseBody
    public String onInsertStudentAction(@ModelAttribute Student student,
                                        @RequestParam("profile_picture") MultipartFile profilePicture) {

        String profileImageId = uploadService.upload(profilePicture);
        if(profileImageId != null){
            student.setProfilePicture(profileImageId);
        }
        boolean isSaved = studentService.save(student);

        return "redirect:/view-all-student";

    }

    @RequestMapping(value = "/view-student", method = RequestMethod.GET)
    public String onViewStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Student student = studentService.get(Long.parseLong(request.getParameter("id")));
        modelMap.addAttribute("student", student);

        return "student/view";
    }


    @RequestMapping(value = "/view-all-student", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap) {
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "student/view-all";
    }

}
