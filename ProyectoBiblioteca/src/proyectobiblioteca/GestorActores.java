import java.util.ArrayList;

public class GestorActores {
	ArrayList<Actor> actores;
	
	public GestorActores() {
		actores = new ArrayList<>();
	}
	
	public void registrar(int password) {
		registrar(password, 1);
	}
	
	public void registrar(int password, int nivel) {
		actores.add(new Actor(nivel, password));
	}
	
	public Actor buscar(int codigo) {
		return actores.get(codigo-1);
	}
	
	public void guardarEnArchivo() {
		
	}
	
	public static void leerEnArchivo() {
		
	}

}