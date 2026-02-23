package com.app.candm.repository.mypage;

import com.app.candm.domain.MemberActivityFileVO;
import com.app.candm.mapper.MemberActivityFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberActivityFileDAO {

    private final MemberActivityFileMapper memberActivityFileMapper;

//    추가
    public void save(MemberActivityFileVO memberActivityFileVO){
        memberActivityFileMapper.insert(memberActivityFileVO);
    }

}
