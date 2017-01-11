package com.zhang.wsp.service.impl;

import com.zhang.wsp.dao.RuleDao;
import com.zhang.wsp.model.Rule;
import com.zhang.wsp.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhang on 2016/11/28.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RuleServiceImpl  implements RuleService{

    @Resource
    private RuleDao ruleDao;


    public List<Rule> getAllRule(){
     return ruleDao.selectAllRule();
    }
    public void addRule(String description,String name){
       ruleDao.addRule(description,name);
    }
    public void delRule(int id){
        ruleDao.delRule(id);
    }

}
