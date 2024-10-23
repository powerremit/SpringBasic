package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    // 필드주입 (벼로 안좋음)
//    @Autowired
//    private MemberService memberService;


    // 세터주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService
//    }


    // 생성자 주입(권장, 가장 좋음)
    @Autowired // 스프링컨테이너에서 멤버서비스를 가져온다.
    public MemberController(MemberService memberService) {
        // 여기서 매개변수에 memberService 에러 나는데 service에서 @service 해줘야한다.
        this.memberService = memberService;
    }
}
