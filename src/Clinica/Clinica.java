package Clinica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clinica {
	private String name, login, password, adress, cnpj, employers, phoneNumber, email, stock;

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
	
	public Clinica(
			String name, 
			String login, 
			String password, 
			String adress, 
			String cnpj, 
			String employers, 
			String phoneNumber, 
			String email, 
			String stock
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
		
		String pathToCsv = "C:\\Users\\fcb97\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";  
		FileWriter csvWriter = new FileWriter(pathToCsv, true);
		
		csvWriter.append(login);
		csvWriter.append(",");
		csvWriter.append(password);
		csvWriter.append(",");
		csvWriter.append(name);
		csvWriter.append(",");
		csvWriter.append(adress);
		csvWriter.append(",");
		csvWriter.append(cnpj);
		csvWriter.append(",");
		csvWriter.append(employers);
		csvWriter.append(",");
		csvWriter.append(phoneNumber);
		csvWriter.append(",");
		csvWriter.append(email);
		csvWriter.append(",");
		csvWriter.append(stock);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
	}

	public Clinica() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static Clinica login (String username, String password) throws Exception {

		ReadCSVExample1 Excel = new ReadCSVExample1();
		Clinica clinica = Excel.getRow(username, password);
		return clinica;
	}
	
	
}