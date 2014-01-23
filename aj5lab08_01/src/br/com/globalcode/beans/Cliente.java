package br.com.globalcode.beans;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private Endereco enderecoEntrega;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(String string) {
        cpf = string;
    }

    public void setEmail(String string) {
        email = string;
    }

    public void setNome(String string) {
        nome = string;
    }

    public void setTelefone(String string) {
        telefone = string;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}
