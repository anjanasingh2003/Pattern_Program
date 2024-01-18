
public class pattern

{
	public static void main(String[] args) // dymand pattern
	{
		int n=7;
		// outer loop= real image
		for (int line = 1; line <= n; line++) {
			// space
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");
			}
			// print *
			for (int star = 1; star <= ((2 * line) - 1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// outer loop= mirror image
		for (int line = n; line >= 1; line--) {
			// space
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");

			}
			// print *
			for (int star = 1; star <= ((2 * line) - 1); star++)

			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}


