package Pessoa;

import java.io.FileWriter;
import java.io.IOException;

public class Funcionario extends Pessoa {
	public Funcionario(String name, String login, String password) throws IOException {
		super(name, login, password);
	}
	public String hospital;
	public String horario_de_trabalho;
	public String nivel_de_acesso;
	public String profissão;
	
	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHorario_de_trabalho() {
		return horario_de_trabalho;
	}

	public void setHorario_de_trabalho(String horario_de_trabalho) {
		this.horario_de_trabalho = horario_de_trabalho;
	}
	
	public String getProfissão() {
		return profissão;
	}

	public void setProfissão(String profissão) {
		this.profissão = profissão;
	}

	public String getNivel_de_acesso() {
		return nivel_de_acesso;
	}

	public void setNivel_de_acesso() {
		if(this.profissão.equals("Gerente")) {
			this.nivel_de_acesso = "gerencial";
		}else {
			this.nivel_de_acesso = "comum";
		}
	}
	
	public Funcionario( 
			String login, 
			String password,
			String name,
			String hospital,
			String horario_de_trabalho,
			String profissão
			) throws IOException {
		super(name, login, password);
		this.hospital = login;
		this.horario_de_trabalho = horario_de_trabalho;
		this.profissão = profissão;
		this.setNivel_de_acesso();
	}
	
	public void salvar() throws IOException {
		//fcb97
		//String pathToCsv = "C:\\Users\\User\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Pessoa\\Database_Pessoa.csv";
		String pathToCsv = path1.concat(usuario).concat(path2);
		FileWriter csvWriter = new FileWriter(pathToCsv, true);
		
		csvWriter.append(this.login);
		csvWriter.append(",");
		csvWriter.append(this.password);
		csvWriter.append(",");
		csvWriter.append(this.name);
		csvWriter.append(",");
		csvWriter.append(this.hospital);
		csvWriter.append(",");
		csvWriter.append(this.horario_de_trabalho);
		csvWriter.append(",");
		csvWriter.append(this.profissão);
		csvWriter.append(",");
		csvWriter.append(this.nivel_de_acesso);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
		
	}
	
	public static Funcionario login (String username, String password) throws Exception {

		Read_Pessoas_Database Excel = new Read_Pessoas_Database();
		Funcionario funcionario = Excel.getRowf(username, password);
		return funcionario;
	}
	
}