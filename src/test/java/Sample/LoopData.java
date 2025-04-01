package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoopData {

	public static void main(String[] args) throws Exception {

		getRowData();
	}

	public static void checkCellDataType() throws Exception {

		// verify cell data type
		String path = "D:\\Framework practice\\withvinod\\TestData\\TestData.xlsx";
		int rowNum = 1;
		FileInputStream fl = new FileInputStream(path);

		XSSFWorkbook xf = new XSSFWorkbook(fl);

		XSSFSheet sheetname = xf.getSheet("Sheet1");
		CellType cellType = sheetname.getRow(1).getCell(6).getCellType();
		System.out.println(cellType.toString());

	}

//fetch from column
	public static void getColumnData() throws Exception {

		String path = "D:\\Framework practice\\withvinod\\TestData\\TestData.xlsx";

		FileInputStream fl = new FileInputStream(path);

		XSSFWorkbook xf = new XSSFWorkbook(fl);

		XSSFSheet sheetname = xf.getSheet("Sheet1");
		if (sheetname != null) {
			int lastrow = sheetname.getLastRowNum();
			for (int i = 0; i <= lastrow; i++) {
				XSSFRow row = sheetname.getRow(i);

				if (row != null) {
					XSSFCell cell = row.getCell(0);
					if (cell != null) {
						String value = cell.getStringCellValue();
						System.out.println(value);
					}
				}

			}

		}

	}

	// fetch from Row & verify numeric data
	
	public static void getRowData() throws Exception {

		String path = "D:\\Framework practice\\withvinod\\TestData\\TestData.xlsx";
		int rowNum = 1;
		FileInputStream fl = new FileInputStream(path);

		XSSFWorkbook xf = new XSSFWorkbook(fl);

		XSSFSheet sheetname = xf.getSheet("Sheet1");
		if (sheetname != null) {
			int lastCell = sheetname.getRow(rowNum).getLastCellNum();
			for (int i = 0; i <= lastCell; i++) {
				XSSFRow row = sheetname.getRow(rowNum);

				if (row != null) {
					XSSFCell cell = row.getCell(i);
					if (cell != null) {
						if (cell.getCellType().toString().equals("NUMERIC")) {
							int num = (int) cell.getNumericCellValue();
							System.out.println(num);
						} else {
							String value = cell.getStringCellValue();
							System.out.println(value);
						}
					}
				}

			}

		}

	}

}
