package com.pkg.string.manipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
	public static void main(String[] args) {
		String input = "aaaaammmmmmmmirrrr2000";
		Map<Character, Long> countMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<Map.Entry<Character, Long>> countList = new ArrayList<>(countMap.entrySet());
		countList.sort(Map.Entry.comparingByValue());
		Map.Entry<Character, Long> entry = countList.get(countList.size() - 1);
		System.out.println(entry.getKey() + "=" + entry.getValue());
	}
}
