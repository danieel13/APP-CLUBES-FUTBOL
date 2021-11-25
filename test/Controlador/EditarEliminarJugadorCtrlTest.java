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
public class EditarEliminarJugadorCtrlTest {
    
    public EditarEliminarJugadorCtrlTest() {
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
     * Test of recuperarDatos method, of class EditarEliminarJugadorCtrl.
     */
    @Test
    public void testRecuperarDatos() {
        System.out.println("recuperarDatos");
        EditarEliminarJugadorCtrl instance = new EditarEliminarJugadorCtrl();
        Jugador expResult = null;
        Jugador result = instance.recuperarDatos();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of editar method, of class EditarEliminarJugadorCtrl.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        EditarEliminarJugadorCtrl instance = new EditarEliminarJugadorCtrl();
        instance.editar();
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class EditarEliminarJugadorCtrl.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        EditarEliminarJugadorCtrl instance = new EditarEliminarJugadorCtrl();
        instance.eliminar();
        fail("The test case is a prototype.");
    }
    
}
