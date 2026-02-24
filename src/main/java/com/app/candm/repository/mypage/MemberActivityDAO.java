package com.app.candm.repository.mypage;

import com.app.candm.domain.MemberActivityVO;
import com.app.candm.mapper.MyPageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberActivityDAO {

    private final MyPageMapper myPageMapper;

//    추가
    public void save(MemberActivityVO memberActivityVO){
        myPageMapper.activityInsert(memberActivityVO);
    }

//    목록
}
