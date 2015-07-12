package com.fasfsfgs.mymoney.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasfsfgs.mymoney.cmd.GetDespesaCmd;
import com.fasfsfgs.mymoney.domain.Despesa;

@Named
@Path("/despesas")
public class DespesaService {

  @Inject
  private GetDespesaCmd getDespesaCmd;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Despesa> getDespesas() {
    return getDespesaCmd.get();
  }

}
