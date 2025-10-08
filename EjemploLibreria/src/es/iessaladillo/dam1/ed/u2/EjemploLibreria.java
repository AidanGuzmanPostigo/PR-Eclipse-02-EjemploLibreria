package es.iessaladillo.dam1.ed.u2;
import org.joda.time.LocalDate;
public class EjemploLibreria {
	public static void main(String[] args) {
		LocalDate hoy = new LocalDate();
		LocalDate futuro = hoy.plusDays(10);
		System.out.println("Hoy es: " + hoy);
		System.out.println("Dentro de 10 días será: " + futuro);
	}
}