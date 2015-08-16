package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.common.Address;
import org.madrona.common.Grade;
import org.madrona.common.Student;
import org.madrona.core.service.GradeService;
import org.madrona.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class StudentController {

    private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/add-student", method = RequestMethod.GET)
    public String showAddStudentPage(ModelMap modelMap) {
        List<Grade> gradeList = gradeService.getAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("student", new Student());
        return "student/add";
    }

    @RequestMapping(value = "/insert-student", method = RequestMethod.POST)
    public String onInsertStudentAction(@ModelAttribute Student student,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

        Grade grade = gradeService.get(Long.parseLong(gradeId));
        student.setGrade(grade);
        String profileImageId = uploadService.upload(profilePicture);
        if (profileImageId != null) {
            student.setProfilePicture(profileImageId);
        }

        // Assigning student to address
        Address address = student.getHomeAddress();
        address.setStudent(student);
        student.setHomeAddress(address);

        boolean isSaved = studentService.save(student);
        if (isSaved) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-student";

    }

    @RequestMapping(value = "/view-student", method = RequestMethod.GET)
    public String onViewStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Student student = studentService.get(Long.parseLong(request.getParameter("id")));
        List<Grade> gradeList = gradeService.getAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("student", student);
        return "student/view";
    }

    @RequestMapping(value = "/update-student", method = RequestMethod.POST)
    public String onUpdateStudentAction(@ModelAttribute Student student,
                                        @RequestParam("profile_picture") MultipartFile profilePicture,
                                        @RequestParam("gradeId") String gradeId,
                                        RedirectAttributes redirectAttributes) {

        //Assigning Grade
        Grade grade = gradeService.get(Long.parseLong(gradeId));
        grade.getStudents().add(student);
        student.setGrade(grade);

        String profileImageId = uploadService.upload(profilePicture);

        if (profileImageId != null) {
            student.setProfilePicture(profileImageId);
        }

        boolean isSaved = studentService.update(student);

        if (isSaved) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-student";

    }

    @RequestMapping(value = "/view-all-student", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap) {
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "student/view-all";
    }

    @RequestMapping(value = "/add-student-to-class", method = RequestMethod.GET)
    public String onAddStudentToClasses(ModelMap modelMap) {
        List<Student> students = studentService.getAll();
        modelMap.addAttribute("students", students);
        return "student/add-student-to-class";
    }

    @RequestMapping(value = "/delete-student", method = RequestMethod.POST)
    public String onDeleteStudentAction(@RequestParam("id") String id, ModelMap modelMap) {
        LOGGER.info("Deleting student details from the system.");
        int delete = studentService.delete(Long.parseLong(id));
        if (delete == 1) {
            modelMap.addAttribute("delete-success", true);
        } else modelMap.addAttribute("delete-failure", true);
        return "redirect:/view-all-student";

    }
}
