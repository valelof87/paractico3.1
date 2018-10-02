import java.util.ArrayList;
import java.util.List;

public class ArrayPrivado {
	private List <String> nombres;
	protected int contadorEscritura;
	protected int contadorLectura;
	
	public ArrayPrivado() {
		nombres = new ArrayList <String>();
		
	}
	
	public List <String> getNombres() {
		contadorLectura ++;
		return this.nombres;
		
	}
	
	public void setNombres(List<String> nombres) {  
	    this.nombres = nombres;  
	    contadorEscritura ++;
	}  
	
	public void addNombre(String nombre) {
		nombres.add(nombre);
		contadorEscritura ++;
	}
	
	public int getContadorEscritura() {
		return contadorEscritura;
	}
	
	public int getContadorLectura() {
		return contadorLectura;
	}
}
