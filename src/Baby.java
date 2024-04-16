public class Baby implements Papa, Mama{
	//Papa의 모든 함수 정의
	public void genderFather() {
		System.out.println("나는 아버지 입니다.");
		
	}
	
	//Mama의 모든 함수 정의
		public void genderMother() {
			System.out.println("나는 어머니 입니다.");
			
	}

	//Baby 클래스의 함수
		public void printInfo() {
			System.out.println("나는 아기 입니다.");
		}
}
