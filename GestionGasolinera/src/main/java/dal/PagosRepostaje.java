package dal;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="gas_tch_gasolinera", schema="dlk_gestion_gasolinera")
public class PagosRepostaje {
	//COLUMNAS
	
	@Id
	@Column(name="id_repostaje", unique=true, nullable=false)
	private Integer id_repostaje;
	@Column(name="md_uuid",nullable=false)
	private String md_uuid;
	@Column(name="md_date",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar md_date;
	@Column(name="importe",nullable=false)
	private Integer importe;
	@Column(name="dni",nullable=true)
	private String dni;
	@Column(name="matricula",nullable=true)
	private String matricula;
	@Column(name="fch_repostaje",nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_repostaje;

	
	//CONSTRUCTORES
	
	//PAGO FACTURA
	
	public PagosRepostaje(Integer id_repostaje, String md_uuid, Calendar md_date, Integer importe, String dni,
			String matricula, Calendar fch_repostaje) {
		super();
		this.id_repostaje = id_repostaje;
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.dni = dni;
		this.matricula = matricula;
		this.fch_repostaje = fch_repostaje;
	}
	
	//PAGO NORMAL
	
	public PagosRepostaje(Integer id_repostaje, String md_uuid, Calendar md_date, Integer importe,
			Calendar fch_repostaje) {
		super();
		this.id_repostaje = id_repostaje;
		this.md_uuid = md_uuid;
		this.md_date = md_date;
		this.importe = importe;
		this.fch_repostaje = fch_repostaje;
	}
	
	//CONSTRUCTOR VACÍO
	
	public PagosRepostaje() {
		super();
	}
	
	
	//GETTERS AND SETTERS
	
	public Integer getId_repostaje() {
		return id_repostaje;
	}

	public void setId_repostaje(Integer id_repostaje) {
		this.id_repostaje = id_repostaje;
	}

	public String getMd_uuid() {
		return md_uuid;
	}

	public void setMd_uuid(String md_uuid) {
		this.md_uuid = md_uuid;
	}

	public Calendar getMd_date() {
		return md_date;
	}

	public void setMd_date(Calendar md_date) {
		this.md_date = md_date;
	}

	public Integer getImporte() {
		return importe;
	}

	public void setImporte(Integer importe) {
		this.importe = importe;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Calendar getFch_repostaje() {
		return fch_repostaje;
	}

	public void setFch_repostaje(Calendar fch_repostaje) {
		this.fch_repostaje = fch_repostaje;
	}
	
	
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "Datos de los repostajes: id_repostaje=" + id_repostaje + "// md_uuid=" + md_uuid + "// md_date="
				+ md_date.getTime() + "// importe=" + importe + "// dni=" + dni + "// matricula=" + matricula + " // fch_repostaje="
				+ fch_repostaje.getTime() + "";
	}

	
	
}
	
	