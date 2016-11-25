package com.zhang.wsp.controller;

import com.zhang.wsp.dao.RuleDao;
import com.zhang.wsp.model.Rule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zhang on 2016/11/25.
 */
@Controller
@RequestMapping("/rule")
public class RuleController {

    @Resource
    public RuleDao ruleDao;

    @RequestMapping("/show")
    public String showRule(HttpServletRequest request, Model model){
        List<Rule> list= ruleDao.selectAllRule();
        return "success";
    }


}
