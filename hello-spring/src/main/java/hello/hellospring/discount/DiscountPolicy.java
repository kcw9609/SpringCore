package hello.hellospring.discount;

import hello.hellospring.domain.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);

}
