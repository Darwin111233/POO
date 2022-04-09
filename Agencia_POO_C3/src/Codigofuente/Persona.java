package Codigofuente;

public class Persona {//Asignamos y declaramos variables
public static String Nombre;
public static String CURP = "";
public static int Edad = 0;
//Generamos los getters and setters
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getCURP() {
	return CURP;
}
public void setCURP(String cURP) {
	CURP = cURP;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}


}
