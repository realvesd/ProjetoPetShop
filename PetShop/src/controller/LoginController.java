/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.LoginHelper;
import models.DAO.UsuarioDAO;
import models.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author renatadantas
 */
public class LoginController {

    private final Login view;
    private final LoginHelper helper;
    private UsuarioDAO UsuarioDAO;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    
    public void entraSistema() {
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO = new UsuarioDAO();
        Usuario usuarioVerificado = UsuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioVerificado != null) {
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        
        } else {
            view.exibemensagem("Usuário ou senha invalidos!");
        }
    }
    
    public void fizTarefa() {
        System.out.println("busquei algo do banco");
        
        this.view.exibemensagem("executei fiz tarefa");
    }
    
    
}
