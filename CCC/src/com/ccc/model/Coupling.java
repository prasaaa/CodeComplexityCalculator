package com.ccc.model;

import java.util.ArrayList;

public class Coupling {
	
	private String fileName;
	
	private final int Wr = 2;
	private final int Wmcms = 2;
	private final int Wmcmd = 3;
	private final int Wmcrms = 3;
	private final int Wmcrmd = 4;
	private final int Wrmcrms = 4;
	private final int Wrmcrmd = 5;
	private final int Wrmcms = 3;
	private final int Wrmcmd = 4;
	private final int Wmrgvs = 1;
	private final int Wmrgvd = 2;
	private final int Wrmrgvs = 1;
	private final int Wrmrgvd = 2;
	
	private Line line;
	private int[] lineWeight = new int[14];
	private int Nr;
	private int Nmcms;
	private int Nmcmd;
	private int Nmcrms;
	private int Nmcrmd;
	private int Nrmcrms;
	private int Nrmcrmd;
	private int Nrmcms;
	private int Nrmcmd;
	private int Nmrgvs;
	private int Nmrgvd;
	private int Nrmrgvs;
	private int Nrmrgvd;
	
	private ArrayList<Line> MethodList;
	private ArrayList<Line> methodSetFull;
	private ArrayList<Line> calledMethodList;
	private ArrayList<Line> globalVariableList;
	private ArrayList<Line> regularMethods;
	private ArrayList<Line> recursiveMethods;
	private ArrayList<Line> regularInRegularMethods;
	private ArrayList<Line> recursiveInRegularMethods;
	private ArrayList<Line> recursiveInRecursiveMethods;
	private ArrayList<Line> regularInRecursiveMethods;
	
	
	
	public Coupling(String fileName) {
		this.setFileName(fileName);
		this.MethodList = null;
		this.calledMethodList = null;
		this.regularMethods = null;
		this.recursiveMethods = null;
		this.regularInRegularMethods = null;
		this.methodSetFull = null;
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

	public int getWr() {
		return Wr;
	}

	public int getWmcms() {
		return Wmcms;
	}

	public int getWmcmd() {
		return Wmcmd;
	}

	public int getWmcrms() {
		return Wmcrms;
	}

	public int getWmcrmd() {
		return Wmcrmd;
	}

	public int getWrmcrms() {
		return Wrmcrms;
	}

	public int getWrmcrmd() {
		return Wrmcrmd;
	}

	public int getWrmcms() {
		return Wrmcms;
	}

	public int getWrmcmd() {
		return Wrmcmd;
	}

	public int getWmrgvs() {
		return Wmrgvs;
	}

	public int getWmrgvd() {
		return Wmrgvd;
	}

	public int getWrmrgvs() {
		return Wrmrgvs;
	}

	public int getWrmrgvd() {
		return Wrmrgvd;
	}

	public int getNr() {
		return Nr;
	}

	public void setNr(int nr) {
		Nr = nr;
	}

	public int getNmcms() {
		return Nmcms;
	}

	public void setNmcms(int nmcms) {
		Nmcms = nmcms;
	}

	public int getNmcmd() {
		return Nmcmd;
	}

	public void setNmcmd(int nmcmd) {
		Nmcmd = nmcmd;
	}

	public int getNmcrms() {
		return Nmcrms;
	}

	public void setNmcrms(int nmcrms) {
		Nmcrms = nmcrms;
	}

	public int getNmcrmd() {
		return Nmcrmd;
	}

	public void setNmcrmd(int nmcrmd) {
		Nmcrmd = nmcrmd;
	}

	public int getNrmcrms() {
		return Nrmcrms;
	}

	public void setNrmcrms(int nrmcrms) {
		Nrmcrms = nrmcrms;
	}

	public int getNrmcrmd() {
		return Nrmcrmd;
	}

	public void setNrmcrmd(int nrmcrmd) {
		Nrmcrmd = nrmcrmd;
	}

	public int getNrmcms() {
		return Nrmcms;
	}

	public void setNrmcms(int nrmcms) {
		Nrmcms = nrmcms;
	}

	public int getNrmcmd() {
		return Nrmcmd;
	}

	public void setNrmcmd(int nrmcmd) {
		Nrmcmd = nrmcmd;
	}

	public int getNmrgvs() {
		return Nmrgvs;
	}

	public void setNmrgvs(int nmrgvs) {
		Nmrgvs = nmrgvs;
	}

	public int getNmrgvd() {
		return Nmrgvd;
	}

	public void setNmrgvd(int nmrgvd) {
		Nmrgvd = nmrgvd;
	}

	public int getNrmrgvs() {
		return Nrmrgvs;
	}

	public void setNrmrgvs(int nrmrgvs) {
		Nrmrgvs = nrmrgvs;
	}

	public int getNrmrgvd() {
		return Nrmrgvd;
	}

	public void setNrmrgvd(int nrmrgvd) {
		Nrmrgvd = nrmrgvd;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setEndLineNumber(int lineNumber ,int number) {
		this.MethodList.get(lineNumber).setEndLineNumber(number);
	}
	
	public void setMethodList(ArrayList<Line> methodList) {
		this.MethodList = new ArrayList<Line>(methodList);
	}

	public void setCalledMethodList(ArrayList<Line> calledMethodList) {
		this.calledMethodList = new ArrayList<Line>(calledMethodList);
	}

	public ArrayList<Line> getGlobalVariableList() {
		return globalVariableList;
	}

	public void setGlobalVariableList(ArrayList<Line> globalVariableList) {
		this.globalVariableList = globalVariableList;
	}

	public void setRegularMethods(ArrayList<Line> regularMethods) {
		this.regularMethods = new ArrayList<Line>(regularMethods);
	}

	public void setRecursiveMethods(ArrayList<Line> recursiveMethods) {
		this.recursiveMethods = new ArrayList<Line>(recursiveMethods);
	}

	public void setRegularInRegularMethods(ArrayList<Line> regularToRegularMethods) {
		this.regularInRegularMethods = new ArrayList<Line>(regularToRegularMethods);
	}

	public void setRecursiveInRegularMethods(ArrayList<Line> recursiveInRegularMethods) {
		this.recursiveInRegularMethods = recursiveInRegularMethods;
	}

	
	public ArrayList<Line> getMethodList(){
		return MethodList;
	}

	public ArrayList<Line> getCalledMethodList(){
		return calledMethodList;
	}

	public ArrayList<Line> getRegularMethods(){
		return regularMethods;
	}
	
	public ArrayList<Line> getRecursiveMethods(){
		return recursiveMethods;
	}
	
	public ArrayList<Line> getRegularInRegularMethods(){
		return regularInRegularMethods;
	}

	public ArrayList<Line> getRecursiveInRegularMethods() {
		return recursiveInRegularMethods;
	}

	public ArrayList<Line> getMethodSetFull() {
		return methodSetFull;
	}

	public void setMethodSetFull(ArrayList<Line> methodSetFull) {
		this.methodSetFull = methodSetFull;
	}

	public ArrayList<Line> getRecursiveInRecursiveMethods() {
		return recursiveInRecursiveMethods;
	}

	public void setRecursiveInRecursiveMethods(ArrayList<Line> recursiveInRecursiveMethods) {
		this.recursiveInRecursiveMethods = recursiveInRecursiveMethods;
	}

	public ArrayList<Line> getRegularInRecursiveMethods() {
		return regularInRecursiveMethods;
	}

	public void setRegularInRecursiveMethods(ArrayList<Line> regularInRecursiveMethods) {
		this.regularInRecursiveMethods = regularInRecursiveMethods;
	}

	
	
}
