package Clinica;


import java.io.FileWriter;

import Pessoa.Funcionario;
import Pessoa.Paciente;
import Pessoa.Pessoa;
import Produto.Produto;

public class TesteClinica {
	public static void main(String[] args) throws Exception {
		
		Clinica clinicaNossa = new Clinica("Clinica Nossa", 
				"clinicanossa", 
				"goupe", 
				"rua dos estelionatarios", 
				"171", 
				"0", 
				"08000", 
				"clinicanossa@gmail.com", 
				"0"
				);
		clinicaNossa.salvar();
		Clinica novaClinica;
		novaClinica = Clinica.login("unimed barreiro", "admin123");
//		Funcionario matheus = new Funcionario("Maatheus73","12345","Matheus H",novaClinica.getName(),"8:00 a 18:00","Gerente");
		novaClinica.marcarConsulta("Maatheus73", "15/08/2021", "15:00");
		novaClinica.marcarConsulta("Maatheus73", "15/08/2021", "15:00");
//		System.out.print(novaClinicaa.getSchedule());
//		novaClinicaa.marcarConsulta(novaClinicaa.getSchedule(), "15/08/2021", "15:00");
//		novaClinicaa.marcarConsulta(novaClinicaa.getSchedule(), "15/08/2021", "15:00");
		//novaClinicaa.salvar();
//		
//		Paciente teste2 = new Paciente("Roddigs","12345xxx","Rodrigo F","unimed barreiro","13:00 a 13:10");
//		teste2.salvar();
//		Produto teste3 = new Produto("Testes Covid", "5","1000","unimed centro");
//		teste3.salvar();
//		System.out.print(teste3.getName());
	}
}
