package Clinica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

	public void setSchedule(String name) {
		String path1 = "C:\\Users\\";
		String usuario = System.getProperty("user.name");
		String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\Database_Agenda_";
		String path3 = ".xlsx";
		String pathToXlsx = path1.concat(usuario).concat(path2).concat(name).concat(path3); 
		this.schedule = pathToXlsx;
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
			) throws Exception {
		this.login = login;
		this.password = password;
		this.name = name;	
		this.adress = adress;
		this.cnpj = cnpj;
		this.employers = employers;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.stock = stock;
		this.setSchedule(name);
		this.gerarAgenda(this.getSchedule());
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
	
	public static void marcarConsulta (String schedule, String dia, String hora) throws Exception {
		List<String> columnHeadings = new LinkedList<String>(Arrays.asList("07:00",	"07:30", "08:00", "08:30",	"09:00", "09:30", "10:00", "10:30",	"11:00", "11:30", "12:00", "12:30",	"13:00", "13:30", "14:00",	"14:30", "15:00", "15:30", "16:00",	"16:30", "17:00", "17:30", "18:00",	"18:30", "19:00", "19:30"));
		List<String> rowHeadings = new LinkedList<String>(Arrays.asList("01/08/2021", "02/08/2021", "03/08/2021", "04/08/2021", "05/08/2021", "06/08/2021","07/08/2021","08/08/2021","09/08/2021","10/08/2021","11/08/2021","12/08/2021","13/08/2021","14/08/2021","15/08/2021","16/08/2021","17/08/2021","18/08/2021","19/08/2021","20/08/2021","21/08/2021","22/08/2021","23/08/2021","24/08/2021","25/08/2021","26/08/2021","27/08/2021","28/08/2021","29/08/2021","30/08/2021","31/08/2021"));
		
		int column_num =  columnHeadings.indexOf(hora) + 1;
		int row_num =  rowHeadings.indexOf(dia) + 1;
		
		InputStream inp = new FileInputStream(schedule);
		Workbook wb = WorkbookFactory.create(inp);
		Sheet sheet = wb.getSheetAt(0);
		try {
			Row row = sheet.getRow(row_num);
			Cell cell = row.getCell(column_num);
			String cellContents = cell.getStringCellValue();
			//System.out.println(cellContents);
			System.out.println("Horario Indisponivel!!\n");
		}
		catch(Exception e) {
			Row row = sheet.getRow(row_num);
			Cell cell = row.createCell(column_num);
			cell.setCellValue("X");
			System.out.println("Consulta Marcada!!\n");
		}
		
		//Modify the cellContents here // Write the output to a file cell.setCellValue(cellContents); 
		FileOutputStream fileOut = new FileOutputStream(schedule);
		wb.write(fileOut);
		fileOut.close();
	}
	
	
	
}