package com.mindtree.Sample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException, FileException {

		String name = "File.txt";
		String line = null;
		boolean value=true; ;
		try {
				FileReader fr=new FileReader("File.txt");
				BufferedReader br=new BufferedReader(fr);
				while((line=br.readLine()) != null)
				{
					System.out.println(line);
				} 
				
				 FileOutputStream out = new FileOutputStream("workbook.xls");
				  HSSFWorkbook wb = new HSSFWorkbook();
				  HSSFSheet sheet1 = wb.createSheet("new sheet");
				
		}
		 
		catch (FileNotFoundException e) {
			throw new FileException("file doesnt exist");
		}

	}
}
