package kadai_018;

public class KatoExec_Chapter18 {
	
	public static void main(String[] args) {
		//オブジェクト作成
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//紹介実行
		taro.execIntroduce();
		System.out.println();
		ichiro.execIntroduce();
		System.out.println();
		hanako.execIntroduce();
	}

}
