package aa224fn_assign4.sort_cities;

public class City implements Comparable<City> {
	String name;
	int zip;

	public City(String name, int zip) {

		this.name = name;
		this.zip = zip;
	}

	public String getName() {
		return name;
	}

	public int getZip() {
		return zip;
	}

	public String toString() {
		;
		return "" +getZip() + " " + getName() ;

	}

	public int compareTo(City other) {
		if (getZip() > other.getZip())
			return 1;
		else if (getZip() < other.getZip())
			return -1;
		else
			return 0;
	}
}
