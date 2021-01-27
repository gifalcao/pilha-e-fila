import java.util.LinkedList;
import java.util.Queue;

public class Testefila {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Gi");
		fila.adiciona("Falcao");
		System.out.println(fila);
		
		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> Fila = new LinkedList<String>();
		
		Fila.add("Gi");
		String x2 = Fila.poll();
		System.out.println(x2);
	}
}
