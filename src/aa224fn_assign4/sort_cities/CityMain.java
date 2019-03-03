package aa224fn_assign4.sort_cities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CityMain {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Seiya\\Documents\\lNU Workspace\\SortCity.txt");

		BufferedReader input = new BufferedReader(new FileReader(file));
		System.out.println("Reading File from: " + file);
		String save;
		ArrayList<City> list = new ArrayList<City>();
		while ((save = input.readLine()) != null) {

			int a = save.indexOf(";");
			String CityName = save.substring(0, a);
			String ZipCode = save.substring(a + 1);
			int Zipcode = Integer.valueOf(ZipCode);
			City city = new City(CityName, Zipcode);
			list.add(city);
		}
		Collections.sort(list);
		System.out.println("Number of Cities: " + list.size());
		System.out.println();
		String str = "";
		for (int i = 0; i < list.size(); i++) {
			str += list.get(i) + "\n";
		}
		System.out.println(str);

		input.close();
	}
}
	