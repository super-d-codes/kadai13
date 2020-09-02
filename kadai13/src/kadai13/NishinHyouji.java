package kadai13;

public class NishinHyouji implements Observer {
	
	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}
	
	private void print(int n) {
		System.out.println(n + " を2進数で表示します");
		// 2進数変換プログラム
		String sn = Integer.toString(n, 2);
		System.out.println(sn);
	}
	
}
