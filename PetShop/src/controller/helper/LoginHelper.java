/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import models.Usuario;
import view.Login;

/**
 *
 * @author renatadantas
 */
public class LoginHelper implements IHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo() {
        
        String nome = view.getTextUsuario().getText();
        String senha = view.getTextSenha().getText();
        
        Usuario modelo = new Usuario(0, nome, senha);
        
        return modelo;
}
    
    public void setaModelo(Usuario modelo) {
        
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    public void limpaTela() {
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
