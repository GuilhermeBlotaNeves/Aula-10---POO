/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Fatec
 */
public class Main {
    public static void main(String[] args){
        // Exemplo de declaração , instanciação e definição de um objeto.
       Data hoje;   
       hoje = new Data();
       hoje.ano = 2022;  
       hoje.mes = 4;
       hoje.dia = 25;
       System.out.println("Hoje é dia"+ hoje.dia);
       
       Data Amanha;
       Amanha = new Data();
       hoje.dia = 26;
       hoje.mes = 4;
       hoje.ano = 2022;  
      
      
               
    }
}
