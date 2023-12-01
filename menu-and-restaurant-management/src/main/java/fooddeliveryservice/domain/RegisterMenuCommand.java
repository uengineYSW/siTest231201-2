package fooddeliveryservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterMenuCommand {

    private String ownerId;
    private String menu;
}
