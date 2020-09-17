/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

/**
 *
 * @author USER
 */
public class solicitud {
    usuario user1;
    Libro lib;
    
    public solicitud(usuario user1, Libro lib) {
        this.user1 = user1;
        this.lib = lib;
    }

    public usuario getUser1() {
        return user1;
    }

    public void setUser1(usuario user1) {
        this.user1 = user1;
    }

    public Libro getLib() {
        return lib;
    }

    public void setLib(Libro lib) {
        this.lib = lib;
    }
    
 public  String toString(){
        return "Usuario: "+this.getUser1().getCodigo() +
                "  solicita el Libro: " +  this.getLib().getTitulo() +
                " con codigo: " +this.getLib().getISBN()+
                "\n";
    }

    
}
