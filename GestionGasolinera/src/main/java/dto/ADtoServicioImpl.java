package dto;

import java.util.Calendar;

import dal.ControlCamiones;

public class ADtoServicioImpl implements ADtoServicio{
	
	@Override
	public PagoRepostajeDTO APagoRepostajeFacturaDTO(String md_uuid, Calendar md_date, Integer importe, String dni, String matricula,
			Calendar fch_repostaje) {
	
		PagoRepostajeDTO DTO = new PagoRepostajeDTO(md_uuid, md_date, importe, dni,  matricula, fch_repostaje);
		
		return DTO;
	}
	
	@Override
	public PagoRepostajeDTO APagoRepostajeNormalDTO(String md_uuid, Calendar md_date, Integer importe,	Calendar fch_repostaje) {
	
		PagoRepostajeDTO DTO = new PagoRepostajeDTO(md_uuid, md_date, importe, fch_repostaje);
		
		return DTO;
	}
	@Override
	public ControlCamionesDTO AControlCamionesDTO(String md_uuid, Calendar md_date,
			int litros_combustible, String tipo_combustible, int importe) {
		
		ControlCamionesDTO DTO = new ControlCamionesDTO(md_uuid, md_date, litros_combustible, tipo_combustible,
				importe);
		
		return DTO;
	}
	

}
