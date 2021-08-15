package Clinica;


import java.io.FileWriter;

import Pessoa.Funcionario;
import Pessoa.Paciente;
import Pessoa.Pessoa;
import Produto.Produto;

public class TesteClinica {
	public static void main(String[] args) throws Exception {
		Clinica novaClinicaa;
		novaClinicaa = Clinica.login("unimed barreiro", "admin123");
		System.out.print(novaClinicaa.getPhoneNumber());
		//novaClinicaa.salvar();
		Funcionario teste = new Funcionario("Maatheus73","12345","Matheus H","unimed barreiro","8:00 a 18:00","Gerente");
		teste.salvar();
		Paciente teste2 = new Paciente("Roddigs","12345xxx","Rodrigo F","unimed barreiro","13:00 a 13:10");
		teste2.salvar();
		System.out.print(teste.getNivel_de_acesso());
		System.out.print(teste2.getHorario_consulta());
		Produto teste3 = new Produto("Testes Covid", "5","1000","unimed barreiro");
		teste3.salvar();
		System.out.print(teste3.getName());
	}
}
