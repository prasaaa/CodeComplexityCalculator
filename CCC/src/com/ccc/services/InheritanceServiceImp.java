package com.ccc.services;

import java.util.ArrayList;

import com.ccc.model.*;

public class InheritanceServiceImp implements InheritanceService {

	
	@Override
	public boolean isDirectInheritance(Line line) {

		if(line.getLineContent().contains("class") || line.getLineContent().contains("extends")){
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean isIndirectInheritance(Line line) {
		
		if(line.getLineContent().contains("toString")){
				return true;
			}else {
				return false;
			}
	}
	
	
	@Override
	public void getDirectInheritanceList(CustomFile file) {

		ArrayList<Line> DirectInheritanceSet;
		DirectInheritanceSet = new ArrayList<Line>();


		for (Line line : file.getLineSet()) {
			if (line.getLineContent().contains("class") && (line.getLineContent().contains("extends"))) {
				DirectInheritanceSet.add( new Line (line.getLineNumber()));
			}
		}
		file.getInheritance().setDirectInheritanceSet(DirectInheritanceSet);
	}

	
	@Override
	public void getIndirectInheritanceList(CustomFile file) {

		ArrayList<Line> IndirectInheritanceSet;
		IndirectInheritanceSet = new ArrayList<Line>();


		for (Line line : file.getLineSet()) {
			if (line.getLineContent().contains("toString") ) {
				IndirectInheritanceSet.add( new Line (line.getLineNumber()));
			}
		}
		file.getInheritance().setIndirectInheritanceSet(IndirectInheritanceSet);
	}
	

	
}
