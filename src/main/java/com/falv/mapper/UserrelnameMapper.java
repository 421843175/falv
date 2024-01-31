package com.falv.mapper;

import com.falv.pojo.Userrelname;
import com.falv.pojo.UserrelnameExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserrelnameMapper {
    long countByExample(UserrelnameExample example);

    int deleteByExample(UserrelnameExample example);

    int insert(Userrelname row);

    int insertSelective(Userrelname row);

    List<Userrelname> selectByExample(UserrelnameExample example);

    int updateByExampleSelective(@Param("row") Userrelname row, @Param("example") UserrelnameExample example);

    int updateByExample(@Param("row") Userrelname row, @Param("example") UserrelnameExample example);

    Userrelname selectone(Userrelname username);

    int updateone(Userrelname userrelname);
}