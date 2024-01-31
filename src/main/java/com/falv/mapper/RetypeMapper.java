package com.falv.mapper;

import com.falv.pojo.Retype;
import com.falv.pojo.RetypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RetypeMapper {
    long countByExample(RetypeExample example);

    int deleteByExample(RetypeExample example);

    int insert(Retype row);

    int insertSelective(Retype row);

    List<Retype> selectByExample(RetypeExample example);

    int updateByExampleSelective(@Param("row") Retype row, @Param("example") RetypeExample example);

    int updateByExample(@Param("row") Retype row, @Param("example") RetypeExample example);
}