package com.fasfsfgs.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jackson.Formatted;

import com.fasfsfgs.enums.TipoGasto;

@Path("/")
public class MyMoneyRestService {

  @GET
  @Path("/tipos")
  @Produces("application/json")
  @Formatted
  public TipoGasto[] getTipos() {
    return TipoGasto.values();
  }

}
