package study_01.star;

public class Star {

	public static void main(String[] args) {
		triangle(7); // 삼각형
		Inverted_triangle(7); // 역삼각형

		
		diamond(7); // 다이아몬드
		Sandglass(7); // 모래시계

		rectangle(7); // 직각 삼각형
	}

	/**
	 * @param size
	 */
	private static void triangle(int size) {
		System.out.println("###삼각형###");
		for (int row = 0; row < size / 2 + 1; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print((size / 2 - row <= col && col <= size / 2 + row) ? "*" : " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param size
	 */
	private static void Inverted_triangle(int size) {
		System.out.println("###역삼각형###");
		for (int row = 0; row < size / 2 + 1; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print((row <= col && col <= size - row - 1) ? "*" : " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param size
	 */
	private static void diamond(int size) {
		System.out.println("###다이아몬드###");
		int count = 0;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print((size / 2 - count <= col && col <= size / 2 + count) ? "*" : " ");
			}
			System.out.println();
			if (row < (size / 2))
				count++;
			else
				count--;
		}
	}

	/**
	 * @param size
	 */
	private static void Sandglass(int size) {
		System.out.println("###모래시계###");
		int count = 0;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print((count <= col && col <= size - count - 1) ? "*" : " ");
			}
			System.out.println();
			if (row < (size / 2))
				count++;
			else
				count--;
		}
	}

	/**
	 * @param size
	 */
	private static void rectangle(int size) {
		System.out.println("###직각 삼각형###");
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print((row >= col) ? "*" : " ");
			}
			System.out.println();
		}
	}
}
