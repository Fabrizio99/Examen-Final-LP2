/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.bean.especialidad;

/**
 *
 * @author lab01
 */
public class especialidadDAO {

    public static ArrayList<especialidad> listar() {
        ArrayList<especialidad> lista = new ArrayList();
        
        especialidad esp = null;
        String sql = "select * from especialidad";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                esp = new especialidad();
                esp.setCod_esp(rs.getInt("cod_esp"));
                esp.setNom_esp(rs.getString("nom_esp"));
                lista.add(esp);
            }
            cn.close();
            pst.close();
            rs.close();
            return lista;
        } catch (Exception e) {
            return null;
        }
    }

    public static especialidad buscar(int id) {
        especialidad esp = null;
        String sql = "select * from especialidad where cod_esp=?";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                esp = new especialidad();
                esp.setCod_esp(rs.getInt("cod_esp"));
                esp.setNom_esp(rs.getString("nom_esp"));
            }
            cn.close();
            pst.close();
            rs.close();
            return esp;
        } catch (Exception e) {
            return null;
        }
    }

    public static void insertar(especialidad esp) {
        String sql = "insert into especialidad (nom_esp) values(?)";
        Connection cn = Conexion.conexion.abrir();
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, esp.getNom_esp());
            pst.executeUpdate();
            cn.close();
            pst.close();
        } catch (Exception e) {
        }
    }
}
