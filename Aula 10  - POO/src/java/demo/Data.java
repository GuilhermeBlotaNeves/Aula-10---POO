/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Fatec
 */
public class Data {
    public int dia;
    public int mes;
    public int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Construtor
    public Data(){
    dia = 10; mes = 04; ano = 2007;
    }
    
    public Data(int dia, int mes, int ano){
     this.dia = dia; this.mes = mes; this.ano = ano;
    }
    
    // Método de definição de atributos
    public void setData(int dia, int mes, int ano){
        if(mes>12) mes =12;
    this.dia = dia; this.mes = mes; this.ano = ano; 
    }
    
    //Método de retorno de data formatada
    public String getData(){
        return dia+"/"+mes+"/"+ano;
    }   
    
    public String getAniversario(){
        return dia+"/"+mes;
    }   
}
