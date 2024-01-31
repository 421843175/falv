package com.falv.mapper;

import com.falv.pojo.Userread;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserreadMapper {
    int insert(Userread row);

    List<Userread> selectAll();

    List<Userread> selectOne(String username);

    int countread(String username);

    int updateSetRead(Integer id);

}