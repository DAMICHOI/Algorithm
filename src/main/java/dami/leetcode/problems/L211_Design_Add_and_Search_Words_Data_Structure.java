package dami.leetcode.problems;

import java.util.HashSet;

public class L211_Design_Add_and_Search_Words_Data_Structure {
	public static void main(String[] args) {
		WordDictionary obj = new WordDictionary();
		obj.addWord("bad");
		obj.addWord("dad");
		obj.addWord("mad");
		System.out.println(obj.search("pad"));
		System.out.println(obj.search("bad"));
		System.out.println(obj.search(".ad"));
		System.out.println(obj.search("b.."));
	}
}

class WordDictionary {
	private WordDictionary[] children;
	boolean isEndOfWord;

	public WordDictionary() {
		children = new WordDictionary[26];
		isEndOfWord = false;
	}

	public void addWord(String word) {
		WordDictionary curr = this;
		for (char c : word.toCharArray()) {
			if (curr.children[c - 'a'] == null) {
				curr.children[c - 'a'] = new WordDictionary();
			}
			curr = curr.children[c - 'a'];
		}
		curr.isEndOfWord = true;
	}

	public boolean search(String word) {
		WordDictionary curr = this;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c == '.') {
				for (WordDictionary ch : curr.children) {
					if (ch != null && ch.search(word.substring(i + 1)))
						return true;
				}
				return false;
			}
			if (curr.children[c - 'a'] == null)
				return false;
			curr = curr.children[c - 'a'];
		}
		return curr != null && curr.isEndOfWord;
	}
}