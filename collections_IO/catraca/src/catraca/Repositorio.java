package catraca;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
	private List<Registro> registros;
	
	public Repositorio() {
		this.registros = new ArrayList<>();
	}
	
	public List<Registro> getRegistros(){
		return this.registros;
	}
	
	public void adicionaRegistro(Registro registro) {
		this.registros.add(registro);
	}
	
	public void adicionaRegistro(List<Registro> registros) {
		this.registros = registros;
	}
	
	public List<Registro> buscaRegistros(String tia){
		return null;
	}

	@Override
	public String toString() {
		return "Repositorio [registros=" + registros + ", getRegistros()=" + getRegistros() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
