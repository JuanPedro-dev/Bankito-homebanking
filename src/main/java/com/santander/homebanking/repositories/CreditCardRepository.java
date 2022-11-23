package com.santander.homebanking.repositories;

import com.santander.homebanking.models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {
}
