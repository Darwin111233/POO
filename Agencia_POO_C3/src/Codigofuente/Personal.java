package Codigofuente;

public class Personal extends Persona{
public static int Salario=0;	
public static String Rfc = "";
public static int Matricula=0;
//Generamos los getters and setters
public int getSalario() {
	return Salario;
}
public void setSalario(int salario) {
	Salario = salario;
}
public String getRfc() {
	return Rfc;
}
public void setRfc(String rfc) {
	Rfc = rfc;
}
public int getMatricula() {
	return Matricula;
}
public void setMatricula(int matricula) {
	Matricula = matricula;
}


}
