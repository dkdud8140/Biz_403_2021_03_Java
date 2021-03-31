package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.classes.model.IolistVO_2;

/*
 * IolistVO는 한개의 데이터를 담을 수 있도록 설계.
 * 실제 프로젝트에서는 1개의 데이터만 있는 경우는 없다.
 * 
 * 여러개의 데이터 묶음으로 연산을 수행해야 한다.
 * 데이터의 묶음을 처리할때는 보통 배열을 사용한다.
 * 하지만 배열은 그 구조상 다소 불편할때가 존재
 * 
 * java에ㅐ서는 배열을 사용해야하는 프로젝트에서 
 * List 클래스를 사용한 객체를 생성하여 진행을 한다/
 * 
 */
public class IolistServiceV1 {
	/*
	 * 매입매출 데이터들을 사용하여 연산을 수행할텐데 매입매출 데이터들의 묶음을 List 형 객체 사용.
	 * 
	 * List형 객체에 포함된(개별)데이터는 IoListVO형으로 사용하겠다.
	 * 
	 * 낱개 데이터는 IoListVO클래스 형으로 사용하고 그 데이터들을 묶어서 List형으로 연산 수행을 하겠다는 선언
	 * 
	 * 
	 * 
	 * iolist를 private로 선언한 이유
	 * 
	 * 혹시 외부에서 Iolist 데이터에 접근하여 값을 저장하는 일을 방지하기 위함이다.
	 * 
	 * V1클래스를 상속하여 사용할 예정이라면 protected로 선언한다
	 */

	// TODO 맴버변수 선언하기
	protected List<IolistVO_2> iolist;
	protected Scanner scan;

	public IolistServiceV1() {
		// TODO 클래스 생성자
		iolist = new ArrayList<IolistVO_2>();
		scan = new Scanner(System.in);
	}

	public void input() {
		// TODO 매입매출 등록하기
		System.out.println("==================================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> ");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();

		System.out.print("매입단가 >> ");
		Integer iprice = scan.nextInt();

		System.out.print("매출단가 >> ");
		Integer oprice = scan.nextInt();

		IolistVO_2 iolistVO = new IolistVO_2();
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIpice(iprice);
		iolistVO.setOpice(oprice);
		iolistVO.setPname(pname);
		iolistVO.setQty(qty);

		// this.printIolist(iolistVO);

		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);
	}

	public void printIolist(IolistVO_2 vo) {
		// TODO 한개 데이터 출력하기
		System.out.print(vo.getPname() + "\t");
		System.out.print(vo.getDate() + "\t");
		System.out.print(vo.getDname() + "\t");
		System.out.print(vo.getInout() + "\t");
		System.out.print(vo.getQty() + "\t");
		System.out.print(vo.getIpice() + "\t");
		System.out.println(vo.getOpice() + "\n");
	}

	// public 으로 선언된 method는 객체.method()형식으로 호출이 가능한 method
	// 리턴 타입이 명확히 결정되지 않았을 떄는 void 형으로 작용한다.
	public void selectMenu() {
		// TODO 업무선택하기 메뉴
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println("KMS 쇼핑몰 업무관리");
			System.out.println("-".repeat(50));
			System.out.println("1. 매입매출등록");
			System.out.println("2. 매입매출 리스트 출력");
			System.out.println("QUIT. 업무종료");
			System.out.println("-".repeat(50));
			System.out.print("업무선택 >> ");

			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				break;
			}
			Integer intMenu = null;

			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("메뉴선택오류");
				System.out.println("메뉴는 1, 2, QUIT만 선택 가능");
				continue;
			}

			if (intMenu == 1) {
				this.input();
			} else if (intMenu == 2) {
				this.printAllList();
			}
		} // end while

	}

	public void printAllList() {
		// TODO 저장된 리스트 출력하기
		System.out.println("=".repeat(50));
		System.out.println("상품명\t거래일자\t구분\t수량\t매입단가\t매출단가");
		System.out.println("-".repeat(50));
		for (int i = 0; i < iolist.size(); i++) {
//			IolistVO_2 vo = iolist.get(i);
//			this.printIolist(vo);
			this.printIolist(iolist.get(i));
		}
		System.out.println("=".repeat(50));
	}

}
