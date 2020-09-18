/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class usuario extends Actor{
    //atributos
    private boolean habilitado;
    ArrayList<Libro> listaLibros;
    //private libro libro_prestado; // para cuando se cree 
    private String libro_prestado;
    
    public usuario(){
        
    }
    public usuario(int clave){
        this.setPassword(clave); 
        this.setNivel(1);
        this.listaLibros=new ArrayList<Libro>();
        this.habilitado = habilitado;
        this.libro_prestado = "";
    }
    //metodos
    String buscar(String nombre){
        //h1n1.buscarNombre(nombre);
        this.listaLibros=ProyectoBiblioteca.hashTableGeneral.buscarNombre(nombre);
        String TextoImpreso="";
        for(Libro lib:listaLibros){
            TextoImpreso=TextoImpreso + lib.toString()+ "\n";
        }
        return TextoImpreso;
    }
    //ordenamiento por inserción directa
    String ordenarAlfabeticamente(){
        String TextoImpreso="";
        Libro aux;
        int k;
        for(int i=1;i<listaLibros.size();i++){
            aux=listaLibros.get(i);
            k=i-1;
            while((k>=0)&&((aux.getTitulo().compareToIgnoreCase(listaLibros.get(k).getTitulo())))<0){
                listaLibros.set(k+1,listaLibros.get(k));
                k=k-1;
            }
            listaLibros.set(k+1, aux);
        }
        for(Libro lib:listaLibros){
            TextoImpreso=TextoImpreso + lib.toString()+ "\n";
        }
        return TextoImpreso;
    }
    
    void solicitar_prestamo(){
        
    }
    //getters and setters
    public boolean isHabilitado() {
        return habilitado;
    }

    public String getLibro_prestado() {
        return libro_prestado;
    }
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setLibro_prestado(String libro_prestado) {
        this.libro_prestado = libro_prestado;
    }
    
}
