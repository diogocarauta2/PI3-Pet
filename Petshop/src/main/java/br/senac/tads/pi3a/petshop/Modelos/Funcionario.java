/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3a.petshop.Modelos;

import java.util.Date;

/**
 *
 * @author Dud Felipe
 */
public class Funcionario extends Usuario{
    private int tipoAcesso;
    private int usuario;
    private int senha;

    public Funcionario() {
        super();
    }
    
    public Funcionario(int tipoAcesso, int usuario, int senha) {
        this.tipoAcesso = tipoAcesso;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario(int tipoAcesso, int usuario, int senha, String nome, String cpf, Date nascimento, String telefone, String email, char sexo) {
        super(nome, cpf, nascimento, telefone, email, sexo);
        this.tipoAcesso = tipoAcesso;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(int tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
