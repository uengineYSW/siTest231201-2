package fooddeliveryservice.domain;

import fooddeliveryservice.OrderAndPaymentManagementApplication;
import fooddeliveryservice.domain.OrderPlaced;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderId;

    private String customerId;

    private String restaurantId;

    private Address deliveryAddress;

    private String paymentMethod;

    private paymentMethodType paymentMethodType;

    private String paymentStatus;

    private paymentStatusType paymentStatusType;

    private String orderStatus;

    private orderStatusType orderStatusType;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderAndPaymentManagementApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
