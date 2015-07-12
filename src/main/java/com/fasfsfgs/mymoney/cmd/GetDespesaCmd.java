package com.fasfsfgs.mymoney.cmd;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.fasfsfgs.mymoney.dao.DespesaDAO;
import com.fasfsfgs.mymoney.domain.Despesa;

@Named
public class GetDespesaCmd {

  @Inject
  private DespesaDAO despesaDAO;

  public List<Despesa> get() {
    return despesaDAO.getAll();
  }

}
