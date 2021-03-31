package com.callor.classes.service;

import com.callor.classes.model.IolistVO;
import com.callor.classes.model.IolistVO_2;

public class IolistServiceV3 extends IolistServiceV1 {

//	@Override
	public void input() {
		// TODO
		System.out.println("=".repeat(50));
		System.out.println("매입 매출 등록");
		System.out.println("-".repeat(50));

		System.out.print("상품명 (QUIT :입력중단) >> ");
		String pname = scan.next();
		if(pname == "QUIT") {
			return ;
		}

		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print("거래처명 >> (QUIT :입력중단)");
		String dname = scan.next();

		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();

		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();

		Integer iprice = this.inputPrice("매입");
		if(iprice < -1) {
			return;
		}
		
		Integer oprice = this.inputPrice("매출");
		if(oprice < -1) {
			return;
		}
		
		IolistVO_2 iolistVO = new IolistVO_2();
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIpice(iprice);
		iolistVO.setOpice(oprice);
		iolistVO.setPname(pname);
		iolistVO.setQty(qty);

		iolist.add(iolistVO);
		
	}

	private Integer inputPrice(String title) {

		while (true) {
			System.out.println(title + "단가를 입력하세요.");
			System.out.println(title + "단가는 0이상 입력하세요.");
			System.out.println("단가를 -1입력시 입력 중단.");
			System.out.println(title + "단가 >> ");
			Integer price = scan.nextInt();
			if(price == -1) {
				return null;
			} else if (price < 0) {
				System.out.println(title + "단가는 0이상 입력하세요.");
			} else {
				return price;
			}

		}
	}

}
