package lekce_1;

public class example5 {

	public static void main(String[] args) {
		double var1, var2, var3;
		var1 = 2;
		var2 = 0;
		var3 = var1/var2;
		
if (var1 != 0 && var2 != 0) {
	System.out.println(var3);
}
else if (var2 !=0){System.out.println("zadejte nenulové èíslo");}
else if (var1 !=0){System.out.println("nulou dìlit nelze");}
}
}
