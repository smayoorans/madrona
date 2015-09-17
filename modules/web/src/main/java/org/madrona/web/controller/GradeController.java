package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.web.model.Grade;
import org.madrona.web.model.Student;
import org.madrona.web.repo.GradeRepository;
import org.madrona.web.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

;

@Controller
public class GradeController {

    private static final Logger LOGGER = LogManager.getLogger(GradeController.class);

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/add-grade", method = RequestMethod.GET)
    public String showAddGradePage(ModelMap modelMap) {
        modelMap.addAttribute("grade", new Grade());
        return "grade/add";
    }

    @RequestMapping(value = "/insert-grade", method = RequestMethod.POST)
    public String onInsertGradeAction(@ModelAttribute Grade grade) {
        gradeRepository.save(grade);
        return "redirect:/view-all-grade";

    }

    @RequestMapping(value = "/view-grade", method = RequestMethod.GET)
    public String onViewGrade(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Grade grade = gradeRepository.findOne(request.getParameter("id"));

        List<Student> students = studentRepository.findByCurrentGradeName(grade.getName());

        modelMap.addAttribute("students", students);
        modelMap.addAttribute("grade", grade);
        return "grade/view";
    }


    @RequestMapping(value = "/view-all-grade", method = RequestMethod.GET)
    public String onViewAllStudents(HttpServletRequest request, ModelMap modelMap) {
        List<Grade> grades = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("grades", grades);
        return "grade/view-all";
    }

    @RequestMapping(value = "/update-grade", method = RequestMethod.POST)
    public String onUpdateGradeAction(@ModelAttribute Grade grade, RedirectAttributes redirectAttributes) {
        Grade updatedGrade = gradeRepository.save(grade);
        if (updatedGrade != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-grade";

    }


}
