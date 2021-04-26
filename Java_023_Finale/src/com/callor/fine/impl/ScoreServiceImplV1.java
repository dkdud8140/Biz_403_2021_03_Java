package com.callor.fine.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.fine.model.ScoreVO;
import com.callor.fine.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	private List<ScoreVO> scoreList ;
	private Scanner scan ;
	
	
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in) ;
	
	}
	
	
	
	
}
