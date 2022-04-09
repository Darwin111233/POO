package Codigofuente;

import java.util.ArrayList;
import java.util.Scanner;
//Nombres del alumnos: Darwin Rafael Castro Garcia, Jesus Salvador Angulo Flores, Christian Josue Gasca Paniagua
//Matriculas: 200100049,200100052,200100070
//Grupo: SC5-1
//Asignatura:Programacion orientada a objetos
public class Controlador {
public static ArrayList<Clientes> Lista_clientes= new ArrayList<Clientes>(); //creamos las arraylist 
public static ArrayList<Vendedor> Lista_vendedores= new ArrayList<Vendedor>();
public static ArrayList<Gerente> Lista_gerentes= new ArrayList<Gerente>();
public static ArrayList<VehiculoDeportivo> Lista_Vehiculoeportivos= new ArrayList<VehiculoDeportivo>();
public static ArrayList<Ventas> Lista_ventas= new ArrayList<Ventas>();
public static void main(String[] args) {
	
 // TODO Auto-generated method stub
int opc=0; //Asignamos y declaramos variables que usaremos en nustro proyecto
String Nombre= "";
String curp= "";
int edad= 0;
int matricula = 0;
int idCliente= 0;
String oficina_a= "";
int idventav= 0;
String RFC ="";
int Salario =0;
String lineaVeh ="";
String Marca= "";
int Modelo= 0;
String Serie= "";
String Tipoveh="";
String Alturaleron="";
int Cantidadasientos= 0;
int CantidadPuertas= 0;
int vendidosv = 0;
int Valor = 0;
String seriev= ""; 
int Matriculav= 0;
int costo= 0;

boolean respuestaic = false;

Scanner Teclado=new Scanner(System.in);
Scanner Tecladoc=new Scanner(System.in);
Scanner Tecladov=new Scanner(System.in);
Scanner Tecladog=new Scanner(System.in);
Scanner Tecladoveh=new Scanner(System.in);
Scanner Tecladoveh1=new Scanner(System.in);
Scanner Teclado1v=new Scanner(System.in);
Scanner Teclado2v=new Scanner(System.in);
Scanner Teclado3v=new Scanner(System.in);
Scanner Teclado4v=new Scanner(System.in);



	do {//inicio del metodo do-while
		System.out.println("Bienvenido al programa de la Agencia ");
		System.out.println("Autores: Darwin Rafael Castro Garcia, Jesus Salvador Angulo Flores, Christian Josue Gasca Paniagua ");
		System.out.println("Seleccione una opcion a realizar ");
		System.out.println("1.- REGISTRAR Clientes");
		System.out.println("2.- REGISTRAR Vendedores");
		System.out.println("3.- REGISTRAR Gerentes");
		System.out.println("4.- REGISTRAR Vehiculos");
		System.out.println("5.- REGISTRAR Ventas");
		System.out.println("0.- Salir");
	opc=Teclado.nextInt();
		switch (opc) {//inicia la estructura switch
		case 1://inicia el case 1
			///Se empiezan en usar parametros para agregar datos a los objetos y en las arraylist
			Clientes Cliente1=new Clientes();
			System.out.println("Ingrese Nombre del Cliente");
			Nombre=Tecladoc.nextLine();
			Cliente1.setNombre(Nombre);
			
			System.out.println("Ingrese Curp del Cliente");
			curp=Tecladoc.nextLine();
			Cliente1.setCURP(curp);
			
			System.out.println("Ingrese Edad del Cliente");
			edad=Tecladoc.nextInt();
			Cliente1.setEdad(edad);
			
			System.out.println("Ingrese el id  del Cliente");
			idCliente=Tecladoc.nextInt();
			Cliente1.setIdCliente(idCliente);
			
			Lista_clientes.add(Cliente1);
			
					
			System.out.println("Mostrando informacion del cliente registrado ");	
			System.out.println("Cliente registrado" + " ID " + Cliente1.getIdCliente() + " Nombre: " + Cliente1.getNombre() + " Edad: " + Cliente1.getEdad()+" Curp: " + Cliente1.getCURP());	
					
					
				
		
			
			
			
			break;//Termina el case 1

			

			
		case 2://Inicia el case 2	
			///Se empiezan en usar parametros para agregar datos a los objetos y en las arraylist
			Vendedor vendedor1=new Vendedor();
			System.out.println("Ingrese el Nombre vendedor");
			Nombre=Tecladov.nextLine();
			vendedor1.setNombre(Nombre);
			
			
			System.out.println("Ingrese el Curp del vendedor");
			curp=Tecladov.nextLine();
			vendedor1.setCURP(curp);
			
			System.out.println("Ingrese el Edad del vendedor");
			edad=Tecladov.nextInt();
			vendedor1.setEdad(edad);
			
			System.out.println("Ingrese Matricula del vendedor");
			matricula=Tecladov.nextInt();
			vendedor1.setMatricula(matricula);
			
			System.out.println("Ingrese RFC del vendedor");
			RFC=Tecladoveh.nextLine();
			vendedor1.setRfc(RFC);
		
			System.out.println("Ingrese Salario del vendedor");
			Salario=Teclado1v.nextInt();
			vendedor1.setSalario(Salario);
			
			System.out.println("Ingrese Numero de vehiculos vendidos por el vendedor");
			vendidosv=Tecladov.nextInt();
			vendedor1.setNum_vehiculos_vendidos(vendidosv);
			Lista_vendedores.add(vendedor1);
			
			System.out.println("Mostrando informacion del Vendedor registrado ");	
			System.out.println(" Vendedor registrado " + " Matricula "+ vendedor1.getMatricula() +" Nombre: " + vendedor1.getNombre() + " Edad: " + vendedor1.getEdad()+" Curp: " + vendedor1.getCURP() + "RFC:"
			+ vendedor1.getRfc() + " Vehiculos vendidos: " + vendedor1.getNum_vehiculos_vendidos() + " Salario: "  + vendedor1.getSalario()		);	
			break;//Termina el case 2

			
		case 3://Inicia el case 3
			///Se empiezan en usar parametros para agregar datos a los objetos y en las arraylist
			Gerente Gerente1=new Gerente();
			System.out.println("Ingrese Nombre del gerente ");
			Nombre=Tecladog.nextLine();
			Gerente1.setNombre(Nombre);
			
			System.out.println("Ingrese Curp del gerente");
			curp=Tecladog.nextLine();
			Gerente1.setCURP(curp);
			
			System.out.println("Ingrese Edad del gerente");
			edad=Tecladog.nextInt();
			Gerente1.setEdad(edad);
			
			System.out.println("Ingrese Matricula del gerente");
			matricula=Tecladog.nextInt();
			Gerente1.setMatricula(matricula);
			
			System.out.println("Ingrese La oficina del gerente");
			oficina_a=Teclado3v.nextLine();
			Gerente1.setOficina_asignado(oficina_a);
			
			System.out.println("Ingrese RFC del gerente");
			RFC=Teclado2v.nextLine();
			Gerente1.setRfc(RFC);
			
			System.out.println("Ingrese Salario del gerente");
			Salario=Tecladog.nextInt();
			Gerente1.setSalario(Salario);
			
			Lista_gerentes.add(Gerente1);
			
			System.out.println("Mostrando informacion del Gerente registrado ");	
			System.out.println(" Gerente registrado: " + " Matricula: "+ Gerente1.getMatricula() +" Nombre :" + Gerente1.getNombre() + " Edad: " + Gerente1.getEdad()+" Curp :" + Gerente1.getCURP() + " RFC :"
			+ Gerente1.getRfc() + " Vehiculos vendidos " + Gerente1.getOficina_asignado() + " Salario "  + Gerente1.getSalario());	
			break;//Termina el case 3
			
		case 4://Inicia el case 4
			///Se empiezan en usar parametros para agregar datos a los objetos y en las arraylist
			VehiculoDeportivo Vehiculo1= new VehiculoDeportivo();
			System.out.println("REGISTRANDO VEHICULO");
			
			System.out.println("Ingrese Marca del Vehiculo");
			Marca=Tecladoveh.nextLine();
			Vehiculo1.setMarca(Marca);
			
			System.out.println("Ingrese Linea del Vehiculo");
			lineaVeh=Tecladoveh.nextLine();
			Vehiculo1.setLinea(lineaVeh);
			
			System.out.println("Ingrese Modelo del Vehiculo");
			Modelo=Tecladoveh.nextInt();
			Vehiculo1.setModelo(Modelo);
			
			System.out.println("Ingrese Serie del Vehiculo");
			Serie=Tecladoveh1.nextLine();
			Vehiculo1.setSerie(Serie);
			
			System.out.println("Ingrese Tipo de Vehiculo");
			Tipoveh=Tecladoveh1.nextLine();
			Vehiculo1.setTipo(Tipoveh);
			
			
			System.out.println("Ingrese Altura del aleron del Vehiculo");
			Alturaleron=Tecladoveh1.nextLine();
			Vehiculo1.setAltura_aleron(Alturaleron);
			
			System.out.println("Ingrese Cantidad de asientos del Vehiculo");
			Cantidadasientos=Tecladoveh.nextInt();
			Vehiculo1.setCantidad_Asientos(Cantidadasientos);
			
			System.out.println("Ingrese Cantidad de puertas del Vehiculo");
			CantidadPuertas=Tecladoveh1.nextInt();
			Vehiculo1.setCantidad_Puertas(CantidadPuertas);
			
			System.out.println("Ingrese Valor del Vehiculo");
			Valor=Tecladoveh1.nextInt();
			Vehiculo1.setValor(Valor);
			
			Lista_Vehiculoeportivos.add(Vehiculo1);
			
			System.out.println("Mostrando informacion del Vehiculo registrado ");	
			System.out.println("Vehiculo registrado "+ " Marca: "+ Vehiculo1.getMarca() + " Linea: " + Vehiculo1.getLinea() + " Modelo: " + Vehiculo1.getModelo() + " Serie: " + Vehiculo1.getSerie() + " Tipo de vehiculo:"
			+ Vehiculo1.getTipo() + " Altura del Aleron: " + Vehiculo1.getAltura_aleron() + " Cantidad de asientos :"  + Vehiculo1.getCantidad_Asientos() + " Cantidad de puertas " + Vehiculo1.getCantidad_Puertas() + 
			" Valor: " + Vehiculo1.getValor() );	
			break;//Termina el case 4
			
		case 5: //Inicia el case 5
			///Se empiezan en usar parametros para agregar datos a los objetos y en las arraylist
			System.out.println("REGISTRANDO VENTA");
			Ventas objetoventa= new Ventas();
			System.out.println("Ingrese del id de la venta");
			idventav=Tecladov.nextInt();
			objetoventa.setIdVenta(idventav);
			
			System.out.println("Ingrese del id_cliente");
			matricula=Tecladov.nextInt();
			respuestaic= ValidaCliente(matricula,Lista_clientes);
//Inicia el metodo if
			if(respuestaic==true) {
				
				objetoventa.setIdClientev(matricula);
				Lista_ventas.add(objetoventa);
				 
				
				System.out.println("EL Cliente si existe");
				
				
				
			}//Termina el if
			else {//Inicia el metodo else
				System.out.println("El cliente no existe");
				break;
			}//Termina el metodo else
			
			System.out.println("Ingrese la serie del vehiculo vendido");
			seriev=Teclado3v.nextLine();
			objetoventa.setIdserie(seriev);
			
			System.out.println("Ingrese la Matricula del vendedor");
			Matriculav=Teclado4v.nextInt();
			objetoventa.setMatriculav(Matriculav);
			
			System.out.println("Ingrese el costo del vehiculo");
			costo=Tecladov.nextInt();
			objetoventa.setCostov(costo);
			
			Lista_ventas.add(objetoventa);
			System.out.println("Mostrando informacion del Vehiculo registrado ");	
			System.out.println("Vehiculo registrado "+ " Id de la venta : "+ objetoventa.getIdVenta() + " Id del cliente : " + objetoventa.getIdClientev() + " Serie del vehiculo: " + objetoventa.getIdserie() + " Serie: " + objetoventa.getIdserie() + " Matricula del vendedor: "
			+ objetoventa.getMatriculav() + " Costo del vehiculo: " + objetoventa.getCostov());	
			break;//Termina case 5
		}}while (opc!=0); //Termina el metodo do-while
	System.out.println("Fuera del Menu");

	//Se empiezan cerrar variables tipo Scanner
	Teclado.close();
	Tecladov.close();
	Tecladoc.close();
	Tecladoveh.close();
	Tecladog.close();
	Tecladoveh1.close();
	Teclado1v.close();
	Teclado2v.close();
	Teclado3v.close();
	Teclado4v.close();
	}
//Metodo para validar si existe el id cliente en la lista clientes
      public static boolean ValidaCliente (int idCliente,ArrayList<Clientes> lista_clientes2) {
		boolean Resultado=false;
		for(int x=0;x<lista_clientes2.size();x++){
			if(lista_clientes2.get(x).getIdCliente()==idCliente) {
			Resultado=true;	
			}
		
		}return Resultado;
		
      }
  	}//Termina el codigo



