package kadai_015;

public class Car_Chapter15 {
    //フィールド
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す
	
	//ギアチェンジメソッド
	public void gearChange(int afterGear) {
		int beforeGear = gear; //ギア変更前
		
		//ギア値によって速度を変更
		if (afterGear >= 1 && afterGear <= 5) {
			gear = afterGear;
			speed = afterGear * 10;
		} else {
			gear = 1;
			speed = 10;
		}
		
		//ギアの変更出力
		System.out.print("ギア" + beforeGear + "から" + gear + "に切り替えました" );
	}
	
	//速度メソッド
	public void run() {
		System.out.print("速度は" + "時速" + speed + "です");
	}
}
