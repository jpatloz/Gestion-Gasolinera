package controller;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.ADaoServicio;
import dto.ADaoServicioImpl;
import dto.ADtoServicio;
import dto.ADtoServicioImpl;
import dto.ControlCamionesDTO;
import dto.PagoRepostajeDTO;
import dal.ControlCamiones;
import dal.PagosRepostaje;
import dal.PagosRepostajeServicio;
import impl.Consultas;

public class Controller {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("contexto.xml");
		Consultas consulta = (Consultas) context.getBean(Consultas.class);
		
		Integer opcion1;
		ADtoServicio aDto = new ADtoServicioImpl();
		ADaoServicio aDao = new ADaoServicioImpl();
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
		
		//DTO para el pago repostaje
		PagoRepostajeDTO DTO;
		PagosRepostaje pagosRepostaje;
		
		//DTO para el control camiones
		ControlCamionesDTO DTOCamiones;
		ControlCamiones controlCamiones;
		
		switch (opcion1) {
		case 1:
		System.out.println("Has escogido la opción de repostaje con pago normal");
		DTO = aDto.APagoRepostajeNormalDTO("rvhfyjkeodkkuhgu3", fecha, 12, fecha);
		pagosRepostaje = aDao.PagoRepostajeDTOADAO(DTO);
		consulta.insertarUnRepostaje(pagosRepostaje);
		break;
		case 2:
		System.out.println("Has escogido la opción de repostaje con pago con factura");
		DTO = aDto.APagoRepostajeFacturaDTO("rvhfyjkeodkkuhgu3", fecha, 12, "7789432Q", "9008BTX", fecha);
		pagosRepostaje = aDao.PagoRepostajeDTOADAO(DTO);
		consulta.insertarUnRepostaje(pagosRepostaje);
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
		System.out.println("La suma de los repostajes es: "+suma+ " euros");
		break;
		case 5:
		System.out.println("Has escogido la opción de llenar el depósito");
		DTOCamiones = aDto.AControlCamionesDTO("rvhfyjkeodkkuhgu3", fecha, 30, "Gasolina95", 58 );
		controlCamiones = aDao.ControlCamionesDTOADAO(DTOCamiones);
		consulta.insertarELCombustible(controlCamiones);
		break;
		case 6:

		break;
		case 7:
		System.out.println("Has escogido la opción de ver todos los llenados de depósito");
		System.out.println("Lista depósitos: " + consulta.buscarCamiones());
		
		break;
		default:
	
		}
		
		}while(opcion1 != 0);
	}

}
