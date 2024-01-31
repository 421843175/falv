package com.falv.mapper;

import com.falv.pojo.Reuser;
import com.falv.pojo.ReuserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReuserMapper {
    long countByExample(ReuserExample example);

    int deleteByExample(ReuserExample example);

    int insert(Reuser row);

    int insertSelective(Reuser row);

    List<Reuser> selectByExample(ReuserExample example);

    int updateByExampleSelective(@Param("row") Reuser row, @Param("example") ReuserExample example);

    int updateByExample(@Param("row") Reuser row, @Param("example") ReuserExample example);
}