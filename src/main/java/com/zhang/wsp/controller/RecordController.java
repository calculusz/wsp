package com.zhang.wsp.controller;

import com.zhang.wsp.dao.RecordDao;
import com.zhang.wsp.model.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
@Controller
@RequestMapping("")
public class RecordController {
    @Resource
    RecordDao recordDao;
    @RequestMapping("alermlog.html")
    public String recordview(){
        return "alermlog";
    }
    @RequestMapping(value="getrecord.do")
    public @ResponseBody List<Record> recordshow(){
        List<Record> list=recordDao.selectAllRecord();
        return list;
    }


}
