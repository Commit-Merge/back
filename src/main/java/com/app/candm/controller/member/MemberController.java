package com.app.candm.controller.member;

import com.app.candm.dto.member.MemberDTO;
import com.app.candm.service.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/member/**")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

//    회원가입 페이지 이동
    @GetMapping("join")
    public String goToJoinForm(){
        return "member/join";
    }
//    회원가입
    @PostMapping("join")
    public RedirectView join(MemberDTO memberDTO){
        memberService.join(memberDTO);
        return new RedirectView("/member/login");
    }
//    이메일 체크
    @GetMapping("check-email")
    @ResponseBody
    public boolean checkEamil(String memberEmail){
        return memberService.checkEmail(memberEmail);
    }

//    로그인 화면으로 이동
    @GetMapping("login")
    public String goToLoginForm(){
        return "member/login";
    }

}
