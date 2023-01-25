package dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class ControlCamionesImpl implements ControlCamionesServicio{
	
	@PersistenceContext
	private EntityManager emCamiones;
	
	public void insertarCombustible(ControlCamiones controlCamiones){
		emCamiones.persist(controlCamiones);
		emCamiones.clear();
		emCamiones.close();
	}

	public List<ControlCamiones> buscarCamiones() {
		return emCamiones.createQuery("SELECT combustible FROM ControlCamiones combustible").getResultList();
	}

}
