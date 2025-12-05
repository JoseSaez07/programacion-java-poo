public class MainTareasSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         tareasSimples objeto1 = new tareasSimples();
         objeto1.setTitulo("Nuevo titulo");
         System.out.println(objeto1.getTitulo());
         tareasSimples objeto2 = new tareasSimples("Otra tarea", 2,2);
         System.out.println(objeto2.getTitulo());
        
         
	}

}
