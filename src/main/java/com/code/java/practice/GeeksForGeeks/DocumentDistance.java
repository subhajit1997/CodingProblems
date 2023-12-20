package com.code.java.practice.GeeksForGeeks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//https://www.geeksforgeeks.org/measuring-the-document-similarity-in-python/

public class DocumentDistance {

	public static void main(String[] args) {
		if (args.length != 2)
			System.out.println("Not enough arguments");
		else {
			String fileName1 = args[0];
			String fileName2 = args[1];
			HashMap<String, Integer> hashData1 = wordFrequencyFromFile(fileName1);
			HashMap<String, Integer> hashData2 = wordFrequencyFromFile(fileName2);
			double distance = vectorAngle(hashData1, hashData2);
			System.out.println(distance);
		}

	}

	private static double vectorAngle(HashMap<String, Integer> hashData1, HashMap<String, Integer> hashData2) {
		double numerator = inner_product(hashData1, hashData2);
		System.out.println("numerator: " + numerator);
		double denominator = Math.sqrt(inner_product(hashData1, hashData1) * inner_product(hashData2, hashData2));
		System.out.println("denominator: " + denominator);
		return Math.acos(numerator / denominator);
	}

	private static double inner_product(HashMap<String, Integer> hashData1, HashMap<String, Integer> hashData2) {
		double sum = 0.0;
		int i = 0;
		for (String key1 : hashData1.keySet()) {
			if (hashData2.containsKey(key1)) {
				sum = sum + (hashData1.get(key1) * hashData2.get(key1));
			}
		}
		return sum;
	}

	private static HashMap<String, Integer> wordFrequencyFromFile(String fileName) {
		List<String> fileData = readFileContent(fileName);
		sortData(fileData);
		HashMap<String, Integer> hashData = new HashMap<String, Integer>();
		fileData.forEach(s -> {
			if (hashData.containsKey(s)) {
				Integer count = hashData.get(s);
				hashData.put(s, count + 1);
			} else
				hashData.put(s, 1);
		});
		// Alternatives : Using Java 8 Map & compute
		// Alternatives : Using Java 8 parallel stream
		// https://www.javacodemonk.com/count-word-frequency-in-java-e6c2918a
		return hashData;
	}

	private static void sortData(List<String> fileData) {
		Collections.sort(fileData);

	}

	private static List<String> readFileContent(String fileName) {
		String str = "";
		List<String> listword = new ArrayList<String>();
		try {
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((str = br.readLine()) != null) {
				String[] sbc = str.split(" ");
				for (String a : sbc) {
					if (!a.isEmpty() || !a.contentEquals(" "))
						listword.add(a);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listword;
	}

}
