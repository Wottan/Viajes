package pais;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@Views({ @View(name = "MuySimple", members = "descripcion"), @View(members = "descripcion;provincias") })
public class Pais extends Identifiable {

	@Required
	private String descripcion;

	@OneToMany(mappedBy = "pais", cascade = CascadeType.PERSIST)
	private List<Provincia> provincias;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

}
