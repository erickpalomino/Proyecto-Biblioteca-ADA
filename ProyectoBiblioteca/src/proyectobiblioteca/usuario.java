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
public class usuario {
    //atributos
    private int codigo;
    private int clave;
    private int tipo;//este atributo es para diferenciar entre tipos de usuario
    private HashTable h1n1 = HashTable.LeerArchivo();
    private boolean habilitado;
    //private libro libro_prestado; // para cuando se cree 
    private String libro_prestado;
    
    public usuario(){
        
    }
    public usuario(int codigo, int clave, int tipo, 
            boolean habilitado, String libro_prestado){
        this.codigo = codigo;
        this.clave = clave;
        this.tipo = tipo;
        this.habilitado = habilitado;
        this.libro_prestado = libro_prestado;
    }
    //metodos
    String buscar(String nombre){
        //h1n1.buscarNombre(nombre);
        ArrayList<Libro> listaLibros=h1n1.buscarNombre(nombre);
        String TextoImpreso="";
        for(Libro lib:listaLibros){
            TextoImpreso=TextoImpreso + lib.toString()+ "\n";
        }
        return TextoImpreso;
    }
    void solicitar_prestamo(){
        
    }
    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public int getClave() {
        return clave;
    }

    public int getTipo() {
        return tipo;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public String getLibro_prestado() {
        return libro_prestado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setLibro_prestado(String libro_prestado) {
        this.libro_prestado = libro_prestado;
    }
    
}
