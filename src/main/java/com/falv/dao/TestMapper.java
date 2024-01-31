package com.falv.dao;

import com.falv.pojo.BPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository  //标注在 DAO类
public interface TestMapper {


    @Select("select * from b where id=#{id}")
    BPojo selectOne(Integer id);


}
