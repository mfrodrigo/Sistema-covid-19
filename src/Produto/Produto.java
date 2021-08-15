package Produto;

import java.io.FileWriter;
import java.io.IOException;

import Pessoa.Funcionario;
import Pessoa.Read_Pessoas_Database;

public class Produto {
	private String name, valor, quantidade, clinica;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValorn() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public Produto( 
			String name,
			String valor,
			String quantidade,
			String clinica
			) throws IOException {
		this.name = name;
		this.valor = valor;
		this.quantidade = quantidade;
		this.clinica = clinica;
	}
	
	public void salvar() throws IOException {
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Produto\\Database_Produto.csv";
		String pathToCsv = path1.concat(usuario).concat(path2);
		FileWriter csvWriter = new FileWriter(pathToCsv, true);
		
		csvWriter.append(this.name);
		csvWriter.append(",");
		csvWriter.append(this.valor);
		csvWriter.append(",");
		csvWriter.append(this.quantidade);
		csvWriter.append(",");
		csvWriter.append(this.clinica);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
		
	}
	
	public static Produto pesquisa (String name, String clinica) throws Exception {

		Read_Produto_Database Excel = new Read_Produto_Database();
		Produto produto = Excel.getRow(name, clinica);
		return produto;
	}
	
}
