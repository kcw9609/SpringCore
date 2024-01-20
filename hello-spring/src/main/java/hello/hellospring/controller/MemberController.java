//package hello.hellospring.controller;
//
//
//import hello.hellospring.domain.Member;
//import hello.hellospring.service.MemberServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@Controller
//public class MemberController {
//    private final MemberServiceImpl memberServiceImpl;
//
//    @Autowired
//    public MemberController(MemberServiceImpl memberServiceImpl) {
//        this.memberServiceImpl = memberServiceImpl;
//    }
//
//    // 조회할때-url을 통해 확인
//    @GetMapping("/members/new")
//    public String createForm() {
//        return "members/createMemberForm";
//    }
//
//    // data를 폼 형식으로 받아올때 많이 씀
//    @PostMapping("/members/new")
//    public String create(MemberForm form) {
//        Member member = new Member();
//        member.setName(form.getName());
//
//        memberServiceImpl.join(member);
//
//        return "redirect:/";
//    }
//
//    @GetMapping("/member")
//    public String list(Model model) {
//        List<Member> members = memberServiceImpl.findMembers();
//        model.addAttribute("members", members);
//        return "members/memberList";
//    }
//}
