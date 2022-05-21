/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cliente;

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
public class PasswordTest {
    
    public PasswordTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of compruebaPassword method, of class Password.
     */
    @org.junit.jupiter.api.Test
    public void testCompruebaPassword1() {
        System.out.println("compruebaPassword1");
        Password instance = new Password("hola");
        String expResult = "Debil";
        String result = instance.compruebaPassword();
        assertEquals(expResult, result);
    }
        @org.junit.jupiter.api.Test
    public void testCompruebaPassword2() {
        System.out.println("compruebaPassword2");
        Password instance = new Password("abcdefgh");
        String expResult = "Medio";
        String result = instance.compruebaPassword();
        assertEquals(expResult, result);
    }
    
            @org.junit.jupiter.api.Test
    public void testCompruebaPassword3() {
        System.out.println("compruebaPassword2");
        Password instance = new Password("abcdefgh2");
        String expResult = "Medio fuerte";
        String result = instance.compruebaPassword();
        assertEquals(expResult, result);
    }
    
            @org.junit.jupiter.api.Test
    public void testCompruebaPassword4() {
        System.out.println("compruebaPassword2");
        Password instance = new Password("abcdefgh2!");
        String expResult = "Fuerte";
        String result = instance.compruebaPassword();
        assertEquals(expResult, result);
    }
}
