/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author renatadantas
 */
public class MenuPrincipalController {
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void irParaAgenda() {
    
    Agenda agenda = new Agenda();
    agenda.setVisible(true);
}
    
    
}
