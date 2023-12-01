package fooddeliveryservice.infra;

import fooddeliveryservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AdministratorHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Administrator>> {

    @Override
    public EntityModel<Administrator> process(
        EntityModel<Administrator> model
    ) {
        return model;
    }
}
