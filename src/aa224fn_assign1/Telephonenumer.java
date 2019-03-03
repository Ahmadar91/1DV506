package aa224fn_assign1;

import java.text.DecimalFormat;
import java.util.Random;
public class Telephonenumer {

	public static void main(String[] args) {

		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("000");
		DecimalFormat df1 = new DecimalFormat("00000");

		System.out.println("New Tepelphone Number");
		for (int i = 0 ; i <100000 ; i++) {
		int area = rand.nextInt(1000); // random between 0- 999
		int z = 1 + rand.nextInt(9); //andom between 1-9
		int local = rand.nextInt(100000);// random between 0-999999

		System.out.println("0" + df.format(area) + "-" + z + df1.format(local));

	}}

}

