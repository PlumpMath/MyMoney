package com.fasfsfgs.mymoney.dao;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.fasfsfgs.mymoney.domain.Despesa;
import com.fasfsfgs.mymoney.domain.QDespesa;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Named
public class DespesaDAO {

  @Inject
  private JPAQueryFactory jpaQueryFactory;

  public List<Despesa> getAll() {
    JPAQuery<Despesa> query = jpaQueryFactory.selectFrom(QDespesa.despesa);
    return query.fetch();
  }

}
