# java-racingcar
자동차 경주 게임 미션 저장소

## 게임 방법
1. 사용자는 각 자동차에 5자 이하의 이름을 쉼표(,)로 구분하여 부여한다.

2. 이후 사용자는 자동차들이 몇 회 이동할지 정한다.

3. 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
    * 전진하는 조건은 각 자동차에 0에서 9사이의 random 값이 정해진다.
    * random 값이 4 이상일 경우 전진, 3 이하의 값이면 멈춘다.

4. 각 회 마다 자동차들의 이름, 위치를 볼 수 있고, 주어진 횟수가 끝나면 가장 멀리 간 우승자를 선발한다.
    * 우승자~~동차~~는 한 명 이상일 수 있다.

## 구현할 기능 목록
* 레이스 정보를 초기화하는 기능
    1. [ ] 사용자가 입력한 자동차들을 리스트로 생성하는 기능
        * [ ] 사용자에게 여러 자동차 이름을 물어보는 기능(5자 이하, ','로 구분)
        * [ ] 사용자가 여러 자동차 이름을 입력하는 기능
            * [X] **입력의 공백**을 제거하는 기능
            * [X] [예외1] 각 자동차 **이름이 1자 이상, 5자 이하**인지 확인하는 기능
            * [X] [예외2] 자동차 **이름이 중복**되지 않는지 확인하는 기능
            * [X] [예외3] 자동차 **대수가 2대 이상**인지 확인하는 기능
            * [ ] 잘못된 자동차 입력이라는 것을 알려주는 기능
    
    2. [ ] 사용자가 입력한 레이스 횟수를 반환하는 기능
        * [ ] 사용자에게 시도할 레이스 횟수를 물어보는 기능
        * [ ] 사용자가 레이스 횟수를 입력하는 기능
            * [ ] 레이스 횟수 입력이 올바른지 확인하는 기능
                * [ ] [예외1] 입력된 레이스 **횟수가 정수**인지 확인하는 기능(문자 or 실수 x)
                * [ ] [예외2] 입력된 레이스 **횟수가 자연수**인지 확인하는 기능(1 회 미만 x)
            * [ ] 잘못된 레이스 횟수 입력이라는 것을 알려주는 기능

* [ ] 레이스를 시작하는 기능
    * [ ] 레이스 시작을 출력하는 기능

    * [ ] 레이스를 진행하는 기능
        * [ ] 각 자동차가 전진을 할지 말지 정하는 기능 (random 값이 4이상이면 전진 3이하면 정지)
            * [ ] Random 값을 구하는 기능(0에서 9 사이)
        * [ ] 자동차들의 현재 위치를 출력하는 기능

* [ ] 레이스 우승자를 출력하는 기능
    * [ ] 레이스 우승자를 반환하는 기능
        * [ ] 레이스 우승자의 위치를 반환하는 기능