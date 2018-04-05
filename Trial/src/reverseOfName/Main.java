package reverseOfName;

public class Main {

	public static void main(String[] args) {

		String name = "Shivam Kumar Singh";
		String arr[] = name.split(" ");
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i] + " ");

	}

}
