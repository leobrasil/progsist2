package catraca;

import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class Principal {
	public static void main(String args[]) {
		Repositorio repositorio = new Repositorio();
		repositorio.adicionaRegistro(new Registro("123465789",LocalDateTime.of(2018, 07, 22, 10, 15, 30),"ENTRADA"));
		repositorio.adicionaRegistro(new Registro("123465789",LocalDateTime.of(2018, 07, 22, 10, 16, 30),"SAIDA"));
		
		ArquivoDeRegistro.escrever("c:\\temp\\catracas.txt", repositorio.getRegistros());
		
		repositorio.adicionaRegistro(ArquivoDeRegistro.ler("c:\\temp\\catracas.txt"));
		
		for (Registro registro : repositorio.getRegistros()) {
			System.out.println(registro);
			
		}
	}
}
