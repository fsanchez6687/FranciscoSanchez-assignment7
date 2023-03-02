public class CustomArrayListApplication {

	public static void main(String[] args) {
		ex1();
		System.out.println("-----------");
		ex2();
		System.out.println("-----------");		
		ex3();
		System.out.println("-----------");
		ex4();
	}
	
	private static void ex1() {
		CustomList<Integer> numbersList = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbersList.add(i, i);
		}
		numbersList.add(1, 1000);
		for (int i = 0; i < 20; i++) {
			System.out.println(numbersList.get(i));
			
		}
		
	}

	private static void ex2() {
		CustomList<Integer> numbersList = new CustomArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbersList.add(i, i);
		}
		numbersList.add(5, 14);
		
		for (int i = 0; i < 20; i++) {
			System.out.println(numbersList.get(i));
			
		}
		
	}

	private static void ex3() {
		String[] nameArray = { "Jacky", "Erika", "Carlos", "Vicky", "Pitbull", "Chipotle",
				"Tesla", "Elon", "Spiderman", "James", "007", "Bond", "Obama" };
		CustomList<String> names = new CustomArrayList<>();
		for (int i = 0; i < nameArray.length; i++) {
			names.add(nameArray[i]);
		}
		for (int i = 0; i < names.getSize(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(names.getSize());

	}

	private static void ex4() {
		CustomList<Integer> numbers = new CustomArrayList<>();


		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		
		for (int i = 0; i < numbers.getSize(); i++) {
			System.out.println(numbers.get(i));

		}
		System.out.println(numbers.getSize());
		System.out.println(numbers.get(9));
	}

}