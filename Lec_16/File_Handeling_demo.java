package Lec_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_Handeling_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f =new File("Demo.txt");
		
		f.createNewFile();
//		f.delete();
		
		
//		FileReader fr=new FileReader(f);
		
//		int a=fr.read();
//		while(a!=-1) {
//			System.out.print((char)(a));
//			a=fr.read();
//		}
//		BufferedReader br=new BufferedReader(fr);
//		String s=br.readLine();
//		while(s!=null) {
//			System.out.println(s);
//			s=br.readLine();
//		}
//		
//		Scanner sc=new Scanner(f);
//		while(sc.hasNext()) {
//			System.out.println(sc.nextLine());
//		}
		
//		FileWriter fr=new FileWriter(f);
		FileWriter fr=new FileWriter(f,true);
		
		char [] arr= {'a','b','c','d','e','f','g'};
//		fr.write(99);
//		fr.write("\n");
//		fr.write(arr);
//		fr.flush();
//		fr.close();
		
//		BufferedWriter br =new BufferedWriter(fr);
//		br.write(99);
//		br.newLine();
//		br.write(arr);
//		br.flush();
//		br.close();
		
		PrintWriter pr=new PrintWriter(fr);
		pr.println(false);
		pr.println(99);
		pr.print(123);
		pr.println();
		pr.flush();
		pr.close();
		
	}

}
