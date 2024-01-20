package hello.hellospring.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@AllArgsConstructor
public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discountPrice) {
        this.memberId = memberId;this.itemName=itemName;this.itemPrice=itemPrice;this.discountPrice=discountPrice;
    }

    @Override
    public String toString() {
        return "memberId=" + memberId + ", itemName=" + itemName + ", itemprice=" + itemPrice + ", discountPrice=" + discountPrice;
    }

    public int calculatePrice() {
        return itemPrice- discountPrice;
    }

}
