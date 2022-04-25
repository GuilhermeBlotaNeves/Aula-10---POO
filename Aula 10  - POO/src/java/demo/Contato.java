/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import java.util.ArrayList;

/**
 *
 * @author Fatec
 */
public class Contato {
    private String nome;
    private String telefone;
    private Data nascimento;
    
    public static ArrayList<Contato> getlist(){
        ArrayList<Contato> list = new ArrayList<>();
        list.add(new Contato ("Fulano", "(13)3493-1234" , new Data (1,1,2000)));
        list.add(new Contato ("Klebinho", "(13)3493-5678" , new Data (2,1,2000)));
        list.add(new Contato ("Ronaldo", "(13)3493-6598" , new Data (3,1,2000)));
        return list;
    }

    public Contato(String nome, String telefone, Data nascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
