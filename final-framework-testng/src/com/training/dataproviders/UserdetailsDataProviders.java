package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;


import com.training.bean.UserdetailsBean;
import com.training.dao.CreatemultipleuserDAO;

import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class UserdetailsDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<UserdetailsBean> list = new CreatemultipleuserDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(UserdetailsBean temp : list){
			Object[]  obj = new Object[7]; 
			obj[0] = temp.getFirstName(); 
			obj[1] = temp.getLastName();
			obj[2] = temp.getEmail();
			obj[3] = temp.getPhone();
			obj[4] = temp.getLogin();
			obj[5] = temp.getPassword();
			obj[6] = temp.getProfile();
			
					
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\Users\\SanthoseKumar\\Downloads\\Selenium Live Project\\ELTC_081_Data1.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}
