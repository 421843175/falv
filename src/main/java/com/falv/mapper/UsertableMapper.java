package com.falv.mapper;

import com.falv.pojo.Usertable;
import com.falv.pojo.UsertableExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsertableMapper {
    long countByExample(UsertableExample example);

    int deleteByExample(UsertableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usertable row);

    int insertSelective(Usertable row);

    List<Usertable> selectByExample(UsertableExample example);

    Usertable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Usertable row, @Param("example") UsertableExample example);

    int updateByExample(@Param("row") Usertable row, @Param("example") UsertableExample example);

    int updateByPrimaryKeySelective(Usertable row);

    int updateByPrimaryKey(Usertable row);
}