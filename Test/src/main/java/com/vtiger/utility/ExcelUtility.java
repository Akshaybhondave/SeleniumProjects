package com.vtiger.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{

	File file;
	FileInputStream fis;
	FileOutputStream fos;
	Workbook workbook;
	Sheet sheet;
	Row row;
	Cell cell;

	public int getSheetCount(String filePath) 
	{

		file = new File(filePath);
		try
		{
		fis = new FileInputStream(file);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();

		}

		try
		{
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) 
		{
			e.printStackTrace();

		}
		return workbook.getNumberOfSheets();

	}

	public void createNewSheet(String filePath, String sheetName) throws IOException
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		workbook.createSheet(sheetName);
		updateExcel();
	}
	
	public void updateExcel() throws IOException 
	{
		fos = new FileOutputStream(file);
		workbook.write(fos);
		fos.flush();
		fos.close();
		System.out.println("File updated....");
	}

	public void deleteNewSheet(String filePath, String sheetName) throws IOException
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		int index = workbook.getSheetIndex(sheetName);
		workbook.removeSheetAt(index);
		updateExcel();

	}

	public int getRowCount(String filePath, String sheetName) throws IOException
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		return sheet.getLastRowNum();
	}

	public void deleteRow(String filePath, String sheetName, int rowNum) throws IOException 
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		sheet.removeRow(row);
		updateExcel();
	}

	public int getCellCount(String filePath, String sheetName, int rowNum) throws IOException 
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		return row.getLastCellNum();
	}

	public void createNewCell(String filePath, String sheetName, int rowNum, String cellValue) throws IOException 
	{
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int lastCell = row.getLastCellNum();
		row.createCell(lastCell).setCellValue(cellValue);
		updateExcel();
	}


		
}