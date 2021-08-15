package Clinica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.System;

public class Read_Clinica_Database {
	public Clinica getRow (String username, String password) throws Exception {  
		//parsing a CSV file into Scanner class constructor  
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";
		String pathToCsv = path1.concat(usuario).concat(path2);  
		BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
		String row;
		Clinica clinicaAtual = new Clinica(
				"login",
				"password",
				"name",
				"adress",
				"cnpj",
				"employers",
				"phoneNumber",
				"email",
				"stock"
				);
		
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    if (data[0].equals(username) && data[1].equals(password)) {
		    	clinicaAtual.setLogin(data[0]);
		    	clinicaAtual.setPassword(data[1]);
		    	clinicaAtual.setName(data[2]);
		    	clinicaAtual.setAdress(data[3]);
		    	clinicaAtual.setCnpj(data[4]);
		    	clinicaAtual.setEmployers(data[5]);
		    	clinicaAtual.setPhoneNumber(data[6]);
		    	clinicaAtual.setEmail(data[7]);
		    	clinicaAtual.setStock(data[8]);
		    	clinicaAtual.setSchedule(data[2]);
		    	break;
		    }
		}
		csvReader.close(); 
    	return clinicaAtual;
	} 
}
