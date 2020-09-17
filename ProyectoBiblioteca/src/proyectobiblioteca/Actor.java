package proyectobiblioteca;

import java.io.Serializable;

public class Actor implements Serializable{

    private int nivel; //usuario=1 , bibliotecario=2 , admin=3
    private int codigo;
    private int password;
    private static int numeroDeActores = 0;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public static int getNumeroDeActores() {
        return numeroDeActores;
    }

    public static void setNumeroDeActores(int aNumeroDeActores) {
        numeroDeActores = aNumeroDeActores;
    }
    public String toString(){
        return "código: "+this.codigo+" password: "+ this.password+" nivel: "+this.nivel+" \n";
    }
}
