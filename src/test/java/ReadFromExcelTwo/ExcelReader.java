package ReadFromExcelTwo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static String getRequestBody(String filePath, int sheetIndex, int rowIndex) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            
            Sheet sheet = (Sheet) workbook.getSheetAt(sheetIndex);
            Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(rowIndex);
            if (row != null) {
               
            	
                return row.getCell(0).getStringCellValue();
            }
        }
        return null;
    }

}
