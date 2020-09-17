package proyectobiblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.io.*;
import java.util.ArrayList;

public class GestorSolicitudes implements Serializable{
      Queue<solicitud> cola_solicitud;
      private static final long serialVersionUID =7749685098267757690L;
      
      //constructor
    public GestorSolicitudes() {
        cola_solicitud =  (Queue<solicitud>) new ArrayList<solicitud>();
    }
    
    public void encolar(solicitud sol){
         System.out.println("this pass for here 1");
        //cola_solicitud.add(sol);
        System.out.println("this pass for here 2 ");
        //guardarEnArchivo();
    }
/*
public void guardarEnArchivo() {
    try{
        FileInputStream fileIn = new FileInputStream("Data/Solicitudes.dat");
        FileOutputStream fos= new FileOutputStream("Data/Solicitudes.dat");
        ObjectOutputStream out=new ObjectOutputStream(fos);
        out.writeObject(this);
        out.close();
        fos.close();
        System.out.println("Serialización terminada");
    }catch(IOException i){
        i.printStackTrace();
    }   
}*/

public static GestorSolicitudes leerEnArchivo() {
        try {
         FileInputStream fileIn = new FileInputStream("Data/Solicitudes.dat");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         GestorSolicitudes cpy = (GestorSolicitudes) in.readObject();
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

    public Queue<solicitud> getCola_solicitud() {
        return cola_solicitud;
    }

    public void setCola_solicitud(Queue<solicitud> cola_solicitud) {
        this.cola_solicitud = cola_solicitud;
    }
    public String toString(){
        String result="";
        
        for (solicitud object : cola_solicitud) {
            result = result + object.toString();
        }
        return result;
    }
}
