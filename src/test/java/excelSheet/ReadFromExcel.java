package excelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * <dependency>
		 *		<groupId>org.apache.poi</groupId>
		 *		<artifactId>poi</artifactId>
		 *		<version>3.9</version>
		 *	</dependency>
		 */
		
		File file = new File("Data.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook data = new XSSFWorkbook(inputStream);
		//HSSFWorkbook for xls
		//XSSFWorkbook for xlsx
		Sheet usernames = data.getSheet("UserName");
		System.out.println(usernames.getFirstRowNum());
		System.out.println(usernames.getLastRowNum());
		System.out.println(usernames.getRow(0).getFirstCellNum());
		System.out.println(usernames.getRow(0).getLastCellNum());
		String firstUser = usernames.getRow(1).getCell(0).toString();
		
		System.out.println(firstUser);
		
		
		
		
		
		


	}

}
