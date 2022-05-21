/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Tristan
 */
public class Usuario {
    String nombre;
    Password password;
    Date fechaNac;
    
    public Usuario(String n,Password p, Date f){
        this.nombre = n;
        this.password = p;
        this.fechaNac = f;
    }
    
    public int calculaEdad(Date fechaNac){
        LocalDate hoy = LocalDate.now() ; 
        int edad = hoy.getYear()-fechaNac.getYear();
        return edad;
    }
}
