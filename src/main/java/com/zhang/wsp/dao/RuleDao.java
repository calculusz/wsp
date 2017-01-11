package com.zhang.wsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.zhang.wsp.model.Rule;

import java.util.List;

/**
 * Created by zhang on 2016/11/25.
 */
@Repository
public interface RuleDao {
    List<Rule> selectAllRule();
    void addRule(@Param("description") String description,@Param("name") String name);
    void delRule(@Param("ruleid") int ruleid);
}
