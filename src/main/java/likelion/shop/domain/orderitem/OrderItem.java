package likelion.shop.domain.orderitem;

import jakarta.persistence.*;
import likelion.shop.domain.item.Item;
import likelion.shop.domain.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    private int count;

    @Column(name = "order_price")
    private int orderprice;

    @ManyToOne     //다대일관계
    @JoinColumn(name="item_id") //외래키설정   Item클래스에서 item_id란 필드의 값(item클래스의 pk)으로 설정한다는 말임
    private Item item;

    @ManyToOne
    @JoinColumn(name="order_id")  //외래키설정   order클래스에서 order_id란 필드의 값(order클래스의 pk)으로 설정한다는 말임
    private Order order;



}
