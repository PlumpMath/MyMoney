package com.fasfsfgs.mymoney.cmd;

import java.util.Arrays;
import java.util.List;

import javax.inject.Named;

import com.fasfsfgs.mymoney.enums.TipoGasto;

@Named
public class GetTipoDespesaCmd {

  public List<TipoGasto> get() {
    return Arrays.asList(TipoGasto.values());
  }

}
