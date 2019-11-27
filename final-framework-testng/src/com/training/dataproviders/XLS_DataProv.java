package com.training.dataproviders;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ReadExcel;

public class XLS_DataProv {
	@DataProvider(name = "xls-inputs01")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:\\Users\\GopiUshaKiran\\Desktop\\Training\\ELearningTD.xls", "Sheet2"); 
	}
	
	@DataProvider(name = "xls-inputs02")
	public Object[][] getXLSData2(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:\\Users\\GopiUshaKiran\\Desktop\\Training\\ELearningTD.xls", "Sheet3"); 
	}

}
