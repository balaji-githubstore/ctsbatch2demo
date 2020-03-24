package com.cts.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
public static void WriteIntoExcel(String fileDetails,String sheetName,int rowIndex,int cellIndex,String value) throws IOException{
	
	FileOutputStream fileOut = new FileOutputStream(fileDetails);
	XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet(sheetName);
	XSSFRow row = sheet.createRow(rowIndex);
	XSSFCell cell=row.createCell(cellIndex);
	cell.setCellValue(value);
	book.write(fileOut);
	book.close();
	fileOut.close();
	
}

}
