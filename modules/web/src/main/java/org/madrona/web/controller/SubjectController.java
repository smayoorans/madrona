package org.madrona.web.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.madrona.web.model.Grade;
import org.madrona.web.model.Subjects;
import org.madrona.web.repo.GradeRepository;
import org.madrona.web.repo.StaffRepository;
import org.madrona.web.repo.SubjectRepository;
import org.madrona.web.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class SubjectController {

    private static final Logger LOGGER = LogManager.getLogger(SubjectController.class);
    @Autowired
    StaffRepository staffRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    MongoOperations mongoOperations;

    @RequestMapping(value = "/add-subject", method = RequestMethod.GET)
    public String showAddSubjectPage(ModelMap modelMap) {
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("subject", new Subjects());
        return "subject/add";
    }

    @RequestMapping(value = "/add-subject-action", method = RequestMethod.POST)
    public String onInsertStaffAction(@ModelAttribute Subjects subjects, RedirectAttributes redirectAttributes) {
        Subjects savedSubject = subjectRepository.save(subjects);
        if (savedSubject != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-subject";

    }

    @RequestMapping(value = "/view-subject", method = RequestMethod.GET)
    public String onViewStaff(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Subjects subject = subjectRepository.findOne(request.getParameter("id"));
        List<Grade> gradeList = (List<Grade>) gradeRepository.findAll();
        modelMap.addAttribute("gradeList", gradeList);
        modelMap.addAttribute("subject", subject);
        return "subject/view";
    }

    @RequestMapping(value = "/update-subject", method = RequestMethod.POST)
    public String onUpdateStaffAction(@ModelAttribute Subjects subjects,
                                      RedirectAttributes redirectAttributes) {

        Subjects updatedSubjects = subjectRepository.save(subjects);

        if (updatedSubjects != null) {
            redirectAttributes.addAttribute("success", true);
        } else redirectAttributes.addAttribute("error", true);

        return "redirect:/view-all-subject";

    }

    @RequestMapping(value = "/view-all-subject", method = RequestMethod.GET)
    public String onViewAllStaffs(HttpServletRequest request, ModelMap modelMap) {
        List<Subjects> subjects = (List<Subjects>) subjectRepository.findAll();
        modelMap.addAttribute("subjects", subjects);
        return "subject/view-all";
    }


    @RequestMapping(value = "/delete-subject", method = RequestMethod.POST)
    public String onDeleteStaffAction(@RequestParam("id") String id, ModelMap modelMap) {
        LOGGER.info("Deleting staff details from the system.");
        try {
            staffRepository.delete(id);
            modelMap.addAttribute("delete-success", true);
            return "redirect:/view-all-staff";
        } catch (Exception e) {
            modelMap.addAttribute("delete-failure", true);
            return "redirect:/view-all-staff";
        }
    }
}
