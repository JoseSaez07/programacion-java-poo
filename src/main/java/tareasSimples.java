public class tareasSimples {
	
public tareasSimples(String nombre, String apellido, double nota, boolean completado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.completado = completado;

	}

	public tareasSimples() {
		
	}

	public tareasSimples(String nombre2, int i, int nota2) {
		
	}

	String nombre;
	String apellido;
	double nota;
	public String titulo;
	boolean completado;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getNota() {
		return nota;
	}
	public void mostrarTarea() {
		if(completado) {
			System.out.println("La tarea " + nombre +" esta completada");
		} else {
			System.out.println("La tarea " + nombre +" no esta completada");
		}
   }
	public void cambiarEstado() {
		this.completado=!completado;
		
		}


	public void setNota(double nota) {
		this.nota = nota;
	}


}
