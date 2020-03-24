package com.ccc.services;

import com.ccc.model.CustomFile;
import com.ccc.model.Line;

public interface InheritanceService {
	

	boolean isDirectInheritance(Line line);
	boolean isIndirectInheritance(Line line);

	
	void getDirectInheritanceList(CustomFile file);
	void getIndirectInheritanceList(CustomFile file);
	
}
