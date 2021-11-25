/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class ConexionDB {
    String strConexionDB = "jdbc:sqlite:C:/Users/Daniel/Documents/Universidad/2021-2/Ingenieria de software/DB App futbol.s3db";
    Connection con=null;
    
    public ConexionDB(){
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Error de conexión"+e);
        }
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistro(String strSentenciaSQL){
        try {
            PreparedStatement pstm =con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    
    
}
