package kadai_018;

 abstract public class Kato_Chapter18 {
		
		//フィールドの作成
		public String familyName = "加藤";       //姓を表す
		public String giveName;                 //名を表す
		public String address = "東京都中野◯×";  //住所を表す
		
		//コンストラクタ
		public Kato_Chapter18(String giveName) {
			this.giveName = giveName;
		}
		
		//共通の紹介を出力する
		public void commonIntroduce() {
		System.out.println("名前は" + familyName + giveName + "です");
		System.out.println("住所は" + address + "です");
		}
		
		//抽象メソッド
		abstract public void eachIntroduce();
		
		//紹介を実行する
		public void execIntroduce() {
			commonIntroduce();
			eachIntroduce();
			
		}


}
