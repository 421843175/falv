package com.falv.mapper;

import com.falv.pojo.Usermassage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsermassageMapper {
    int insert(Usermassage row);

    List<Usermassage> selectAll();
}