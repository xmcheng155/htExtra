package com.ht.extra.controller;

import com.alibaba.fastjson.JSON;
import com.ht.extra.pojo.Inpatient;
import com.ht.extra.service.InpatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    @RequestMapping("/showInps")
    public String showInpsmsg(HttpServletRequest request, Model model){
        String time1 = request.getParameter("id");
        String time2 = request.getParameter("id");
        List<Inpatient> inps = inpatientService.getInpaientsByOutTime("20160728071010","20160728101010");
        model.addAttribute("inps",inps);
        return "showInps";
    }
    @ResponseBody
    @RequestMapping("/showInpsJstl")
    public String showInpsJstl(HttpServletRequest request, Model model){
        String time1 = request.getParameter("id");
        String time2 = request.getParameter("id");
        List<Inpatient> inps = inpatientService.getInpaientsByOutTime("20160728071010","20160728101010");
        return JSON.toJSONString(inps);
    }
}
