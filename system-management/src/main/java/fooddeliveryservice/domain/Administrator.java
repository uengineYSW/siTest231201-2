package fooddeliveryservice.domain;

import fooddeliveryservice.SystemManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Administrator_table")
@Data
//<<< DDD / Aggregate Root
public class Administrator {

    @Id
    private String adminId;

    private String adminName;

    public static AdministratorRepository repository() {
        AdministratorRepository administratorRepository = SystemManagementApplication.applicationContext.getBean(
            AdministratorRepository.class
        );
        return administratorRepository;
    }
}
//>>> DDD / Aggregate Root
