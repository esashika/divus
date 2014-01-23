package br.com.globalcode.beans;

import java.io.Serializable;

public class CartaoCredito implements Serializable {

    public String tipo;
    public String numeroCartao;
    public String dataValidade;

    public CartaoCredito() {
        super();
    }

    public CartaoCredito(String tipo, String numeroCartao, String dataValidade) {
        this.tipo = tipo;
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return tipo + " " + "numero = " + numeroCartao + " Data validade = " + dataValidade;
    }
}
