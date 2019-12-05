/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.bean.alumno;

/**
 *
 * @author lab01
 */
public class alumnosDAO {
    public static ArrayList<alumno> alumnosEspecialidad(int idEspecialidad){
        ArrayList<alumno> lista = new ArrayList();
        alumno al = null;
        String sql = "select * from alumno where cod_esp=?";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idEspecialidad);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                al = new alumno();
                al.setCod_al(rs.getInt("cod_al"));
                al.setNom_alum(rs.getString("nom_alum"));
                al.setCod_esp(rs.getInt("cod_esp"));
                al.setFoto(rs.getString("foto"));
                lista.add(al);
            }
            cn.close();
            pst.close();
            rs.close();
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public static alumno buscar(int idAlumno){
        alumno al = null;
        String sql = "select * from alumno where cod_al=?";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idAlumno);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                al = new alumno();
                al.setCod_al(rs.getInt("cod_al"));
                al.setNom_alum(rs.getString("nom_alum"));
                al.setCod_esp(rs.getInt("cod_esp"));
                al.setFoto(rs.getString("foto"));
            }
            cn.close();
            pst.close();
            rs.close();
            return al;
        } catch (Exception e) {
            return null;
        }
    }
    public static int cantidadAlumnosEspecialidad(int idEspecialidad){
        String sql = "select count(cod_al) from alumno where cod_esp=?";
        Connection cn = Conexion.conexion.abrir();
        int cantidad = 0;
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idEspecialidad);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cantidad = rs.getInt("count(cod_al)");
            }
            cn.close();
            pst.close();
            rs.close();
            return cantidad;
        } catch (Exception e) {
            return 0;
        }
    }
    public static ArrayList<alumno> alumnosEspecialidadIndice(int idEspecialidad, int primerNumero, int saltos){
        ArrayList<alumno> lista = new ArrayList();
        alumno al = null;
        primerNumero = (primerNumero-1)*3;
        String sql = "select * from alumno where cod_esp=? LIMIT ?,?";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idEspecialidad);
            pst.setInt(2, primerNumero);
            pst.setInt(3, saltos);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                al = new alumno();
                al.setCod_al(rs.getInt("cod_al"));
                al.setNom_alum(rs.getString("nom_alum"));
                al.setCod_esp(rs.getInt("cod_esp"));
                al.setFoto(rs.getString("foto"));
                lista.add(al);
            }
            cn.close();
            pst.close();
            rs.close();
            return lista;
        } catch (Exception e) {
            return null;
        }
    }
}
