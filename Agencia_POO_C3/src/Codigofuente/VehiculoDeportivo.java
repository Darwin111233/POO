package Codigofuente;

public class VehiculoDeportivo extends Vehiculos {//Asignamos y declaramos variables
public static int Cantidad_Asientos = 0;
public static int Cantidad_Puertas = 0;
public static String Altura_aleron = "";
//Generamos los getters and setters 
public int getCantidad_Asientos() {
	return Cantidad_Asientos;
}
public void setCantidad_Asientos(int cantidad_Asientos) {
	Cantidad_Asientos = cantidad_Asientos;
}
public int getCantidad_Puertas() {
	return Cantidad_Puertas;
}
public void setCantidad_Puertas(int cantidad_Puertas) {
	Cantidad_Puertas = cantidad_Puertas;
}
public String getAltura_aleron() {
	return Altura_aleron;
}
public void setAltura_aleron(String altura_aleron) {
	Altura_aleron = altura_aleron;
}


}
