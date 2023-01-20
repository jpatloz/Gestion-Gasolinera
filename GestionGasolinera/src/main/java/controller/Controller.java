package controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dal.PagosRepostaje;
import dal.PagosRepostajeServicio;
import impl.Consultas;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("contexto.xml");
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		Integer opcion1;
		do{
		System.out.println("Escriba el valor a uno de los asignados");
		System.out.println("1.-Repostaje normal");
		System.out.println("2.-Repostaje factura");
		System.out.println("3.-Ver todos los repostajes.");
		System.out.println("4.-Importe total combustible vendido.");
		System.out.println("5.-Llenado de deposito.");
		System.out.println("6.-Eliminar ultimo llenado de deposito.");
		System.out.println("7.-Ver todos los llenados de deposito.");
		
		System.out.println();
		System.out.print("Introduzca una opcion: ");
		Scanner scan = new Scanner(System.in);
		opcion1 = scan.nextInt();
		Calendar fecha = Calendar.getInstance();
		
		
		switch (opcion1) {
		case 1:
		System.out.println("Has escogido la opción de repostaje con pago normal");
		consulta.insertarUnRepostaje(new PagosRepostaje(3, "rvhfyjkeodkkuhgu3", fecha, 12, fecha));
		break;
		case 2:
		System.out.println("Has escogido la opción de repostaje con pago con factura");
		consulta.insertarUnRepostaje(new PagosRepostaje(4, "mdkdmdkmkdk", fecha, 13, "77892313Q", "9008BTX", fecha));
		break;
		case 3:
		System.out.println("Has escogido la opción de ver todos los repostajes");
		System.out.println("Lista repostajes: " + consulta.buscarTodos());
		break;
		case 4:
		List<PagosRepostaje> repostajes = new ArrayList<PagosRepostaje>();
		repostajes = consulta.buscarTodos();
		int suma=0;
		for(PagosRepostaje pagos: repostajes) {
			suma+=pagos.getImporte();
		}
		System.out.println("La suma de los repostajes es: "+suma);
		break;
		case 5:

		break;
		case 6:

		break;
		case 7:
	
		break;
		default:
	
		}
		
		}while(opcion1 != 0);
	}

}
