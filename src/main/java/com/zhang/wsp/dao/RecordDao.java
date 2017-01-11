package com.zhang.wsp.dao;

import com.zhang.wsp.model.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/11/30.
 */
@Repository
public interface RecordDao {
    List<Record> selectAllRecord();
    List<Record> getUserRecord(@Param("userid") int userid);


}
