/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import models.Agendamento;
import models.Cliente;
import models.Servico;
import models.Usuario;



/**
 *
 * @author renatadantas
 */
public class Main {
    
    public static void main(String[]args) {
    
    Servico servico = new Servico(1, "tosa", 30);
    System.out.println(servico.getValor());
   
    Cliente cliente = new Cliente(1, "renata", "av monteiro", "58038320");
    System.out.println(cliente.getNome());
    
    Usuario usuario = new Usuario(1, "renata", "caixa", "12345");
    System.out.println(usuario.getNivelAcesso());
    
    Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "30/11/2019 16:36");
    System.out.println(agendamento.getCliente().getNome());
    
    
    
   
} 
}
