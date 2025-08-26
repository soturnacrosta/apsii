/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

/**
 *
 * @author mailton
 */
public class MinhaAgendaDeAniversarios extends Aniversariante implements AgendaDeAniversarios  {

    public MinhaAgendaDeAniversarios(String nome, br.edu.unipe.aps2.exercicio1.DataAniversario dataAniversario) {
        super(nome, dataAniversario);
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Aniversariante aniversariante = new Aniversariante (nome, dataAniversario);

    
}
