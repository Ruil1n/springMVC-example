package cn.rui0.controller;

import cn.rui0.model.Student;
import cn.rui0.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Ruilin on 2018/7/5.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value={"/test"})
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("student",studentService.getStudent(3));
        return "test";
    }
}
