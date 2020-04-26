package com.demo.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class FileOp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("D:/output.txt");
		
		BufferedReader br=new BufferedReader(new FileReader("D:/sample.txt"));
		
		String line=br.readLine();
		
		HashSet<String> hs=new HashSet<String>();
		
		while(line!=null) {
			if (hs.add(line));
			pw.println(line);
			
			line=br.readLine();
			
			
		}
		pw.flush();
		pw.close();
		
		System.out.println("file operation successful");
		
		}
	


}
