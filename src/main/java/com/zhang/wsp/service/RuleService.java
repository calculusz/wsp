package com.zhang.wsp.service;

import com.zhang.wsp.model.Rule;

import java.util.List;

/**
 * Created by zhang on 2016/11/28.
 */
public interface RuleService {
     List<Rule> getAllRule();
    void addRule(String description);
    void delRule(int id);

}
