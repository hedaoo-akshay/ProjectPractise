package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtilityFile {
	
	public String readDataFromExcelFile(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public void writeDataIntoExcelFile(String sheet, int row, int cell, String value) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathConstants.EXCEL_PATH);
		wb.write(fos);
		
	}
	public String readNumericCellValueFromExcelFile(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cellvalue=wb.getSheet(sheet).getRow(row).getCell(cell);
		int value=(int) cellvalue.getNumericCellValue();
		return String.valueOf(value);
	}
	public int getRowCount(String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstants.EXCEL_PATH);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount= wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	}
	

}
