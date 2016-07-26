package com.ht.extra.controller;

import com.ht.extra.pojo.Inpatient;
import com.ht.extra.service.InpatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Dell on 2016/7/26.
 */

@Controller
@RequestMapping("/Inpatient")
public class InpatientController {
    @Resource
    private InpatientService inpatientService;
    @RequestMapping("/showInp")
    public String showMsg(HttpServletRequest request, Model model){
        String ipid = request.getParameter("id");
        Inpatient inp = this.inpatientService.getInpatientByIpid(ipid);
        return "showInp";
    }

}
