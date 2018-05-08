package pais;

import java.util.*;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Departamento extends Identifiable {
	
	private String descripcion;

	@ManyToOne
	private Provincia provincia;
	
	@OneToMany(mappedBy="departamento")
	private List<Localidad> localidades;
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}
	
	
	
}
