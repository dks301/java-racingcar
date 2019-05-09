package domain;

class Car {
    private String name;
    private int position;

    Car(String name) {
        this.name = name;
        this.position = 0;
    }

    /* 테스트용 생성자 */
    Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    void move(int randomNumber) {
        if (isMove(randomNumber)) {
            position++;
        }
    }

    static boolean isMove(int randomNumber) {
        return randomNumber >= Constant.MOVE_CONDITION;
    }

    void printPosition() {
        StringBuilder result = new StringBuilder(name + " : ");

        for (int i = 1; i <= position; i++) {
            result.append("-");
        }

        System.out.println(result);
    }

    int getMaxPosition(int pos) {
        return Math.max(pos, position);
    }

    boolean compareToPosition(int maxPosition) {
        return maxPosition == position;
    }

    String appendCarName(String carNames) {
        return carNames + (name + ", ");
    }
}
