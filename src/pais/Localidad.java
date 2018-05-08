package pais;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Localidad extends Identifiable {

	private String descripcion;

	@ManyToOne
	private Departamento departamento;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
