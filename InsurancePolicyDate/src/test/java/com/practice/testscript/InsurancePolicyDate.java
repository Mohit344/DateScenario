package com.practice.testscript;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.practice.constants.FileConstant;
import com.practice.util.UpdatedExcelFileReader;
import com.practice.util.WriteExcel;

public class InsurancePolicyDate {

	public static UpdatedExcelFileReader excelReader;
	LocalDate date = LocalDate.now();
	
	
  public void currentDate() throws Exception {
		excelReader = new UpdatedExcelFileReader(FileConstant.EFFECTIVE_DATE_CHANGE);
		WriteExcel write = new WriteExcel(FileConstant.EFFECTIVE_DATE_CHANGE);
		
		String presentDate = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(date);
		System.out.println("current date:"+presentDate);
		write.setCellData("effectivedate", "effectiveDateChange", 2, presentDate);
  }
  
  public void oneMonthLater() throws Exception {
	  WriteExcel write = new WriteExcel(FileConstant.EFFECTIVE_DATE_CHANGE);
		String afterAMonth = excelReader.getCellData("effectivedate", "range", 3);
		int monthLater = Integer.parseInt(afterAMonth);
		LocalDate afterOneMonth = date.plusMonths(monthLater);
		String dateAfterOneMonth = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(afterOneMonth);
		System.out.println("date after one month:" + dateAfterOneMonth);
		write.setCellData("effectivedate", "effectiveDateChange", 3, dateAfterOneMonth);	
  }
  
  
  public void tenDaysLater() throws Exception{
	  WriteExcel write = new WriteExcel(FileConstant.EFFECTIVE_DATE_CHANGE);
		String afterTenDay = excelReader.getCellData("effectivedate", "range", 4);
		int exactTenDay = Integer.parseInt(afterTenDay);
		LocalDate afterTenDays = date.plusDays(exactTenDay);
		String dateAfterTenDays = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(afterTenDays);

		System.out.println("date after ten days:" + dateAfterTenDays);
		write.setCellData("effectivedate", "effectiveDateChange", 4, dateAfterTenDays);
  }
  
  public void oneMonthEarlier() throws Exception {
	  WriteExcel write = new WriteExcel(FileConstant.EFFECTIVE_DATE_CHANGE);
		String beforeAMonth = excelReader.getCellData("effectivedate", "range", 5);
		int beforeMonth = Integer.parseInt(beforeAMonth);
		LocalDate beforeOneMonth = date.minusMonths(beforeMonth);

		String dateBeforeOneMonth = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH).format(beforeOneMonth);

		System.out.println("date before one month:" + dateBeforeOneMonth);
		write.setCellData("effectivedate", "effectiveDateChange", 5, dateBeforeOneMonth);
  }
		
		
		public static void main(String[] args) throws Exception {
			
			InsurancePolicyDate checkDate=  new InsurancePolicyDate();
			checkDate.currentDate();
			checkDate.oneMonthLater();
			checkDate.tenDaysLater();
			checkDate.oneMonthEarlier();
			
			
		}
	
		


	}


