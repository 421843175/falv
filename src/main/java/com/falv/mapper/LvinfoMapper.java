package com.falv.mapper;

import com.falv.pojo.Lvinfo;
import com.falv.pojo.LvinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LvinfoMapper {
    long countByExample(LvinfoExample example);

    int deleteByExample(LvinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lvinfo row);

    int insertSelective(Lvinfo row);

    List<Lvinfo> selectByExample(LvinfoExample example);

    Lvinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Lvinfo row, @Param("example") LvinfoExample example);

    int updateByExample(@Param("row") Lvinfo row, @Param("example") LvinfoExample example);

    int updateByPrimaryKeySelective(Lvinfo row);

    int updateByPrimaryKey(Lvinfo row);
}