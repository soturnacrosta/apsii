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
public class Main {
    
    public static void main(String[] args) {
    
        Aniversariante Lucas = new Aniversariante ("Lucas", 19,12);
        Aniversariante Laura = new Aniversariante ("Laura", 05,07);
        Aniversariante Marcos = new Aniversariante ("Marcos", 03,10);


        ArrayList<Aniversariante> aniversariante = new ArrayList<>();
        aniversariante.add(Lucas);
        aniversariante.add(Laura);
            System.out.println("Adicionado! " +  aniversariante); 
        
        aniversariante.add(1, Marcos); 
            System.out.println("Adicionando índice:" + aniversariante); 
        
        int tamanho = aniversariante.size();
            System.out.println("Tamanho do índice:" + tamanho);
        
        aniversariante.remove(0);
            System.out.println("Removendo primeiro elemento: " + aniversariante); 
        
        Lucas.equals(Laura); //comparando com Equals!!! Coloquei um print pra trazer true ou false
        
    }
    
}
