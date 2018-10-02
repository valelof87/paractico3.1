
public class TestArrayPrivado {

	public static void main(String[] args) {
		ArrayPrivado a1 = new ArrayPrivado();
			a1.addNombre("juan");
			a1.addNombre("vale");
			
			System.out.println(a1.getContadorEscritura() );
			
			System.out.println(a1.getNombres());
			
			System.out.println(a1.getContadorLectura());
		

	}

}
