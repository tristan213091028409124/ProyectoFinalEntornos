/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cliente;

import java.util.Date;


public class Cliente {

    public static void main(String[] args) {
        Date d = new Date("12-02-1990");
        Password p = new Password("abc109---");
        new Usuario("Tristan",p , d);
    }
}
