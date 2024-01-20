package hello.hellospring;

import hello.hellospring.config.AppConfig;
import hello.hellospring.domain.Grade;
import hello.hellospring.domain.Member;
import hello.hellospring.order.OrderService;
import hello.hellospring.service.MemberService;
import hello.hellospring.service.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

    }
}
