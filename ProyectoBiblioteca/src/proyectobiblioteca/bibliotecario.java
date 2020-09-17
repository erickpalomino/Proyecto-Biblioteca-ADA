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
public class bibliotecario extends Actor {

    public bibliotecario(int clave) {
       this.setCodigo(getNumeroDeActores());
       this.setPassword(clave);
       this.setNivel(2);
        setNumeroDeActores(getNumeroDeActores()+1);
    }

    
    
}
