
public class ArrTable {

	public static void main(String[] args) {

		int table[][] = new int[10][10];
	

		for (int i = 0; i < table.length; i++) {

			for (int k = 0; k < table.length; k++)
				

			{

				table[i][k] = (i + 1) * (k + 1);

			}
		}

		for (int[] i : table) {

			for (int k : i) {

				System.out.print(k + "\t");
			}

			System.out.println();
		}
	}

}
