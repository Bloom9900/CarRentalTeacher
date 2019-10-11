package com.cphbusiness.carrentalwulf;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteHTML {
	String filename;
	public void deployData(Garage garage) throws IOException {
		String retvalString = garage.gargeToHtml();
		filename = "index.html";
		FileOutputStream fos =	new FileOutputStream(filename);
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
		writer.write(retvalString);
		writer.newLine();
		writer.close();
	}
	
}
