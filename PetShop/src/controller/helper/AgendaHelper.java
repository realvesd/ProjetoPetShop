/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helper;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import models.Agendamento;
import models.Cliente;
import models.Servico;
import view.Agenda;

/**
 *
 * @author renatadantas
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        for(Agendamento agendamento: agendamentos) {
            
            tableModel.addRow(new Object[] {
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
               
            });
            
        }
    
    
    
}

    public void preencherClientes(ArrayList<Cliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
        
        
        for(Cliente cliente: clientes) {
            comboBoxModel.addElement(cliente);
          
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServiço().getModel();
      
        for(Servico servico: servicos) {
            comboBoxModel.addElement(servico);
        }
        
}
    public Cliente obterCliente() {
        return (Cliente)view.getjComboBoxCliente().getSelectedItem();
        
    }

    public Servico obterServico() {
        return (Servico)view.getjComboBoxServiço().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor+"");
    }


    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        
        Cliente cliente = obterCliente();
        
        Servico servico = obterServico();
       
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        
        String data = view.getTextData().getText();
        String hora = view.getTextHora().getText();
        String dataHora = data + " " + hora;
        
        
        String observacao = view.getTextObs().getText();
      
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
        
    }

    @Override
    public void limparTela() {
        
        view.getTextId().setText(" ");
        view.getTextData().setText(" ");
        view.getTextHora().setText(" ");
        view.getTextValor().setText(" ");
        view.getTextObs().setText(" ");
        
    }
}
