package condition;

public class ConditionExample {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		switch (num) {
		case 6:
			System.out.println("6번이 출력 되었습니다.");
			break;
		case 5:
			System.out.println("5번이 출력 되었습니다.");
			break;
		case 4:
			System.out.println("4번이 출력 되었습니다.");
			break;
		case 3:
			System.out.println("3번이 출력 되었습니다.");
			break;
		case 2:
			System.out.println("2번이 출력 되었습니다.");
			break;
		default:
			System.out.println("1번이 출력 되었습니다.");
			break;

		}
	}
}