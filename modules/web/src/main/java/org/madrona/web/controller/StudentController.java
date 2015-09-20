package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.web.model.Grade;
import org.madrona.web.model.Student;
import org.madrona.web.repo.GradeRepository;
import org.madrona.web.repo.StudentRepository;
import org.madrona.web.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentController.class);
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap modelMap) {
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("student", new Student());
        return "student/add";
    }

    @RequestMapping(value = "/add-student-action", method = RequestMethod.POST)
    public String onInsertStudentAction(@ModelAttribute Student student,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

        Grade grade = gradeRepository.findOne(gradeId);
        System.out.println("Getting grade" + grade);
        student.setCurrentGrade(grade);
        /*
        String profileImageId = uploadService.upload(profilePicture);
        if (profileImageId != null) {
            student.setProfilePicture(profileImageId);
        }*/

        Student savedStudent = studentRepository.save(student);
        if (savedStudent != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/add-parent";

    }

    @RequestMapping(value = "/view-student", method = RequestMethod.GET)
    public String onViewStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Student student = studentRepository.findOne(request.getParameter("id"));
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("student", student);
        return "student/view";
    }

    @RequestMapping(value = "/update-student", method = RequestMethod.POST)
    public String onUpdateStudentAction(@ModelAttribute Student student,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

        Grade grade = gradeRepository.findOne(gradeId);
        student.setCurrentGrade(grade);

//        String profileImageId = uploadService.upload(profilePicture);
//        if (profileImageId != null) {
//            student.setProfilePicture(profileImageId);
//        }

        Student updatedStudent = studentRepository.save(student);

        if (updatedStudent != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-student";

    }

    @RequestMapping(value = "/view-all-student", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap) {
        List<Student> students = (List<Student>) studentRepository.findAll();
        modelMap.addAttribute("students", students);
        return "student/view-all";
    }

    @RequestMapping(value = "/add-student-to-class", method = RequestMethod.GET)
    public String onAddStudentToClasses(ModelMap modelMap) {

        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);

        List<Student> students = (List<Student>) studentRepository.findAll();
        modelMap.addAttribute("students", students);
        return "student/add-student-to-class";
    }

    @RequestMapping(value = "/get-student-by-grade-id", method = RequestMethod.GET)
    @ResponseBody
    public List<Student> getStudentByGradeId(@RequestParam("gradeId") String gradeId) {
        return studentRepository.findByCurrentGradeName(gradeId);
    }


    @RequestMapping(value = "/delete-student", method = RequestMethod.POST)
    public String onDeleteStudentAction(@RequestParam("id") String id, ModelMap modelMap) {
        LOGGER.info("Deleting student details from the system.");
        try {
            studentRepository.delete(id);
            modelMap.addAttribute("delete-success", true);
            return "redirect:/view-all-student";
        } catch (Exception e) {
            modelMap.addAttribute("delete-failure", true);
            return "redirect:/view-all-student";
        }
    }
}
