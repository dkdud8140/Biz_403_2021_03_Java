package com.callor.score.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1A {

	@Override
	public void viewWord() {

		Random rnd = new Random();
		int num = 0 ;
		
		while (true) {
			
			num++;
			
			WordVO word = this.getWord();

			String strEng = word.getEnglish();

			String[] strWords = strEng.split("");

			for (int i = 0; i < 100; i++) {
				int index1 = rnd.nextInt(strWords.length);
				int index2 = rnd.nextInt(strWords.length);

				String temp = strWords[index1];
				strWords[index1] = strWords[index2];
				strWords[index2] = temp;

			}

			System.out.println("=".repeat(50));
			System.out.println(word.toString());
			System.out.println(num +"번문제");
			System.out.println("-".repeat(50));
			System.out.println("다음 단어를 올바르게 배열하시오(Quit : 게임종료)");
			System.out.println(Arrays.toString(strWords));
			System.out.println("-".repeat(50));

			while (true) {
				System.out.print(" >> ");
				String strInput = scan.nextLine();

				if(strInput.equals("Quit")) return ;
				if (strInput.equalsIgnoreCase(word.getEnglish())) {
					System.out.println("★☆★정답★☆★");
					break;
				} else {
					System.out.println("힌트 : " + word.getKorea());
					continue;

				}
			}
		}

	}

}
