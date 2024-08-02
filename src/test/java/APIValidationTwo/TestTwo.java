package APIValidationTwo;

import java.io.FileWriter;
import java.io.IOException;

public class TestTwo {
	public static void saveResponseToFile(String response, String filePath) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(response);
            System.out.println("API response saved to file: " + filePath );
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}
    
