package com.ccc.model;

import java.util.ArrayList;

public class Inheritance {

	private String fileName;
	private Line line;
	private int[] lineWeight;
	
	
	private int Ndi ;//number of direct inheritance
	private int Nidi ;//number of indirect inheritance
	private int Ti ;//number of total inheritance
	private int Ci ;//complexity due to inheritance
	
	private ArrayList<Line> DirectInheritanceSet;
	private ArrayList<Line> IndirectInheritanceSet;
	
	


	//Number of direct Inheritance setter
	
	

	public int isNdi() {
		return Ndi;
	}

	public void setNdi(int ndi) {
		Ndi = ndi;
	}

	
	//Number of Indirect Inheritance setter
	
	public int isNidi() {
		return Nidi;
	}

	public void setNidi(int nidi) {
		Nidi = nidi;
	}


	// Total Inheritance getter and setter
	
	public int getTi() {
		return Ti;
	}

	public void setTi(int ti) {
	 Ti = ti;	
	 Ti = Nidi + Ndi;
	}

	//Inheritance complexity getter and setter
	
	public int getCi() {
		return Ci;
	}

	public void setCi(int ci) {
		Ci = ci ;
		if(Ti <=3) {
			Ti = Ci;
		}else {
			Ci = 4;
		}
	}
// if total inheritance <= than 3 then it equals to complexity due to inheritance
//else maximum complexity is set to by default 4

	//Inheritance constructor
	
	public Inheritance(String fileName) {
		
	}
	
	
	
	public Line getLine() {
		return line;
	}
	
	public int[] getLineWeight() {
		return lineWeight;
	}
	
	public void setLine(Line line) {
		this.line = line;
	}
	
	public void setLineWeight(int[] lineWeight) {
		this.lineWeight = lineWeight;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	
	public ArrayList<Line> getDirectInheritanceSet() {
		return DirectInheritanceSet;
	}

	public ArrayList<Line> getIndirectInheritanceSet() {
		return IndirectInheritanceSet;
	}
	
	public void setIndirectInheritanceSet(ArrayList<Line> indirectInheritanceSet) {
		this.IndirectInheritanceSet = indirectInheritanceSet;
		
	}

	public void setDirectInheritanceSet(ArrayList<Line> directInheritanceSet) {
		this.DirectInheritanceSet = directInheritanceSet;
		
	}


}
