package com.fasfsfgs.mymoney.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasfsfgs.mymoney.cmd.GetTipoDespesaCmd;
import com.fasfsfgs.mymoney.enums.TipoGasto;

@Named
@Path("/tipos")
public class TipoDespesaService {

  @Inject
  private GetTipoDespesaCmd getTipoDespesaCmd;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<TipoGasto> getTiposDespesa() {
    return getTipoDespesaCmd.get();
  }

}
