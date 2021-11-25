/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.ConexionDB;
import modelo.Jugador;
import vista.EditarEliminarJugador;

/**
 *
 * @author Daniel
 */
public class EditarEliminarJugadorCtrl extends EditarEliminarJugador {

    DefaultTableModel modelo;

    public EditarEliminarJugadorCtrl() {
        String[] titulos = {"ID", "Nombre", "Fecha Nacimiento", "Nacionalidad", "Estatura", "Peso", "Posicion", "Fecha Ingreso", "Goles", "PartidosJugados", "Asistencia", "MinutosJugados", "Lesiones"};
        modelo = new DefaultTableModel(null, titulos);
        tblJugadores.setModel(modelo);
        mostrarDatos();
    }

    private void mostrarDatos() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);

        }
        ConexionDB conexion = new ConexionDB();

        try {
            ResultSet resultado = conexion.consultarRegistro("SELECT * FROM Jugadores");

            while (resultado.next()) {
                Object[] jugador = {resultado.getString("id"), resultado.getString("Nombre"), resultado.getString("FechaNacimiento"), resultado.getString("Nacionalidad"), resultado.getString("Estatura"), resultado.getString("Peso"), resultado.getString("Posicion"), resultado.getString("FechaIngreso"), resultado.getString("Goles"), resultado.getString("PartidosJugados"), resultado.getString("Asistencias"), resultado.getString("MinutosJugados"), resultado.getString("Lesiones")};
                modelo.addRow(jugador);
            }
        } catch (Exception e) {
        }
    }

    public Jugador recuperarDatos() {
        Jugador jugador = new Jugador();
        int goles = (txtGoles.getText().isEmpty()) ? 0 : Integer.parseInt(txtGoles.getText());
        int partidosJugados = (txtPartidos.getText().isEmpty()) ? 0 : Integer.parseInt(txtPartidos.getText());
        int asistencias = (txtAsistencias.getText().isEmpty()) ? 0 : Integer.parseInt(txtAsistencias.getText());
        int minutosJugados = (txtMinutos.getText().isEmpty()) ? 0 : Integer.parseInt(txtMinutos.getText());
        int id = (txtId.getText().isEmpty()) ? 0 : Integer.parseInt(txtId.getText());
        float estatura = (txtEstatura.getText().isEmpty()) ? 0 : Float.parseFloat(txtEstatura.getText());
        float peso = (txtPeso.getText().isEmpty()) ? 0 : Float.parseFloat(txtPeso.getText());
        jugador.setId(id);
        jugador.setGoles(goles);
        jugador.setPartidosJugados(partidosJugados);
        jugador.setAsistencias(asistencias);
        jugador.setMinutosJugados(minutosJugados);
        jugador.setNombre(txtNombre.getText());
        jugador.setFechaNacimiento(txtFechaNacimiento.getText());
        jugador.setNacionalidad(txtNacionalidad.getText());
        jugador.setEstatura(estatura);
        jugador.setPeso(peso);
        jugador.setPosicion(txtPosicion.getText());
        jugador.setFechaIngreso(txtFechaIngreso.getText());
        jugador.setLesiones(txtLesiones.getText());

        return jugador;
    }
    
    public void editar(){
        Jugador jugador = recuperarDatos();
        ConexionDB objConexion = new ConexionDB();
        
        String strSentenciaInsert = String.format("UPDATE Jugadores SET Nombre='%s', FechaNacimiento='%s', Nacionalidad='%s', Estatura='%s', Peso='%s', Posicion='%s', FechaIngreso='%s', Goles='%s', PartidosJugados='%s', Asistencias='%s', MinutosJugados='%s', Lesiones='%s' WHERE id='%d'" ,jugador.getNombre(),jugador.getFechaNacimiento(),jugador.getNacionalidad(),jugador.getEstatura(),jugador.getPeso(),jugador.getPosicion(),jugador.getFechaIngreso(),jugador.getGoles(),jugador.getPartidosJugados(),jugador.getAsistencias(),jugador.getMinutosJugados(),jugador.getLesiones(),jugador.getId()); 
        
        
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
    }
    
    public void eliminar(){
        Jugador jugador = recuperarDatos();
        ConexionDB objConexion = new ConexionDB();
        
        String strSentenciaInsert = String.format("DELETE FROM Jugadores WHERE id=%d", jugador.getId());
        objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
        this.mostrarDatos();
    }

}
