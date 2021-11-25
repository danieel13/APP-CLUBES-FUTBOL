/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionDB;
import vista.MostrarJugadores;

/**
 *
 * @author Daniel
 */
public class MostrarJugadoresCtrl extends MostrarJugadores{
    MostrarJugadores mostrar = new MostrarJugadores();
    DefaultTableModel modelo;

  public MostrarJugadoresCtrl() {
        initComponents();
        String[] titulos ={"ID","Nombre","Fecha Nacimiento","Nacionalidad","Estatura","Peso","Posicion","Fecha Ingreso","Goles","Partidos Jugados","Asistencias","Minutos Jugados","Lesiones"};
        modelo = new DefaultTableModel(null,titulos);
        tblListaJugadores.setModel(modelo);
        mostrarDatos();
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mostrarDatos(){
        ConexionDB conexion = new ConexionDB();
        
        try {
            ResultSet resultado = conexion.consultarRegistro("SELECT * FROM Jugadores");
            
            while (resultado.next()) {                
                Object[] jugador ={resultado.getString("id"),resultado.getString("Nombre"),resultado.getString("FechaNacimiento"),resultado.getString("Nacionalidad"),resultado.getString("Estatura"),resultado.getString("Peso"),resultado.getString("Posicion"),resultado.getString("FechaIngreso"),resultado.getString("Goles"),resultado.getString("PartidosJugados"),resultado.getString("Asistencias"),resultado.getString("MinutosJugados"),resultado.getString("Lesiones")};
                modelo.addRow(jugador);
            }
        } catch (Exception e) {
        }
        
    }
    
    
}
