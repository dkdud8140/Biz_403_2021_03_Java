package com.callor.fine.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;
import com.callor.fine.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	protected List<ScoreVO> scoreList ;
	protected Scanner scan ;
	
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in) ;
	}


	@Override
	public void inputScore() {
	}


	@Override
	public void printList() {
	}
	
	
	
	
}
