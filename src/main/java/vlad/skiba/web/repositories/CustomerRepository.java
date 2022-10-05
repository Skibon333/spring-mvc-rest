package vlad.skiba.web.repositories;

import vlad.skiba.web.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Copyright Vlad Skiba (c) 2022.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
