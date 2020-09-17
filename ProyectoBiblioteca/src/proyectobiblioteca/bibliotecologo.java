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
public class bibliotecologo extends Actor {
//atributos

    public bibliotecologo() {
    }

    public bibliotecologo(int clave) {
        this.setCodigo(this.getNumeroDeActores()+1);
        this.setPassword(clave);
        this.setNivel(3);
        this.setNumeroDeActores(getNumeroDeActores()+1);
    }
}
