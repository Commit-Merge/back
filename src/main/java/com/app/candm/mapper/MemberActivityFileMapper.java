package com.app.candm.mapper;

import com.app.candm.domain.MemberActivityFileVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberActivityFileMapper {
//    추가
    public void insert(MemberActivityFileVO memberActivityFileVO);
}
