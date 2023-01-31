package mission0125;

public class mission012503 {
	public static void main(String[] args) {
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		System.out.println(var1 + ", " + var2);
		var3 = var1;
		System.out.println(var1 + ", " + var3);

		float var5 = 123456.789123f;
		double var6 = 123456.789123;
		var6 = var5;
		System.out.println(var5 + ", " + var6);
		var6 = var5;
		System.out.println(var5 + ", " + var6);
	}
}