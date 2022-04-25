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
public class Database {
    public static ArrayList<Contato> getContato(){
        ArrayList<Contato> list = new ArrayList<>();
        list.add(new Contato ("Jonas", "(13)3493-1234" , new Data (1,1,2001)));
        list.add(new Contato ("Pedro", "(13)3493-5678" , new Data (2,1,2001)));
        list.add(new Contato ("Bob", "(13)3493-6598" , new Data (3,1,2001)));
        return list;
    }
}
