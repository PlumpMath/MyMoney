package com.fasfsfgs.entity;

public class TipoGasto {

  private Integer codigo;
  private String descricao;
  private String detalhes;

  public TipoGasto() {}

  public TipoGasto(Integer codigo, String descricao, String detalhes) {
    super();
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
