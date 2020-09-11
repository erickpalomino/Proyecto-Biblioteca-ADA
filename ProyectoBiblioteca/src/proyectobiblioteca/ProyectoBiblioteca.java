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
        System.out.println(h2.toString());
        /*Libro libro1=new Libro("Hola mundo", "Erick Palomino", "000.112.123", "Norma", 123451,200,10, 2020, 2020);
        HashTable h1= new HashTable();
        h1.añadir(libro1);
        h1.GuardarEnArchivo();*/

    }
}
