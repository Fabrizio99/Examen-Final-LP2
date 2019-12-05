/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bean;

/**
 *
 * @author lab01
 */
public class alumno {
    private int cod_al;
    private String nom_alum;
    private int cod_esp;
    private String foto;

    public int getCod_al() {
        return cod_al;
    }

    public void setCod_al(int cod_al) {
        this.cod_al = cod_al;
    }

    public String getNom_alum() {
        return nom_alum;
    }

    public void setNom_alum(String nom_alum) {
        this.nom_alum = nom_alum;
    }

    public int getCod_esp() {
        return cod_esp;
    }

    public void setCod_esp(int cod_esp) {
        this.cod_esp = cod_esp;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
