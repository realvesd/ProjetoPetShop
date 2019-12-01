/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helper.AgendaHelper;
import java.util.ArrayList;
import models.Agendamento;
import models.Cliente;
import models.DAO.AgendamentoDAO;
import models.DAO.ClienteDAO;
import models.DAO.ServicoDAO;
import models.Servico;
import view.Agenda;

/**
 *
 * @author renatadantas
 */
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela() {
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        helper.preencherTabela(agendamentos);
        
    }
    
    public void atualizaCliente() {
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        helper.preencherClientes(clientes);
        
    }
    
    public void atualizaServico() {
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaValor() {
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
            
    }

    public void agendar() {
        
        Agendamento agendamento = helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        
        atualizaTabela();
        helper.limparTela();
   
        
    }

   
    }

    

