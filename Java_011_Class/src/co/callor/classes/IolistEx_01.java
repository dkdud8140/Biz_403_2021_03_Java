package co.callor.classes;

import com.callor.classes.model.IolistVO_2;

public class IolistEx_01 {

	/*
	 * 진입점 method
	 * 시작점 method
	 * Run을 했을 때 제일 먼저 실행(호출)되는 method
	 * 
	 * 1. 소스코드 코딩하기 : IolistEx_01.java 파일을 작성하기
	 * 2. 컴파일 : IolistEx_01.java 파일을 번역하여 컴퓨터가 알 수 있는 부호들(코드)로
	 * 				변환하는 작업
	 * 				javac IolistEx_01.java 
	 * 3. 실행 : 컴파일되어서 생성된 IolistEx_01.class 파일을 컴퓨터 메모리에
	 * 				load하고 프로젝트를 실행
	 * 				java IolistEx_01
	 * 4. 가상머신 : 자바코드를 번역한 *.class 파일을 열어서 코드를 한 개 씩 운영체제, CPU에게
	 * 				 보내서 결과를 얻을 수 있게 하는 어플리케이션
	 *				 운영체제, CPU에 관계없이 코드를 실행하여 같은 결과를 내도록 하는 역할을 수행.
	 *
	 * 5. 진입점 method : static 으로 작성된 main() method
	 * 					  가상머신이 java로 컴파일된 코드파일에서
	 * 					  제일 먼저 찾는 메소드
	 * 						
	 * 						java IolistEx_01이라고 실행을 지시하면
	 * 						IolistEx_01.main()를 호출하여 코드를 실행하기 시작
	*/
	public static void main(String[] args) {
		
		/*
		 * VO클래스는 데이터를 저장하여
		 * 연산이 필요한 곳으로 이도으, 복사 등을 할 때
		 * 사용하는 도구, 바구니 역할을 한다
		 * 
		 * VO클래스에 데이터를 저장한다.
		 *  == VO클래스에 만들어진 맴버변수에 값을 저장한다.
		 *  
		 *  1. VO클래스를 사용하여 객체를 생성해야한다.
		 *  2. 객체.맴버변수 = 값 형식으로 데이터를 저장
		 *  3. 지금 만든 IolistVO  클래스의 맴버변수는 모두 private이기 때무에
		 *   	객체.맴버변수 형식으로는 값을 저장할 수 없다.
		 *  4. 맴버변수에 값을 저장할 때 setter method 를 통해서 저장.
		 */
		IolistVO_2 iolistVO = new IolistVO_2() ;
		
		iolistVO.setPname("신라면");
		iolistVO.setDate("2021-03-31");
		iolistVO.setDname("농심");
		iolistVO.setInout("매입");
		iolistVO.setIpice(500);
		iolistVO.setQty(100);
		
		//저장된 데이터 확인
		printIolist(iolistVO);
		
	}
	
	public static void printIolist(IolistVO_2 iolistVO) {
		System.out.print(iolistVO.getPname() + "\t");
		System.out.print(iolistVO.getDate() + "\t");
		System.out.print(iolistVO.getDname() + "\t");
		System.out.print(iolistVO.getInout() + "\t");
		System.out.print(iolistVO.getIpice() + "\t\t");
		System.out.print(iolistVO.getQty() + "\t");
	}
	
}
