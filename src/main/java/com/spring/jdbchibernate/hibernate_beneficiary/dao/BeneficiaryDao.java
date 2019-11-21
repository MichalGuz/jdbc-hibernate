package com.spring.jdbchibernate.hibernate_beneficiary.dao;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface BeneficiaryDao extends CrudRepository<Beneficiary, Integer> {
    public List<Beneficiary> findByEditorKey(int editorKey);
}
