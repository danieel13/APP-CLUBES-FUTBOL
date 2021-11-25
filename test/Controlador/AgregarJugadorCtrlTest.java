/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.Jugador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class AgregarJugadorCtrlTest {
    
    public AgregarJugadorCtrlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class AgregarJugadorCtrl.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        AgregarJugadorCtrl instance = new AgregarJugadorCtrl();
        instance.agregar();
        fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarDatos method, of class AgregarJugadorCtrl.
     */
    @Test
    public void testRecuperarDatos() {
        System.out.println("recuperarDatos");
        AgregarJugadorCtrl instance = new AgregarJugadorCtrl();
        Jugador expResult = null;
        Jugador result = instance.recuperarDatos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
