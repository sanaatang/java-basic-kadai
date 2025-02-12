package text.section_14;

public class MethodPlus_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		addPostage(1000);
		
		addPostage(1200);
	}

	public static void addPostage( final int price ) {
		int total = price + 500;
		System.out.println("送料込みの料金は" + total + "円");
	}
}
