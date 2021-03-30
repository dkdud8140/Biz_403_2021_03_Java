package com.callor.classes.service;

public class ValueServiceV1 {
	
	/*
	 * 클랴스의 맴버변수를 public으로 선언하난 것은 매우 위험한 코드이다,
	 * 어떤 이유로든 public으로 된 맴버변수는 값이 변경될 수 있다.
	 * 원하지 않는 값으로 변수 내용이 오염될 수 있다.
	 * 그러한 현상을 방지하기 위해 맴버변수는 가급덧 private으로 선언을 하고
	 * 맴버변수값을 객체[.변수 형식으로 읽어내고자 할 떄는
	 * getter() 메소드를 만들어주는 것이 좋다
	 * 
	 */
	private int retNum ;
	public int getRetNum() {
		return retNum;
	};
	
	public void nums() {
		//nums 메소드는 어떤 연산을 수행하고 그 결과값링 100을 호출한 곳에 리턴하고싶다
		//보이드메소드에서는 값을 리턴할 수 없다.
		//맴버변수를 선언하고 맴버변수에 값을 세팅해두었다.
		retNum = 100 ;
	}
	
	
	public Integer numsRet() {
		return 100 ;
	}
}
