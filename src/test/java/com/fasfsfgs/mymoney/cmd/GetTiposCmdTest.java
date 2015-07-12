package com.fasfsfgs.mymoney.cmd;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.fasfsfgs.mymoney.enums.TipoGasto;

public class GetTiposCmdTest {

  private GetTipoDespesaCmd getTiposCmd;

  @Before
  public void setUp() throws Exception {
    getTiposCmd = new GetTipoDespesaCmd();
  }

  @Test
  public void test() {
    List<TipoGasto> tipos = getTiposCmd.get();

    assertEquals(5, tipos.size());
  }

}
