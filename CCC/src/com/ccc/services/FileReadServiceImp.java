package com.ccc.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.ccc.model.CustomFile;
import com.ccc.model.FileRead;
import com.ccc.model.Line;

public class FileReadServiceImp implements FileReadService{

	@Override
	public void openFile(FileRead file) {
		try{
			file.setScanner(new Scanner(new File(Main.WEBCONTENTDIR + "uploads/" + file.getFileName()))); 
        }catch(Exception e){
            System.out.println("Couldn't find the file.");
        }
	}

	@Override
	public void readFile(FileRead file, CustomFile fileobj) {
		int count=1;
		ArrayList<Line> lineSet = new ArrayList<Line>();
		while(file.getScanner().hasNext()){
			Line line = new Line(count, file.getScanner().nextLine());
			lineSet.add(line);
			count++;
        }
		fileobj.setLineSet(lineSet);
		fileobj.setLastIndex(lineSet.size());
	}

	@Override
	public void closeFile(FileRead file) {
		file.getScanner().close();
	}
	
}
