/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelo.ConexionDB;
import modelo.Jugador;
import vista.AgregarJugador;

/**
 *
 * @author Daniel
 */
public class AgregarJugadorCtrl extends AgregarJugador{
    //AgregarJugador agregar = new AgregarJugador();
    //private AgregarJugador agregar;
    
    
    public void agregar(){
        Jugador jugador = recuperarDatos();
        ConexionDB objConexion = new ConexionDB();
        
        String strSentenciaInsert = String.format("INSERT INTO Jugadores(id, Nombre, FechaNacimiento, Nacionalidad, Estatura, Peso, Posicion, FechaIngreso)"
                + "VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')", jugador.getId(),jugador.getNombre(),jugador.getFechaNacimiento(),jugador.getNacionalidad(),jugador.getEstatura(),jugador.getPeso(),jugador.getPosicion(),jugador.getFechaIngreso());
        
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
    }
    
 public Jugador recuperarDatos(){
     AgregarJugador ju = new AgregarJugador();
        Jugador jugador = new Jugador();
       int id = (ju.txtId.getText().isEmpty())?0:Integer.parseInt(txtId.getText());
            float estatura = (ju.txtEstatura.getText().isEmpty())?0:Float.parseFloat(txtEstatura.getText());
            float peso = (txtPeso.getText().isEmpty())?0:Float.parseFloat(txtPeso.getText());
            jugador.setId(id);            
            jugador.setNombre(txtNombre.getText());
            jugador.setFechaNacimiento(txtFechaNacimiento.getText());
            jugador.setNacionalidad(txtNacionalidad.getText());
            jugador.setEstatura(estatura);
            jugador.setPeso(peso);
            jugador.setPosicion(txtPosicion.getText());
            jugador.setFechaIngreso(txtFechaIngreso.getText());            
            
            return jugador;

    } 
}
