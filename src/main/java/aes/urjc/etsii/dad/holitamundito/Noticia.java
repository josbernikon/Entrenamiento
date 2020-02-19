package aes.urjc.etsii.dad.holitamundito;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nombre;
	private String categoria1;
	private String categoria2;
	private int dia;
	private int mes;
	private int anio;	
	
	@ManyToOne
	//@JoinColumn(name="Nombre")
	private Equipos equipo;

	
	public Noticia() {}
	
	public Noticia(int id, String nombre, String categoria1, String categoria2, int dia, int mes, int anio, Equipos equipo) {
		this.id = id;
		this.nombre = nombre;
		this.categoria1 = categoria1;
		this.categoria2 = categoria2;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		this.equipo = equipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(String categoria1) {
		this.categoria1 = categoria1;
	}

	public String getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(String categoria2) {
		this.categoria2 = categoria2;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Noticia [id=" + id + ", nombre=" + nombre + ", categoria1=" + categoria1 + ", categoria2=" + categoria2
				+ ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", equipo=" + equipo + "]";
	}

	
}
