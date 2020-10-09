package hello.core.order;

public class Order {

    private Long memberId;
    private String itemname;
    private int itemprice;
    private int discountPrice;

    public Order(Long memberId, String itemname, int itemprice, int discountPrice) {
        this.memberId = memberId;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.discountPrice = discountPrice;
    }

    //비지니스 로직 : 계산 로직
    public int calculatePrice() {
        return itemprice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemname='" + itemname + '\'' +
                ", itemprice=" + itemprice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
