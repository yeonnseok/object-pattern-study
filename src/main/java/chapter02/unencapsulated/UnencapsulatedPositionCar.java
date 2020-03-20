package chapter02.unencapsulated;

public class UnencapsulatedPositionCar {
    private String name;
    private int position;

    UnencapsulatedPositionCar(String name) {
        this.name = name;
    }

    /**
     * 요구사항 변경
     * 1. 3의 배수일 경우 -1 감소 (후진)
     * 2. 현재 포지션이 5일 경우 20으로 이동 (점프 존)
     * 3. 3의 배수이면서 2의 배수일 경우 3 증가 (부스터)
     * 4. 이름의 첫글자가 a로 시작하는 경우 매번 추가로 2 증가
     * @param number
     */
    public void move(int number) {
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                position += 3;
            }
            position -= 1;
        } else if (number == 5) {
            position = 20;
        }
        if (name.startsWith("a")) {
            position += 2;
        }
    }

    public String getName() {
        return name;
    }
}
