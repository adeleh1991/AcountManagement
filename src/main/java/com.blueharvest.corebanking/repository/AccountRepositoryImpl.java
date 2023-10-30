package com.blueharvest.corebanking.repository;

import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountRepositoryImpl {

    @PersistenceContext
    EntityManager entityManager;

    public List<Account> findByCustomer(Customer customer) {
        TypedQuery<Account> query = entityManager.createQuery("SELECT t FROM " + Account.class.getSimpleName() + "t WHERE t.customer = :customer", Account.class);
        query.setParameter("customer", customer);
        return query.getResultList();
    }

}
