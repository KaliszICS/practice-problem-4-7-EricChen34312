public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validateAge(int age){
		if(age < 0){
			throw new IllegalArgumentException("Age cannot be negative");
		} else if (age > 150){
			throw new IllegalArgumentException("Age must be realistic");
		}

		return true;
	}

	public static double withdraw(double amount, double balance){
		if(amount > balance){
			throw new IllegalStateException("fund balance");
		} else if (amount <= 0){
			throw new IllegalArgumentException("negative");
		}
		return balance-amount;
	}

	public static int getElement(int[] array, int index){
		if(array == null){
			throw new NullPointerException("Array cannot be null");
		} else if (index >= array.length){
			throw new IndexOutOfBoundsException("I didn't need to do this but ok");
		}
		return array[index];
	}

	public static String validateEmail(String email){
		if(email == null || email.equals("")){
			throw new IllegalArgumentException("Email cannot be empty");
		} else if (!email.contains("@")){
			throw new IllegalArgumentException("Invalid email format");
		} else if (!email.substring(email.indexOf("@")).contains(".")){
			throw new IllegalArgumentException("Invalid email format");
		}

		return email.trim();
	}

}
