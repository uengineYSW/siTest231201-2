package fooddeliveryservice.domain;

import fooddeliveryservice.DeliveryAndOrderStatusManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    private String deliveryId;

    private String orderId;

    private String deliveryStatus;

    private deliveryStatusType deliveryStatusType;

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryAndOrderStatusManagementApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    //<<< Clean Arch / Port Method
    public void assignDelivery(AssignDeliveryCommand assignDeliveryCommand) {
        //implement business logic here:

        OrderAssigned orderAssigned = new OrderAssigned(this);
        orderAssigned.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
