package text.section_09;

public class AgeBasedFee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int age = 30;
        int fee;
        
        fee = switch(age) {
        case 10 -> 1000;
        case 20 -> 2000;
        case 30,40 -> 3000;
        case 50 -> 4000;
        default -> 500;        
        };
        
        System.out.println(age + "代の料金は" + fee + "円");
	}

}
