package text.section_11;

public class WhileSyntax_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int dice = 1;
        int cnt = 0;
        
        while( dice != 6 ) {
        	if( 5 <= cnt ) {
        		System.out.println("5回に達したため強制終了します");
        		break;
        	}
        	
        	dice = (int)( Math.ceil( Math.random() * 6 ) );
            System.out.println("サイコロの目は" + dice);
        	
            cnt++;
        }
	}

}
