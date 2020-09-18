package proyectobiblioteca;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.*;
import java.util.ArrayList;

public class GestorActores implements Serializable {

    ArrayList<Actor> actores;
    int codGen=0;
    private static final long serialVersionUID =4529685098267757690L;

    public GestorActores(){
        actores = new ArrayList<Actor>();
    }
    
    public void registrar(int password, int nivel) {
        Actor newActor;
        switch (nivel) {
            case 1:
                newActor=new usuario(password);
                newActor.setCodigo(codGen);
                actores.add(newActor);
                
                break;
            case 3:
                newActor=new bibliotecologo(password);
                newActor.setCodigo(codGen);
                actores.add(newActor);
                break;
        }
        codGen++;
        guardarEnArchivo();
    }

    public Actor buscar(int codigo) {
        for(Actor a:actores){
            if(a.getCodigo()==codigo){
                return a;
            }
        }
        System.out.println("Actor no encontrado");
        return null;
    }
    public void eliminar(int codigo){
        Actor actElim=buscar(codigo);
        actores.remove(actElim);
        guardarEnArchivo();
    }
    
    public boolean Login(int codigo,int contraseña){
        boolean validacion=false;
        Actor act=buscar(codigo);
        if (act.getPassword()==contraseña){
            validacion=true;
        }
        else
            validacion=false;
        if(validacion){
            switch(act.getNivel()){
                case 1:UsuarioFrame u=new UsuarioFrame();
                usuario user;
                user=(usuario)act;
                u.setUser1(user);
                u.actualizarUsuario();
            u.setVisible(true);
                break;
                case 3:BibliotecologoFrame b1=new BibliotecologoFrame();
                b1.setVisible(true);
                break;
            }
        }
        else{
            System.out.println("Credenciales inválidas");
        }
        return validacion;
    }

    public void guardarEnArchivo() {
        try{
            FileOutputStream fos= new FileOutputStream("Data/Actores.dat");
            ObjectOutputStream out=new ObjectOutputStream(fos);
            out.writeObject(this);
            out.close();
            fos.close();
            System.out.println("Serialización terminada");
        }catch(IOException i){
            i.printStackTrace();
        }
    }

    public static GestorActores leerEnArchivo() {
        try {
         FileInputStream fileIn = new FileInputStream("Data/Actores.dat");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         GestorActores cpy = (GestorActores) in.readObject();
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
        String result="";
        for(Actor a:actores){
            result+=a.toString();
        }
        return result;
    }

}
