package text.section_14;

public class MethodPlus_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        final int postage1 = 500;
        final int postage2 = 800;
        
        addPostage( 1000, postage1 );
        
        addPostage( 1000, postage2 );
	}

	public static void addPostage( final int price, final int postage ) {
       int total = price + postage;
	System.out.println("送料込みの料金は" + total + "円");
  }
}
