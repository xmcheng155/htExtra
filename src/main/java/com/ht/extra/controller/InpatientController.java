package com.ht.extra.controller;

import com.alibaba.fastjson.JSON;
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
@RequestMapping("/inpatient")
public class InpatientController {
    @Resource
    private InpatientService inpatientService;
    @RequestMapping("/showInp")
    public String showMsg(HttpServletRequest request, Model model){
        String ipid = request.getParameter("id");
        System.out.println("ipid==>"+ipid);
        Inpatient inp = inpatientService.getInpatientByIpid("ZY010016118941");
        System.out.println(JSON.toJSONString(inp));
        model.addAttribute("inp",inp);
        return "showInp";
    }

}
