package Produto;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read_Produto_Database {
	public Produto getRow (String name, String clinica) throws Exception {  
		//parsing a CSV file into Scanner class constructor  
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv";// atualizar para a base de pessoas
		String pathToCsv = path1.concat(usuario).concat(path2);
		//String pathToCsv = "C:\\Users\\fcb97\\git\\Sistema-covid-19\\src\\Clinica\\Database.csv"; 
		BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
		String row;
		Produto produtoAtual = new Produto(
				"name",
				"valor",
				"quantidade",
				"clinica"
				);
		
		while ((row = csvReader.readLine()) != null) {
		    String[] data = row.split(",");
		    if (data[0].equals(name) && data[1].equals(clinica)) {
		    	produtoAtual.setName(data[0]);
		    	produtoAtual.setValor(data[1]);
		    	produtoAtual.setQuantidade(data[2]);
		    	produtoAtual.setClinica(data[3]);
		    	break;
		    }
		}
		csvReader.close(); 
    	return produtoAtual;
	}
}
