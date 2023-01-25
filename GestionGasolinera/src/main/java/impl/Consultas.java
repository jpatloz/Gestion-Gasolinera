package impl;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dal.ControlCamiones;
import dal.ControlCamionesImpl;
import dal.PagosRepostaje;
import dal.PagosRepostajeImpl;

@Service
public class Consultas{
	
		@Autowired
		private PagosRepostajeImpl pri;
		@Autowired
		private ControlCamionesImpl cci;
		
		//CONSULTAS DEL PAGO DEL REPOSTAJE
		
		@Transactional
		public void insertarUnRepostaje(PagosRepostaje pagosRepostaje) {
			pri.insertarRepostaje(pagosRepostaje);
		}
		
		@Transactional
		public void insertarListaRepostajes(Collection<PagosRepostaje> colRepostaje){
			for (PagosRepostaje pagosRepostaje : colRepostaje) {
				pri.insertarRepostaje(pagosRepostaje);
			}
		}
		
		@Transactional
		public List<PagosRepostaje> buscarTodos() {
			return pri.buscarTodos();
		}
		
		//CONSULTAS DEL CONTROL DE CAMIONES
		
		@Transactional
		public void insertarELCombustible(ControlCamiones controlCamiones) {
			cci.insertarCombustible(controlCamiones);
		}
		
		@Transactional
		public void insertarListaCombustibles(Collection<ControlCamiones> colCombustible){
			for (ControlCamiones controlCamiones : colCombustible) {
				cci.insertarCombustible(controlCamiones);
			}
		}
		
		@Transactional
		public List<ControlCamiones> buscarCamiones() {
			return cci.buscarCamiones();
		}
}
	
