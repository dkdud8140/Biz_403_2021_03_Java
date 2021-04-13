package com.collar.score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_02 {
	public static void main(String[] args) {

		String fileName = "src/com/collar/score/sample_score.txt";

		FileReader fileReader = null;

		try {
			fileReader = new FileReader(fileName);

			for(;;) {
				/*
				 * read() 메소드는
				 * fileReader로 열린 파일에서 한 byte씩 데이터를 읽어서
				 * ASCII 코드 값으로 반환
				 */
				int result = fileReader.read();
				System.out.printf("%c", result);
			}
			
			//fileReader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
