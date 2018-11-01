package com.zzq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BaseController {

    @RequestMapping("/get")
    public String save(Model model){

        model.addAttribute("name","zhangzq");

        return "/WEB-INF/index.jsp";
    }
}
