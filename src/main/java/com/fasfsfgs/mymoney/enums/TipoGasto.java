package com.fasfsfgs.mymoney.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoGasto {

  // @formatter:off
  ALIMENTACAO(
      1,
      "Alimentação",
      "Gastos diretos com alimentação. Por exemplo, restaurantes para almoçar e jantar diariamente. Restaurantes para diversão e ingredientes comprados no supermercado não entram aqui."
      ),
  CASA(
      2,
      "Casa",
      "Gastos para habitar a moradia. Por exemplo, aluguel, produtos de limpeza e produtos de higiene pessoal. Supermercado e drogaria em casa entram aqui."
      ),
  CARRO(
      3,
      "Carro",
      "Gastos para usar e manter carro. Por exemplo, lavar e abastecer. Revisões e impostos entram aqui."
      ),
  MISC(
      4,
      "Misc.",
      "Gastos que podem ser cortados. Por exemplo, manter a prática de esportes, restaurantes para diversão e tv a cabo. Isso não significa que esses gastos não são importantes."
      ),
  ENSINO(
      5,
      "Ensino",
      "Gastos relacionados ao aprimoramento de conhecimentos teóricos e profissionais. Cursos e materiais para o estudo de concursos entram aqui. Livros para diversão não entram aqui."
      );
  // @formatter:on

  private Integer codigo;
  private String descricao;
  private String detalhes;

  TipoGasto(Integer codigo, String descricao, String detalhes) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.detalhes = detalhes;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }

}
