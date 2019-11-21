package com.spring.jdbchibernate.hibernate_beneficiary.dao;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BeneficiaryDaoTestSuite {

    BeneficiaryDao beneficiaryDao;

    @Test
    public void testFindByEditorKey() {
        // given
        Beneficiary beneficiary = new Beneficiary("Funds Advisors LTD", 12341234);
        beneficiaryDao.save(beneficiary);
        int retrievedEditorKey = beneficiary.getEditorKey();

        // when
        List<Beneficiary> beneficiaries = beneficiaryDao.findByEditorKey(retrievedEditorKey);

        // then
        Assert.assertEquals(1, beneficiaries.size());


    }

}
