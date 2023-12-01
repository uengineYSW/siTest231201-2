package fooddeliveryservice.domain;

import fooddeliveryservice.MenuAndRestaurantManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Restaurant_table")
@Data
//<<< DDD / Aggregate Root
public class Restaurant {

    @Id
    private String restaurantId;

    private String ownerId;

    private String menu;

    private String status;

    private statusType statusType;

    @PrePersist
    public void onPrePersist() {}

    public static RestaurantRepository repository() {
        RestaurantRepository restaurantRepository = MenuAndRestaurantManagementApplication.applicationContext.getBean(
            RestaurantRepository.class
        );
        return restaurantRepository;
    }
}
//>>> DDD / Aggregate Root
