public class Test {
	public static void main(String[] args) {
		int[] b = test(new int[] { 2, 4, 6, 8, 5, 3, 5, 7, 2, 1, 9, 3, 6, 1, 2,
				3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.print(b.length + ",");
		if (b != null && b.length > 0) {
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i] + ",");
			}
		}
	}

	static int[] test(int[] a) {
		int equalcount = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				} else if ((a[i] == a[j]) && (j < a.length - equalcount)
						&& (i < a.length - equalcount) && (i != j)) {
				//	equalcount++;

					// int tmp = a[j];
					// a[j] = a[0];
					// a[0] = tmp;
					// i = i + equalcount;
				} else {
					continue;
				}
			}
		}
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==a[i-1])
			{
				equalcount++;
			}
		}

		int[] b = new int[a.length - equalcount];
		b[0] = a[0];
		for (int i = 1, j = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				continue;
			}
			b[j] = a[i];
			j++;
		}
		return b;
		// return null;
	}

}
