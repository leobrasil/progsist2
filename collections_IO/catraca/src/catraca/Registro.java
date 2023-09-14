package catraca;

import java.time.LocalDateTime;
import java.util.Date;

public class Registro {
	private String tia;
	private LocalDateTime  dataHora;
	private String 	tipo;
	
	public Registro() {
	
	}
	public Registro(String tia, LocalDateTime  dataHora, String tipo) {

		this.tia = tia;
		this.dataHora = dataHora;
		this.tipo = tipo;
	}
	public String getTia() {
		return tia;
	}
	public void setTia(String tia) {
		this.tia = tia;
	}
	public LocalDateTime  getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime  dataHora) {
		this.dataHora = dataHora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Registro [tia=" + tia + ", dataHora=" + dataHora + ", tipo=" + tipo + ", getTia()=" + getTia()
				+ ", getDataHora()=" + getDataHora() + ", getTipo()=" + getTipo() +" ]";
	}
}
