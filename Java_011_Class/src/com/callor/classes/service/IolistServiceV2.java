package com.callor.classes.service;

import com.callor.classes.model.IolistVO_2;

public class IolistServiceV2 extends IolistServiceV1 {

	/*
	 * V1의 input method를 재정의 매입단가, 매출단가는 반드시 0이상이어야한다. 유효성 검사를 하도혹 코드를 재정의 한다.
	 * 
	 */

//	@Override
	public void input() {
		// TODO 매입 매출 등록

		System.out.println("=".repeat(50));
		System.out.println("매입 매출 등록");
		System.out.println("-".repeat(50));
		
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
		
		
		//매입단가와 매출단가는 0 이상낭 입력한다.
		//매입단가가 0 이상이면 다음 항복을 입력받도록
		//while()문을 중단하고
		//매입단가가 0미만이면 계속해서 반복문 내에서 입력을 받도록
		Integer iprice ;
		while (true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			if (iprice < 0) {
				System.out.println("단가는 0원이상 입력하셔야합니다.");
				continue ;
			}
			break;
		}
		
		Integer oprice ;
		while (true) {
			System.out.print("매출단가 >> ");
			oprice = scan.nextInt();
			if (oprice < 0) {
				System.out.println("단가는 0원이상 입력하셔야합니다.");
				continue ;
			}
			break;
		}
		
		IolistVO_2 iolistVO = new IolistVO_2();
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIpice(iprice);
		iolistVO.setOpice(oprice);
		iolistVO.setPname(pname);
		iolistVO.setQty(qty);

		//this.printIolist(iolistVO);

		// 입력된 매입매출 데이터를 데이터 리스트에 담기
		iolist.add(iolistVO);
	}

	}


