package impl;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dal.PagosRepostaje;
import dal.PagosRepostajeImpl;

@Component
public class Consultas {
	
		@Autowired
		private PagosRepostajeImpl pri;
		
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

}
	
