package mmt;

public class EvenOddTest {

	public static void main(String[] args) {

		int a[] = { 2, 4, 3, 5, 6, 9, 1, 7, 8, 0 };
		int temp = 0, temp2 = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				temp = i + 1;

				while (temp < a.length) {
					if (a[temp] % 2 == 0) {
						temp2 = a[i];
						a[i] = a[temp];
						a[temp] = temp2;
						break;
					}
					temp++;
				}
			}
			System.out.print(a[i] + " ");
		}
	}

}
