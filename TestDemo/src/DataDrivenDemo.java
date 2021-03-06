import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo {

	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// = 
		getCellDatas(2,1);
		String v = setCelldata("SettingData", 3,1);
		System.out.println(v);
	}
	public static void getCellDatas(int ro, int co) throws IOException{
		
		fis = new FileInputStream("/Users/Kavitha/Documents/TestData.xlsx");
		
		//Pointing to the workbook
		 wb = new XSSFWorkbook(fis);
		 sheet = wb.getSheet("Scripts");
		 row = sheet.getRow(ro);
		 cell = row.getCell(co);
		String val = cell.getStringCellValue();
		System.out.println(val);
		
	}
	
	public static String setCelldata(String text,int rownum,int col) throws IOException
	{
	fis =new FileInputStream("/Users/Kavitha/Documents/TestData.xlsx");
	wb=new XSSFWorkbook(fis);
	sheet=wb.getSheet("Scripts");
	row=sheet.getRow(2);
	cell=row.getCell(2);
	cell.setCellValue(text);
	String celldata1= cell.getStringCellValue();
	return celldata1;
	}
	

}
