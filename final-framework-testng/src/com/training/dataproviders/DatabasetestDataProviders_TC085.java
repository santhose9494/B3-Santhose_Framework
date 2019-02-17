package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.DatabasetestBean_TC085;
import com.training.dao.DatabasetestDAO;

public class DatabasetestDataProviders_TC085 {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<DatabasetestBean_TC085> list = new DatabasetestDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(DatabasetestBean_TC085 temp : list){
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
}
