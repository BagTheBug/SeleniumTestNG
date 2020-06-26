package com.retail.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static Map<String, String> getDataToMap(String excelName, String sheet)
			throws FileNotFoundException, IOException {

		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream("src/test/resources/data/" + excelName + ".xls"));
		HSSFSheet sh = wb.getSheet(sheet);
		Map<String, String> dataMap = new HashMap<String, String>();
		int rows = sh.getPhysicalNumberOfRows();

		for (int i = 1; i < rows; i++) {
			HSSFRow row = sh.getRow(i);
			dataMap.put(row.getCell(0).getStringCellValue().trim(), row.getCell(1).getStringCellValue().trim());
		}
		return dataMap;
	}
}
