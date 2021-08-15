package Pessoa;
import java.io.FileWriter;
import java.io.IOException;

import Clinica.Clinica;
import Clinica.Read_Clinica_Database;

public class Paciente extends Pessoa {
	//public Paciente(String name, String login, String password) throws IOException {
	//	super(name, login, password);
	//}
	public String hospital;
	public String horario_consulta;
	
	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHorario_consulta() {
		return horario_consulta;
	}

	public void setHorario_consulta(String horario_consulta) {
		this.horario_consulta = horario_consulta;
	}
	
	public Paciente(
			String login, 
			String password,
			String name, 
			String hospital,
			String horario_consulta
			) throws IOException {
		super(name, login, password);
		this.hospital = login;
		this.horario_consulta = horario_consulta;
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
		csvWriter.append(this.horario_consulta);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
		
	}
	
	public static Paciente login (String username, String password) throws Exception {

		Read_Pessoas_Database Excel = new Read_Pessoas_Database();
		Paciente paciente = Excel.getRowp(username, password);
		return paciente;
	}
	
}
