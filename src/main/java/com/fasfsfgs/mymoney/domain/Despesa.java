package com.fasfsfgs.mymoney.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "despesa")
public class Despesa {

  @Id
  @GeneratedValue
  @Column(name = "codigo", insertable = false, updatable = false, nullable = false, unique = true)
  private Integer codigo;

  private String descricao;

  public Despesa() {}

  public Integer getCodigo() {
    return codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(final String descricao) {
    this.descricao = descricao;
  }

}
