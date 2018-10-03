import java.util.ArrayList;
import java.util.List;

public class ArrayPrivado {
	private String[] nombres;
	private int contadorEscritura= 0;
	private int contadorLectura = 0;
	private int indice= -1;
	
	public ArrayPrivado() {
		nombres = new String[5];		
	}
	
	public String  getNombres() {
		contadorLectura ++;
		String s = " ";
		for(int i=0; i <= indice; i++) {
			s = s + nombres[i]+ "  "  ;
			
			}
			return s;
	}
	
	public void setNombres(String [] nombres) {  
	    this.nombres = nombres;  
	    contadorEscritura ++;
	}  
	
	public void addNombre(String nombre) {
			indice ++;
			nombres[indice]= nombre;
			contadorEscritura ++;
		}
		
	
	public int getContadorEscritura() {
		return contadorEscritura;
	}
	
	public int getContadorLectura() {
		return contadorLectura;
	}
}
