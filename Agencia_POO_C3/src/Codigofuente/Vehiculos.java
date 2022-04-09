package Codigofuente;

public class Vehiculos {//Asignamos y declaramos variables
public static String serie= "";
public static String marca= "";
public static int Modelo= 0;
public static String tipo= "";
public static String linea= "";
public static int Valor = 0;
//Generamos los getters and setters
public String getSerie() {
	return serie;
}
public void setSerie(String serie) {
	Vehiculos.serie = serie;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	Vehiculos.marca = marca;
}
public int getModelo() {
	return Modelo;
}
public void setModelo(int modelo) {
	Modelo = modelo;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	Vehiculos.tipo = tipo;
}
public String getLinea() {
	return linea;
}
public void setLinea(String linea) {
	Vehiculos.linea = linea;
}
public int getValor() {
	return Valor;
}
public void setValor(int valor) {
	Valor = valor;
}
}
