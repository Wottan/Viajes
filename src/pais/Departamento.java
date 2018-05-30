package pais;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Views({ @View(name = "MuySimple", members = "descripcion"), @View(members = "descripcion;localidades") })
public class Departamento extends Identifiable {

	@Required
	private String descripcion;

	@ManyToOne
	@ReferenceView("MuySimple")
	private Provincia provincia;

	@NewAction("")
	@OneToMany(mappedBy = "departamento")
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
