package Clinica;

import java.io.FileWriter;

public class TesteClinica {
	public static void main(String[] args) throws Exception {
		Clinica novaClinicaa;
		novaClinicaa = Clinica.login("unimed ", "admin123");
		System.out.print(novaClinicaa.getPhoneNumber());		


	}
}
