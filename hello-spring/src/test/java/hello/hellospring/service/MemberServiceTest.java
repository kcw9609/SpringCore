//package hello.hellospring.service;
//
//import hello.hellospring.domain.Member;
//import hello.hellospring.repository.MemoryMemberRepository;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//class MemberServiceTest {
//    MemberServiceImpl memberServiceImpl;
//    MemoryMemberRepository memberRepository;
//
//    @BeforeEach
//    public void beforeEach(){ // 같은 repository를 사용하기 위해 = DI
//        memberRepository = new MemoryMemberRepository();
//        memberServiceImpl = new MemberServiceImpl(memberRepository);
//    }
//    @AfterEach
//    public void afterEach() {
//        memberRepository.clearStore();
//    }
//
//    @Test
//    void 회원가입() {
//        // given
//        Member member1 = new Member();
//        member1.setName("spring");
//
//        //when
//        Long saveId = memberServiceImpl.join(member1);
//        //then
//        Member findMember = memberServiceImpl.findOne(saveId).get();
//        Assertions.assertThat(member1.getName()).isEqualTo(findMember.getName());
//
//    }
//    @Test
//    public void 중복_회원_예외() {
//        //given
//        Member member2 = new Member();
//        member2.setName("Spring");
//
//        Member member3 = new Member();
//        member3.setName("Spring");
//
//        //shen
//        memberServiceImpl.join(member2);
//        // 이 예외가 터지는가
//        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberServiceImpl.join(member3));
//        Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
//
////        try {
////            memberService.join(member3);
////            fail();
////        }catch (IllegalStateException e) {
////            Assertions.assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
////        }
//        //then
//    }
//
//    @Test
//    void findMembers() {
//    }
//
//    @Test
//    void findOne() {
//    }
//}