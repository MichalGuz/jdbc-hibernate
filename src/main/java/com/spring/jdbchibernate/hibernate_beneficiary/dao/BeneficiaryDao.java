package com.spring.jdbchibernate.hibernate_beneficiary.dao;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;
import org.springframework.data.repository.CrudRepository;

public interface BeneficiaryDao extends CrudRepository<Beneficiary, Integer> {

}
