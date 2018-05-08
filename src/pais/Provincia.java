package pais;

import java.util.*;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Provincia extends Identifiable {

	private String descripcion;

	@ManyToOne
	private Pais pais;
	
	@OneToMany(mappedBy="provincia")
	private List<Departamento> departamentos;
	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	
}