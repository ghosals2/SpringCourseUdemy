package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	/*String filename="C:\\Users\\guddu\\STS WorkSpace\\spring- demo-annotations\\RandomNames.txt";
	String[] data;
	File file=new File(filename);{
	
	try {
		Scanner inputstream=new Scanner(file);
		while(inputstream.hasNext()) {
			for(int i=0; ;i++) {
			 data[i]= inputstream.next();
			 System.out.println(data[i]);
			}
			
			
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}*/
	
	
	
	
	
	//create a array of string
	private String[] data= {
		"Ram",
			"Shyam",
			"Jadu",
			"Madhu"
	};
	private Random myRandom=new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		//pick a random string from array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
