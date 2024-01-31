package com.falv.mapper;

import com.falv.pojo.Userinfo;
import com.falv.pojo.UserinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserinfoMapper {
    long countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo row);

    int insertSelective(Userinfo row);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Userinfo row, @Param("example") UserinfoExample example);

    int updateByExample(@Param("row") Userinfo row, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo row);

    int updateByPrimaryKey(Userinfo row);

    Userinfo selectByUsername(String username);

    int updatepassword(String password,String username);
}