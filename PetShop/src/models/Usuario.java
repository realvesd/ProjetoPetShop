/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author renatadantas
 */
public class Usuario extends Pessoa {
    
    protected String nivelAcesso;
    protected String senha;


    public Usuario(int ID, String nome, String nivelAcesso, String senha) {
        super(ID, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(int ID, String nome, String senha) {
        super(ID, nome);
        this.senha = senha;
    }

    public Usuario(int ID, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(ID, nome, sexo, dataNascimento, telefone, email, rg);
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
    }

 

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    

    
    }
    
    

    