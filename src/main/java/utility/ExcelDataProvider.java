package utility;

import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	InputStream fileinputStream;
	String value;
	private static ExcelDataProvider excelData;

	public String getexceldata(String SheetName, int row, int cell) {

		fileinputStream = getClass().getClassLoader().getResourceAsStream(Constant.testdataPath);
		try {
			XSSFWorkbook xssf = new XSSFWorkbook(fileinputStream);
			value = xssf.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}

	public static ExcelDataProvider getInstance() {

		if (excelData == null) {
			synchronized (ExcelDataProvider.class) {
				if (excelData == null) {
					excelData = new ExcelDataProvider();
				}
			}
		}
		return excelData;
	}

}
