package ejerJavaDoc;

public class Empleado {
	private String nombre;
	private String apellido;
	private double salario; 
	/**
	 * <h2>Clase Empleado</h2>
	 * @author Ruben
	 */

public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.salario = salario;
}
/**
 * 
 * @param nombre Nombre del empleado
 * @param apellido Apellido del empleado
 * @param salario salario base 
 */

public void subirsalario (double subida) {
	salario=salario+subida;
}
/**
 * @see Empleado
 * @param subida indica la cantidad que se va a subir
 */

private boolean comprobar() {
	if (nombre.equals("")) {
		return false;
	}
	return true;
}
/** comprueba que el nombre no esta vacio
 * @return <ul>
 * <li>true: nombre no es una cadena vacia</li>
 * <li>false: nombre es una cadena vacia</li>
 * <ul>
 */
}