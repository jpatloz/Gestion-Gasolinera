package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class PagosRepostajeImpl {

	@PersistenceContext
	private EntityManager em;
	
	public void insertarRepostaje(PagosRepostaje pagosRepostaje) {
		em.persist(pagosRepostaje);
		
	}

	public List<PagosRepostaje> buscarTodos() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT repost FROM PagosRepostaje repost").getResultList();
	}
}
