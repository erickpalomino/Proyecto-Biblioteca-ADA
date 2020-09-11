/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.io.Serializable;


/**
 *
 * @author Erick
 */
public class Libro implements Serializable{

    private String titulo;
    private String autor;
    private String area;
    private String codigoPosicion;
    private String codigoDewey;
    private String editorial;
    private int ISBN;
    private int nroPags;
    private int año;
    private int nroEjemplares;
    private int nroEjemplaresDisponibles;
    private int añoRegistro;
    public Libro(String titulo,String autor, String codigoDewey,String editorial,int ISBN, int nroPags,
            int nroEjemplares,int año, int añoRegistro){
        this.titulo=titulo;
        this.autor=autor;
        this.codigoDewey=codigoDewey;
        this.nroPags=nroPags;
        this.nroEjemplaresDisponibles=nroEjemplares;
        this.nroEjemplares=nroEjemplares;
        this.año=año;
        this.añoRegistro=añoRegistro;
        this.editorial=editorial;
        this.ISBN=ISBN;
    }

    
    public  String toString(){
        return "Título: "+this.getTitulo()+" Autor: "+this.getAutor()+" Año: "
        + ""+this.getAño()+" Codigo: "+this.getISBN() +" Editorial: "+this.getEditorial()+" Ejemplares disponibles: "+this.getNroEjemplaresDisponibles() +"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCodigoPosicion() {
        return codigoPosicion;
    }

    public void setCodigoPosicion(String codigoPosicion) {
        this.codigoPosicion = codigoPosicion;
    }

    public String getCodigoDewey() {
        return codigoDewey;
    }

    public void setCodigoDewey(String codigoDewey) {
        this.codigoDewey = codigoDewey;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNroPags() {
        return nroPags;
    }

    public void setNroPags(int nroPags) {
        this.nroPags = nroPags;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getNroEjemplaresDisponibles() {
        return nroEjemplaresDisponibles;
    }

    public void setNroEjemplaresDisponibles(int nroEjemplaresDisponibles) {
        this.nroEjemplaresDisponibles = nroEjemplaresDisponibles;
    }

    public int getAñoRegistro() {
        return añoRegistro;
    }

    public void setAñoRegistro(int añoRegistro) {
        this.añoRegistro = añoRegistro;
    }
}
