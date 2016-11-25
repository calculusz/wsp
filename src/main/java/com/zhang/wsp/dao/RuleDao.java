package com.zhang.wsp.dao;

import org.springframework.stereotype.Repository;
import com.zhang.wsp.model.Rule;

import java.util.List;

/**
 * Created by zhang on 2016/11/25.
 */
@Repository
public interface RuleDao {
    List<Rule> selectAllRule();
}
