package viaje;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;
import org.openxava.model.*;

import empresa.*;
import escuela.*;
import pais.*;

@Entity
@Views({@View(members="fecha;Lugar{departamento;#salida;destino;escuela;empresa}Otros{contacto;pax;observaciones}")})
public class Viaje extends Identifiable{

	@ReadOnly
	@DefaultValueCalculator(CurrentDateCalculator.class)
	private Date fecha;

	@ManyToOne
	@DescriptionsList
	private Departamento departamento;
	
	@ManyToOne
	@DescriptionsList
	private Localidad salida;
	
	@ManyToOne
	@DescriptionsList
	private Localidad destino;
	
	@ManyToOne
	@DescriptionsList
	private Escuela escuela;
	
	@ManyToOne
	@DescriptionsList
	private Empresa empresa;
	
	@Stereotype("MEMO")
	private String observaciones;
	
	private String contacto;
	
	private String pax;
	
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Localidad getSalida() {
		return salida;
	}

	public void setSalida(Localidad salida) {
		this.salida = salida;
	}

	public Localidad getDestino() {
		return destino;
	}

	public void setDestino(Localidad destino) {
		this.destino = destino;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Escuela getEscuela() {
		return escuela;
	}

	public void setEscuela(Escuela escuela) {
		this.escuela = escuela;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getPax() {
		return pax;
	}

	public void setPax(String pax) {
		this.pax = pax;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	
}
