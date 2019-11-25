package com.spring.jdbchibernate.hibernate_beneficiary.dao;

import com.spring.jdbchibernate.hibernate_beneficiary.Beneficiary;
import com.spring.jdbchibernate.hibernate_project.Project;
import com.spring.jdbchibernate.hibernate_project.ProjectEvaluation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BeneficiaryDaoTestSuite {

    @Autowired
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

        // cleanUp
        beneficiaryDao.delete(beneficiary);
    }

    @Test
    public void testBeneficiaryDaoSaveWithProjects() {
        // given
        Project projectPositive = new Project("20190202PL", "Good project", new BigDecimal(1000000), new BigDecimal(850000), "EFRR", "342662");
        Project projectNegative = new Project("20190203PL", "Bad project", new BigDecimal(1000000), new BigDecimal(900000), "EFRR", "342652");
        ProjectEvaluation projectPositiveEval =  new ProjectEvaluation(true, true, 30, true, 45, true);
        ProjectEvaluation projectNegativeEval =  new ProjectEvaluation(true, true, 30, false, 0, false);
        projectPositive.setProjectEvaluation(projectPositiveEval);
        projectNegative.setProjectEvaluation(projectNegativeEval);
    }
}
