package dto;

import dal.ControlCamiones;
import dal.PagosRepostaje;

public interface ADaoServicio {

	public PagosRepostaje PagoRepostajeDTOADAO(PagoRepostajeDTO pagoRepostajeDTO);
	
	public ControlCamiones ControlCamionesDTOADAO(ControlCamionesDTO controlCamionesDTO);
}
