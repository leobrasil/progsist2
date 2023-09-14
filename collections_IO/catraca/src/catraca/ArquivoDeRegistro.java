	package catraca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ArquivoDeRegistro {
	
	public static void escrever(String nomeArquivo, List<Registro> registros) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(nomeArquivo)));
			out.println(registros.size());
			for (Registro registro : registros) {
				out.println(registro.getTia()+"#"+registro.getDataHora().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"#"+registro.getTipo());
			}
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static List<Registro>ler(String nomeArquivo){
		List<Registro> res = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(nomeArquivo));
			int qte = Integer.valueOf(in.readLine());
			while(qte>0) {
				String linha = in.readLine();
				String aux [] = linha.split("#");
				res.add(new Registro(aux[0], 
							LocalDateTime.parse(aux[1], 
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),aux[2]));
				qte--;
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	
	

}
