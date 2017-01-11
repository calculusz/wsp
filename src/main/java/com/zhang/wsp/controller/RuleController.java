package com.zhang.wsp.controller;

import com.zhang.wsp.POJO.Rule_POJO;
import com.zhang.wsp.dao.RuleDao;
import com.zhang.wsp.model.Rule;
import com.zhang.wsp.service.RuleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhang on 2016/11/25.
 */
@Controller
@RequestMapping("")
public class RuleController {

    @Resource
    public RuleDao ruleDao;
    @RequestMapping("/addrule.html")
    String view(){
        return "addrule";
    }
    @RequestMapping("/addrule")
    @ResponseBody
    public String addrule(@RequestParam(value = "username",required = false) String rulename,
                          @RequestParam(value = "describe",required = false) String describe,
                          HttpServletRequest request){
        if(rulename!=null) {
            ruleDao.addRule(describe, rulename);

            return "success";
        }
        else
            return "fail";
    }
    @RequestMapping("/rule1.html")
    public String showRule(HttpServletRequest request,Model model){
        List<Rule> list=ruleDao.selectAllRule();
        model.addAttribute("rule",list);

        return "rule";
    }
    @RequestMapping(value = "refresh.do",method = RequestMethod.GET)
    public @ResponseBody Rule_POJO showRule2(){

        List<Rule> list=ruleDao.selectAllRule();
        Rule_POJO rp=new Rule_POJO(list);

        return rp;
    }

//    @RequestMapping("/show")
//    public String showRuled(HttpServletRequest request, Model model){
//        List<Rule> list= ruleDao.selectAllRule();
//        ruleDao.addRule("jingdong","京东");
//        return "success";
//    }


}
