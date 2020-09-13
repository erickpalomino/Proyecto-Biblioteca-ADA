
public class Actor {
	private int nivel; //usuario=1 , bibliotecario=2 , admin=3
	private int codigo;
	private int password;
	private static int numeroDeActores = 0;
	
	public Actor(int nivel, int password) {
		this.nivel = nivel;
		this.password = password;
		codigo = ++numeroDeActores;
	}
	
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
}
