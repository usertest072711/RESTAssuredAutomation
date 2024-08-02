package APIValidationTwo;

import APIValidation.ResponseHandler;

public class TestFour {
	public static void main(String[] args) {
        TestThree testthree = new TestThree();
        String filePath = "/RESTAssuredAutomation/src/test/java/APIValidationTwo/Data.json"; // Path where you want to save the response
        TestThree.processResponseAndSaveToFile(filePath);
    }

}
