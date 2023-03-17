public class Main {
	public static void main(String[] args) {
		taskOne();
		taskTwo();
		taskThree();
		taskFour();
		taskFive();

	}

	static void taskOne() {
		short clientOS = 0;
		if (clientOS == 0) {
			System.out.println("Установите версию приложения для iOS по ссылке");
		} else {
			System.out.println("Установите версию приложения для Android по ссылке");
		}
	}

	static void taskTwo() {
		int deviceLimitYear = 2015;
		int clientDeviceYear = 2002;
		short clientOS = 0;
		if (clientOS == 0) {
			if (clientDeviceYear >= deviceLimitYear)
				System.out.println("Установите версию приложения для iOS по ссылке");
			else {
				System.out.println("Установите облегченную версию приложения для iOS по ссылке");
			}
		} else {
			if (clientDeviceYear >= deviceLimitYear) {
				System.out.println("Установите версию приложения для Android по ссылке");
			} else {
				System.out.println("Установите облегченную версию приложения для Android по ссылке");
			}
		}
	}

	static void taskThree() {
		int year = 1904;

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("Год високосный");
		} else {
			System.out.println("Год невисокосный");
		}
	}

	static void taskFour() {
		int deliveryDistance = 95;
		int deliveryDays = 1;
		if (deliveryDistance <= 100) {
			if (deliveryDistance > 20) {
				deliveryDays += 1;
			}
			if (deliveryDistance > 60) {
				deliveryDays += 1;
			}
			System.out.println("Доставка займёт " + deliveryDays + " дней");
		} else {
			System.out.println("Доставки нет");
		}
	}

	static void taskFive() {
		int monthNumber = 4;

		if (monthNumber <= 12 && monthNumber > 0) {
			int seasonNumber = monthNumber / 3;
			switch (seasonNumber) {
				case 1:
					System.out.println("Весна");
					break;
				case 2:
					System.out.println("Лето");
					break;
				case 3:
					System.out.println("Осень");
					break;
				default:
					System.out.println("Зима");
			}
		} else {
			System.out.println("Недопустимый номер месяца");
		}
	}
}