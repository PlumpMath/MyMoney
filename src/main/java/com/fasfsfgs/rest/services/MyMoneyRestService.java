package com.fasfsfgs.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jackson.Formatted;

import com.fasfsfgs.entity.TipoGasto;

@Path("/")
public class MyMoneyRestService {

  @GET
  @Path("/tipos")
  @Produces("application/json")
  @Formatted
  public List<TipoGasto> getTipos() {
    TipoGasto alimentacao = new TipoGasto();
    alimentacao.setCodigo(1);
    alimentacao.setDescricao("Alimentação");
    alimentacao
        .setDetalhes("Gastos diretos com alimentação. Por exemplo, restaurantes para almoçar e jantar diariamente. Restaurantes para diversão e ingredientes comprados no supermercado não entram aqui.");

    TipoGasto casa = new TipoGasto();
    casa.setDescricao("Casa");
    casa.setDetalhes("Gastos para habitar a moradia. Por exemplo, aluguel, produtos de limpeza e produtos de higiene pessoal. Supermercado e drogaria em casa entram aqui.");

    TipoGasto carro = new TipoGasto();
    carro.setCodigo(3);
    carro.setDescricao("Carro");
    carro
        .setDetalhes("Gastos para usar e manter carro. Por exemplo, lavar e abastecer. Revisões e impostos entram aqui.");

    TipoGasto misc = new TipoGasto();
    misc.setCodigo(4);
    misc.setDescricao("Misc.");
    misc.setDetalhes("Gastos que podem ser cortados. Por exemplo, manter a prática de esportes, restaurantes para diversão e tv a cabo. Isso não significa que esses gastos não são importantes.");

    TipoGasto ensino = new TipoGasto();
    ensino.setCodigo(5);
    ensino.setDescricao("Ensino");
    ensino
        .setDetalhes("Gastos relacionados ao aprimoramento de conhecimentos teóricos e profissionais. Cursos e materiais para o estudo de concursos entram aqui. Livros para diversão não entram aqui.");

    List<TipoGasto> tipos = new ArrayList<TipoGasto>(2);
    tipos.add(alimentacao);
    tipos.add(casa);
    tipos.add(carro);
    tipos.add(misc);
    tipos.add(ensino);

    return tipos;
  }

}
