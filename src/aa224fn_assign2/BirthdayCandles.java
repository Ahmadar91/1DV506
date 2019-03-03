package aa224fn_assign2;

public class BirthdayCandles {

	public static void main(String[] args) {

		int box = 0;
		int Rcan = 0;
		int total = 0;

		for (int birth = 1; birth <= 100; birth++) {

			if (birth > Rcan) {

				if ((birth - Rcan) < 24) {
					box = 1;

				}

				else if ((birth - Rcan) >= 24) {

					if ((birth - Rcan) % 24 == 0)

						box = (birth - Rcan) / 24;

					else

						box = ((birth - Rcan) / 24) + 1;
				}
				Rcan += box * 24 - birth;

			}

			else {

				box = 0;
				Rcan = Rcan - birth;

			}

			System.out.println("Before birthday " + birth + " buy boxe(es) " + box + " ");
			total += box;
		}

		System.out.println("total number of boxes " + total + " Remaining candles " + Rcan + " ");

	}

}
