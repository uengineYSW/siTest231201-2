package fooddeliveryservice.domain;

import fooddeliveryservice.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "administrators",
    path = "administrators"
)
public interface AdministratorRepository
    extends PagingAndSortingRepository<Administrator, String> {}
