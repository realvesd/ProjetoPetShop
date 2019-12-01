/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author renatadantas
 */
public class Servico {
    
    private int ID;
    private String descricao;
    private float valor;

    public Servico(int ID, String descricao, float valor) {
        this.ID = ID;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
       return getDescricao();
     
    }
    
}
