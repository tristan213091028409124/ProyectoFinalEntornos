/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

/**
 *
 * @author Tristan
 */
public class Password {
    String password;
    
    public Password(String p){
        this.password = p;
    }
    
    public String compruebaPassword(String p){
        if (p.length() < 8){
            return "Debil";
        }
        if(p.matches("[a-zA-Z]+")){
            return "Medio";
        }
        if(p.matches("[a-zA-Z0-9]+")){
            return "Medio fuerte";
        }
        return "Fuerte";        
    }
}
