package com.fasfsfgs.infra.config;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasfsfgs.mymoney.dao.DespesaDAO;
import com.fasfsfgs.mymoney.domain.Despesa;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProductionContextConfig.class, QuerydslConfig.class})
public class ProductionContextConfigTest {

  @Inject
  private DespesaDAO despesaDAO;

  @Test
  public void testDB() {
    List<Despesa> despesas = despesaDAO.getAll();

    despesas.forEach(despesa -> System.out.println(despesa.getCodigo()));
  }

}
