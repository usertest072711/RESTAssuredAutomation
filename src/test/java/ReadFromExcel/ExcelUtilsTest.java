package ReadFromExcel;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		
		String excelPath= "./ExcelData/RestTestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		ExcelUtils.getRowCount();
		ExcelUtils.getCellData(1,0);
		ExcelUtils.getCellData(1,1);
		ExcelUtils.getCellData(1,2);
		
		
	}
}
