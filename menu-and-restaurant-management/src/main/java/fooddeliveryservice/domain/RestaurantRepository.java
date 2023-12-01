package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "restaurants",
    path = "restaurants"
)
public interface RestaurantRepository
    extends PagingAndSortingRepository<Restaurant, String> {}
