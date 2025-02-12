package text.section_10;

public class ForSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        for( int i = 1; i < 11; i++ ) {
        	System.out.println(i);
        	if( i == 5 ) {
        		System.out.println("繰り返し処理を強制終了します");
        		break;
        	}
        }
	}

}
