package Kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//単語リスト
		String[] searchWords = {"apple", "banana", "grape", "orange"};
		
		//検索実行
		for (String word : searchWords) {
			System.out.println(dictionary.searchWords(word));
		}

	}

}
