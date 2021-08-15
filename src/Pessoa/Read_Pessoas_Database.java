package Pessoa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System;

import Clinica.Clinica;

public class Read_Pessoas_Database {
	public Paciente getRowp (String username, String password) throws Exception {  
		//parsing a CSV file into Scanner class constructor  
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";// atualizar para a base de pessoas
		String pathToCsv = path1.concat(usuario).concat(path2);
		//String pathToCsv = "C:\\Users\\fcb97\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv"; 
		BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
		String row;
		Paciente pacienteAtual = new Paciente(
				"login",
				"password",
				"name",
				"hospital",
				"horario_consulta"
				);
		
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    if (data[0].equals(username) && data[1].equals(password)) {
		    	pacienteAtual.setLogin(data[0]);
		    	pacienteAtual.setPassword(data[1]);
		    	pacienteAtual.setName(data[2]);
		    	pacienteAtual.setHospital(data[3]);
		    	pacienteAtual.setHorario_consulta(data[4]);
		    	break;
		    }
		}
		csvReader.close(); 
    	return pacienteAtual;
	}
	
	public Funcionario getRowf (String username, String password) throws Exception {  
		//parsing a CSV file into Scanner class constructor  
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";// atualizar para a base de pessoas
		String pathToCsv = path1.concat(usuario).concat(path2);
		//String pathToCsv = "C:\\Users\\fcb97\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv"; 
		BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
		String row;
		Funcionario funcionarioAtual = new Funcionario(
				"login",
				"password",
				"name",
				"hospital",
				"horario_de_trabalho",
				"profissão"
				);
		
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    if (data[0].equals(username) && data[1].equals(password)) {
		    	funcionarioAtual.setLogin(data[0]);
		    	funcionarioAtual.setPassword(data[1]);
		    	funcionarioAtual.setName(data[2]);
		    	funcionarioAtual.setHospital(data[3]);
		    	funcionarioAtual.setHorario_de_trabalho(data[4]);
		    	funcionarioAtual.setProfissão(data[5]);
		    	funcionarioAtual.setNivel_de_acesso();
		    	break;
		    }
		}
		csvReader.close(); 
    	return funcionarioAtual;
	}
	
	
}
