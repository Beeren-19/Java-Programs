package javaProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyOneFileToAnotherFile {

	public static void main(String[] args) {
		copyfile();
	}
	public static void copyfile()
	{
		File infile=new File("C:\\Users\\Dell\\Desktop\\inputfile.xlsx");
		File outfile=new File("C:\\Users\\Dell\\Desktop\\inputfile-copy.xlsx");
		
		FileInputStream  fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		try {
			fileInputStream=new FileInputStream(infile);
			fileOutputStream=new FileOutputStream(outfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(fileInputStream.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i=0;
		try {
			while((i=fileInputStream.read())!=-1)
			{
				fileOutputStream.write(i);	
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		finally{
			//close the stream
			if(fileInputStream!=null)
			{
				try {
					fileInputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fileOutputStream!=null)
			{
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
