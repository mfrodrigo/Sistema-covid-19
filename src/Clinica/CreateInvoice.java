package Clinica;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateInvoice {

	public static void main(String[] args) {
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
			
			Row row = sh.getRow(9); //escolhe a linha 10
			row.createCell(7).setCellValue("112"); //coloca o valor na linha indicada pelo numero -1
			
			//try {
			//	String lido2 =  row.getCell(20).getStringCellValue();
			//}
			//catch(Exception e) {
			//	Row row2 = sh.getRow(9); //escolhe a linha 10
			//	//row2.createCell(0).setCellValue(rowHeadings[8]);
			//	row2.createCell(20).setCellValue("X"); //coloca o valor na linha indicada pelo numero -1
			//}
			//row.createCell(1).setCellValue("111"); na linha dois aqui por exemplo
			//row.createCell(2).setCellValue("222");
			//row.createCell(3).setCellValue("333");
			
			Row row2 = sh.getRow(9); //escolhe a linha 10
			row2.createCell(20).setCellValue("X");
			
			//Write the output to file
			String path1 = "C:\\Users\\";
			String usuario = System.getProperty("user.name");
			String path2 = "\\git\\Sistema-covid-19\\src\\Clinica\\teste.xlsx";
			String pathToCsv = path1.concat(usuario).concat(path2);
			FileOutputStream fileOut = new FileOutputStream(pathToCsv);
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();
			System.out.println("Completed");
			
			InputStream inp = new FileInputStream(pathToCsv);
			Workbook wb = WorkbookFactory.create(inp);
			Sheet sheet = wb.getSheetAt(0);
			row = sheet.getRow(9);
			Cell cell = row.getCell(20);
			String cellContents = cell.getStringCellValue(); 
			System.out.println(cellContents);
			//Modify the cellContents here // Write the output to a file cell.setCellValue(cellContents); 
			fileOut = new FileOutputStream(pathToCsv);
			wb.write(fileOut);
			fileOut.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}