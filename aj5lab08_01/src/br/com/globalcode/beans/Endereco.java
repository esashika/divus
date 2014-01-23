package br.com.globalcode.beans;

import java.io.Serializable;

public class Endereco implements Serializable {

    public static final int RESIDENCIAL = 1;
    public static final int ENTREGA = 2;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco() {
        super();
    }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getRua() {
        return rua;
    }

    public void setBairro(String string) {
        bairro = string;
    }

    public void setCep(String string) {
        cep = string;
    }

    public void setCidade(String string) {
        cidade = string;
    }

    public void setEstado(String string) {
        estado = string;
    }

    public void setNumero(int i) {
        numero = i;
    }

    public void setRua(String string) {
        rua = string;
    }
}
