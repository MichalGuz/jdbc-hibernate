package com.spring.jdbchibernate.hibernate_beneficiary.dao;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BeneficiaryDao extends CrudRepository<Beneficiary, Integer> {
    public List<Beneficiary> findByEditorKey(int editorKey);
}
