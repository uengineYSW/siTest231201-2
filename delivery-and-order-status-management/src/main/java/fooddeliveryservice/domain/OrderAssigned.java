package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import fooddeliveryservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderAssigned extends AbstractEvent {

    private String orderId;
    private String deliveryId;

    public OrderAssigned(Delivery aggregate) {
        super(aggregate);
    }

    public OrderAssigned() {
        super();
    }
}
//>>> DDD / Domain Event
