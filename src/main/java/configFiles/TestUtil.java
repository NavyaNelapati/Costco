package configFiles;

//import java.util.ArrayList;

public class TestUtil {
	/**
	 * Page load timeout and Implicit Timeout values are given in this section
	 */
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;
	

	
	/**
	 * For Fetching data from Excel File
	 */
		
	/*static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		try{
			reader = new Xls_Reader(C:\Selenium Drivers\Costco\src\main\java\testData\RegistrationDetails.xls);
	}catch (Exception e)
	{
	e.printStackTrace();	
		
	}
		for(int rowNum=2; rowNum<= reader.getRowCount("RegTestData"); rowNum++) {
			String email=reader.getCellData("RegTestData", "email", rowNum);
			String password=reader.getCellData("RegTestData", "password", rowNum);
			String confirmPassword=reader.getCellData("RegTestData", "confirmPassword", rowNum);
			String membership=reader.getCellData("RegTestData", "membership", rowNum);
			
		
		object ob[] = {email, password,confirmPassword, membership};
		myData.add(ob);

}
		return myData;
	}*/
}