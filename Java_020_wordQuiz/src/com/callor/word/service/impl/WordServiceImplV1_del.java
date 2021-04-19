package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.word.domain.WordVO;
import com.dkdud8140.standard.InputService;
import com.dkdud8140.standard.MenuService;
import com.dkdud8140.standard.impl.InputServiceImplV1;

public class WordServiceImplV1_del {

	protected InputService is;
	protected MenuService ms;

	protected Scanner scan;
	protected Random rnd;

	protected List<WordVO> wordList; // word들의 리스트
	protected int nWordCount; // wordList의 개수를 담을 변수

	protected final int 영어 = 0;
	protected final int 한글 = 1;

	public WordServiceImplV1_del() {
		this("src/com/callor/word/word.txt");
	}

	public WordServiceImplV1_del(String wordFile) {

		is = new InputServiceImplV1();

		scan = new Scanner(System.in);
		rnd = new Random();

		wordList = new ArrayList<WordVO>();
		this.loadWords(wordFile);
		nWordCount = wordList.size();
	}

	public void startGame() {

		String viewWord[] = this.getShuffleWord();
		this.inputWord(viewWord);

	}

	public String[] getShuffleWord() {

		int nWordIndex = rnd.nextInt(nWordCount);
		WordVO wordVO = wordList.get(nWordIndex);
		String shuffleEnglish[] = this.shuffleWord(wordVO.getEnglish());

		return shuffleEnglish;
	}

	private void inputWord(String[] viewWord) {

		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 영단어 게임 V1");
		System.out.println("-".repeat(50));

		System.out.println("다음 단어를 바르게 배열하여 입력!");
		System.out.println(Arrays.toString(viewWord));

		System.out.println(">> ");
		String strInput = scan.nextLine();
		System.out.println("=".repeat(50));

	}

	private String[] shuffleWord(String strEnglish) {

		String shuffleEnglish[] = strEnglish.split("");

		int nCount = shuffleEnglish.length;

		for (int i = 0; i < 10000; i++) {

			int index1 = rnd.nextInt(nCount);
			int index2 = rnd.nextInt(nCount);

			String temp = shuffleEnglish[index1];
			shuffleEnglish[index1] = shuffleEnglish[index2];
			shuffleEnglish[index2] = temp;
		}

		return shuffleEnglish;
	}

	private void loadWords(String wordFile) {
		// TODO word.txt 파일을 읽어 wordList 만들어두기

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				String words[] = reader.split(":");

				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[영어]);
				wordVO.setKorea(words[한글]);
				wordList.add(wordVO);

			}

			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
