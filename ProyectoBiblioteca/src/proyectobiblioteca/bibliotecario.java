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
public class bibliotecario {
//atributos
    private int codigo;
    private int clave;
    private int tipo; //este atributo es para diferenciar entre tipos de usuario
    public bibliotecario() {
    }

    public bibliotecario(int codigo, int clave, int tipo) {
        this.codigo = codigo;
        this.clave = clave;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
