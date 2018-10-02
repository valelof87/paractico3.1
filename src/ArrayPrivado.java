import java.util.ArrayList;
import java.util.List;

public class ArrayPrivado {
	private String[] nombres;
	private int contadorEscritura= 0;
	private int contadorLectura = 0;
	
	public ArrayPrivado() {
		nombres = new String[5];		
	}
	
	public String  getNombres() {
		contadorLectura ++;
		nombres = new String[5];
		for(int i=0; i < nombres.length; i++) {
		return  nombres[i];
		}
		return null;
	}
	
	public void setNombres(String [] nombres) {  
	    this.nombres = nombres;  
	    contadorEscritura ++;
	}  
	
	public void addNombre(String nombre) {
		nombres = new String[5];
		for(int i=0; i< nombres.length; i++) {
			nombres[i]= nombre;
			}
			contadorEscritura ++;
		}
		
	
	public int getContadorEscritura() {
		return contadorEscritura;
	}
	
	public int getContadorLectura() {
		return contadorLectura;
	}
}
