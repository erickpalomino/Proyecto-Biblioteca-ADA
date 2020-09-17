/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.io.*;

/**
 *
 * @author Erick
 */
public class ProyectoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashTable h2 = HashTable.LeerArchivo();
        /*Libro lib1=new Libro("aw", "Erick Palomino", "000.112.123", "Norma", 12,200,10, 2020, 2020);
        Libro lib2=new Libro("aba", "Erick Palomino", "000.112.123", "Norma", 1234,200,10, 2020, 2020);
        Libro lib3=new Libro("acbc", "Erick Palomino", "000.112.123", "Norma", 14322,200,10, 2020, 2020);
        Libro lib4=new Libro("adbdd", "Erick Palomino", "000.112.123", "Norma", 5,200,10, 2020, 2020);
        Libro lib5=new Libro("abbcd", "Erick Palomino", "000.112.123", "Norma", 13422,200,10, 2020, 2020);
        h2.añadir(lib1);
        h2.añadir(lib2);
        h2.añadir(lib3);
        h2.añadir(lib4);
        h2.añadir(lib5);
        h2.GuardarEnArchivo();*/
        System.out.println(h2.toString());
        GestorActores g1=GestorActores.leerEnArchivo();
        //g1.registrar(123, 3);
        System.out.println(g1.toString());
        /*Libro libro1=new Libro("Hola mundo", "Erick Palomino", "000.112.123", "Norma", 123451,200,10, 2020, 2020);
        HashTable h1= new HashTable();
        h1.añadir(libro1);
        h1.GuardarEnArchivo();*/

    }
}
