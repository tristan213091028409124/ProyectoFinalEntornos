/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cliente;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculaEdad method, of class Usuario.
     */
    @Test
    public void testCalculaEdad() {
        System.out.println("calculaEdad");
        Date fechaNac = new Date(2000, 02, 20);
        Usuario instance = new Usuario("",new Password("") , fechaNac);
        int expResult = 22;
        int result = instance.calculaEdad(fechaNac);
        assertEquals(expResult, result);
    }
    
    public void testCalculaEdad2() {
        System.out.println("calculaEdad");
        Date fechaNac = new Date(1990, 02, 20);
        Usuario instance = new Usuario("",new Password("") , fechaNac);
        int expResult = 32;
        int result = instance.calculaEdad(fechaNac);
        assertEquals(expResult, result);
    }
    
}
