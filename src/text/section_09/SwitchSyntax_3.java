package text.section_09;

public class SwitchSyntax_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int randNum = (int)(Math.random() * 10);
        
        System.out.println(randNum);
        
        switch(randNum) {
        case 0,9 -> {
        	System.out.println("大当たりです");
        	System.out.println("ラッキー！");        	
        }
        case 1, 8 -> System.out.println("当たりです");
        default  -> System.out.println("はずれです");
        }
	}

}
