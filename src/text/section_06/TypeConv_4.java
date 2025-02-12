package text.section_06;

public class TypeConv_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int     price = 298;
        double    tax = 0.1;
        
        int charge = (int) (price + (price * tax) );
        System.out.println("料金:" + charge + "円");
	}

}
