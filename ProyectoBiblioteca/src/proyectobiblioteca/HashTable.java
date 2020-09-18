/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobiblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *Clase Hashtable que almacenará a los libros y los guardará en un archivo
 * @author Erick
 */
public class HashTable implements Serializable{ 
    private ArrayList<Libro>[] arrayGeneral= new ArrayList[100];
    private static final long serialVersionUID =6529685098267757690L; //código de serialización, para evitar errores
    public HashTable(){
        for(int i=0;i<arrayGeneral.length;i++){
            arrayGeneral[i]=new ArrayList<Libro>();
        }
    }
    
    //método para añadir nuevos libros a la biblioteca
    public void añadir(Libro libro){
        int pos=hash(libro);
        int pos1=0;
        boolean existe= false;
        if(arrayGeneral[pos]==null){
            arrayGeneral[pos].add(libro);
        }
        else{// ocurre colisión
            for (Libro lib:arrayGeneral[pos]){
                if(lib.getISBN()==libro.getISBN()){
                    existe=true;
                    lib.setNroEjemplares(lib.getNroEjemplares()+libro.getNroEjemplares());
                    System.out.println("Este libro ya se encuentra registrado");
                    break;
                }
                pos1++;
            }
            if(!existe){
                pos1=arrayGeneral[pos].size();
                arrayGeneral[pos].add(pos1, libro);
            }
        }
        System.out.println("Libro añadido en la posición: "+pos+" del Arreglo general y"
                + " la posición: "+pos1+" delArrayList");
        GuardarEnArchivo();
    }
    
    /*Busqueda de libro por ISBN, devuelve un arreglo de dos posiciones
    la primera posición es dentro del arreglo general, la segunda es dentro de la 
    lista ubicada en la primera posición.*/
    public Libro busquedaISBN(int isbn){
        int pos;
        pos=hash(isbn);
        if(arrayGeneral[pos]==null){
            return null;
        }
        else{// ocurre colisión
            for (Libro lib:arrayGeneral[pos]){
                if(lib.getISBN()==isbn){
                    System.out.println("Este libro ya se encuentra registrado");
                    return lib;
                }
            }
        }
        return null;
    } 
    //método para eliminar un libro de la tabla, puede ser modificado para que retorne booleano y sea mmás manejable
    public void eliminarLibro(int ISBN){
        Libro lib=busquedaISBN(ISBN);
        int pos=0;
        pos=hash(ISBN);
        if(arrayGeneral[pos].remove(lib)){
            System.out.println("Eliminaste bien");
            GuardarEnArchivo();
        }
        else
            System.out.println("No se encontró el Libro");
    }
        
    
    //método que busca secuencialmente los libros que contengan el string nombre
    public ArrayList<Libro> buscarNombre(String nombre){
        ArrayList<Libro> libros=new ArrayList<Libro>();
        for(int i=0;i<arrayGeneral.length;i++){
            for(Libro lib:arrayGeneral[i]){
                if(lib.getTitulo().contains(nombre)){
                    libros.add(lib);
                }
            }
        }
        return libros;
    }
    
    
    private int hash(Libro libro){
        int n;
        n=libro.getISBN()%100;
        return n;
    }
    private int hash(int isbn){
        int n;
        n=isbn%100;
        return n;
    }

    public ArrayList<Libro>[] getArrayGeneral() {
        return arrayGeneral;
    }

    public void setArrayGeneral(ArrayList<Libro>[] arrayGeneral) {
        this.arrayGeneral = arrayGeneral;
    }
    //método para serializar y guardar la tabla en un archivo
    public void GuardarEnArchivo(){
        try{
            FileOutputStream fos= new FileOutputStream("Data/HashTableData.dat");
            ObjectOutputStream out=new ObjectOutputStream(fos);
            out.writeObject(this);
            out.close();
            fos.close();
            System.out.println("Serialización terminada");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    //método estático para copiar o leer el archivo y generar tablas con la info guardada.
    public static HashTable LeerArchivo(){
        try {
         FileInputStream fileIn = new FileInputStream("Data/HashTableData.dat");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         HashTable cpy = (HashTable) in.readObject();
         in.close();
         fileIn.close();
         return cpy;
      } catch (IOException i) {
         i.printStackTrace();
         return null ;
      } catch (ClassNotFoundException c) {
         System.out.println(" class not found");
         c.printStackTrace();
         return null;
      }
    }
    
    public String toString(){
        String str= "";
        for (int i=0;i<this.arrayGeneral.length;i++){
            for (Libro lib: arrayGeneral[i]){
                str= str + lib.toString();
            }
        }
        return str;
    }
}
