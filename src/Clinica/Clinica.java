package Clinica;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clinica {
	private String name, login, password, adress, cnpj, employers, phoneNumber, email, stock, schedule;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmployers() {
		return employers;
	}

	public void setEmployers(String employers) {
		this.employers = employers;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
	public Clinica(
			String name, 
			String login, 
			String password, 
			String adress, 
			String cnpj, 
			String employers, 
			String phoneNumber, 
			String email, 
			String stock,
			String schedule
			) throws IOException {
		this.login = login;
		this.password = password;
		this.name = name;	
		this.adress = adress;
		this.cnpj = cnpj;
		this.employers = employers;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.stock = stock;
		this.schedule = schedule;
	}

	public Clinica() {
		// TODO Auto-generated constructor stub
	}

	public void salvar() throws IOException {
		//fcb97
		//String pathToCsv = "C:\\Users\\User\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";
		String pathToCsv = path1.concat(usuario).concat(path2);
		FileWriter csvWriter = new FileWriter(pathToCsv, true);
		
		csvWriter.append(this.login);
		csvWriter.append(",");
		csvWriter.append(this.password);
		csvWriter.append(",");
		csvWriter.append(this.name);
		csvWriter.append(",");
		csvWriter.append(this.adress);
		csvWriter.append(",");
		csvWriter.append(this.cnpj);
		csvWriter.append(",");
		csvWriter.append(this.employers);
		csvWriter.append(",");
		csvWriter.append(this.phoneNumber);
		csvWriter.append(",");
		csvWriter.append(this.email);
		csvWriter.append(",");
		csvWriter.append(this.stock);
		csvWriter.append(",");
		csvWriter.append(this.schedule);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
		
	}
	
	public static Clinica login (String username, String password) throws Exception {

		Read_Clinica_Database Excel = new Read_Clinica_Database();
		Clinica clinica = Excel.getRow(username, password);
		return clinica;
	}
	
	
}