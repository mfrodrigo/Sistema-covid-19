package Pessoa;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Funcionario extends Pessoa {
	public Funcionario(String name, String login, String password) throws IOException {
		super(name, login, password);
	}
	private String hospital;
	private String horario_de_trabalho;
	private String nivel_de_acesso;
	private String profissao;
	private String schedule;
	
	
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
	
	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNivel_de_acesso() {
		return nivel_de_acesso;
	}

	public void setNivel_de_acesso() {
		if(this.profissao.equals("Gerente")) {
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
			String profissao
			) throws Exception {
		super(name, login, password);
		this.hospital = login;
		this.horario_de_trabalho = horario_de_trabalho;
		this.profissao = profissao;
		this.setNivel_de_acesso();
		this.setSchedule(this.getLogin());
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
		csvWriter.append(this.profissao);
		csvWriter.append(",");
		csvWriter.append(this.nivel_de_acesso);
		csvWriter.append("\n");

		csvWriter.flush();
		csvWriter.close();
		
	}
	
	public void setSchedule(String name) throws Exception {
//		String path1 = "C:\\Users\\";
//		String usuario = System.getProperty("user.name");
		String path1 = "/home/rodrigo/git/Sistema-covid-19/src/Clinica/Database_";
		String path2 = ".xlsx";
		String pathToXlsx = path1.concat(name).concat(path2); 
		this.schedule = pathToXlsx;
		this.gerarAgenda(pathToXlsx);
	}
	
	public void gerarAgenda (String schedule) throws Exception {
		try {
			//Create workbook in .xlsx format
			Workbook workbook = new XSSFWorkbook();
			//For .xsl workbooks use new HSSFWorkbook();
			//Create Sheet
			Sheet sh = workbook.createSheet("Agenda");
			//Create top row with column headings
			String[] columnHeadings = {"07:00",	"07:30", "08:00", "08:30",	"09:00", "09:30", "10:00", "10:30",	"11:00", "11:30", "12:00", "12:30",	"13:00", "13:30", "14:00",	"14:30", "15:00", "15:30", "16:00",	"16:30", "17:00", "17:30", "18:00",	"18:30", "19:00", "19:30"};
			//Create rows headings
			String[] rowHeadings = {"01/08/2021", "02/08/2021", "03/08/2021", "04/08/2021", "05/08/2021", "06/08/2021","07/08/2021","08/08/2021","09/08/2021","10/08/2021","11/08/2021","12/08/2021","13/08/2021","14/08/2021","15/08/2021","16/08/2021","17/08/2021","18/08/2021","19/08/2021","20/08/2021","21/08/2021","22/08/2021","23/08/2021","24/08/2021","25/08/2021","26/08/2021","27/08/2021","28/08/2021","29/08/2021","30/08/2021","31/08/2021"};
			
			//We want to make it bold with a foreground color.
			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setFontHeightInPoints((short)12);
			headerFont.setColor(IndexedColors.BLACK.index);
			//Create a CellStyle with the font
			CellStyle headerStyle = workbook.createCellStyle();
			headerStyle.setFont(headerFont);
			headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.index);
			//Create the header row
			Row headerRow = sh.createRow(0);
			//Iterate over the column headings to create columns
			for(int i=1;i<columnHeadings.length+1;i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(columnHeadings[i-1]);
				cell.setCellStyle(headerStyle);
			}
			
			//Iterate over the row headings
			for(int i=1;i<rowHeadings.length+1;i++) {
				Row row = sh.createRow(i);
				row.createCell(0).setCellValue(rowHeadings[i-1]);
			}
			
			//Write the output to file
			FileOutputStream fileOut = new FileOutputStream(schedule);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			//System.out.println("Completed");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Funcionario login (String username, String password) throws Exception {

		Read_Pessoas_Database Excel = new Read_Pessoas_Database();
		Funcionario funcionario = Excel.getRowf(username, password);
		return funcionario;
	}
	
	
}