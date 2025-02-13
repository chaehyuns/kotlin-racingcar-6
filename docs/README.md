## 자동차 경주 게임 ⚾️

---

### Domain ⚒️
- [x] 사용자는 경주할 자동차 이름과 시도할 횟수를 입력한다.
- [x] 컴퓨터는 1부터 9까지 수 중 하나를 임의로 선택한다.
    - [x] 선택된 숫자가 4 이상이면 전진한다.
- [x] 경주 게임이 진행된다.
  - [x] 경주 게임은 사용자가 입력한 시도 횟수만큼 반복된다.
- [x] 경주 게임이 완료된 후 우승자가 결정된다.
- [x] 자동차 경주 게임을 완료한 후 게임이 종료된다.

### Input 📥
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 이름은 5자 이하만 가능하다.
- [x] 사용자는 시도할 횟수를 입력할 수 있어야 한다.
- [x] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.

### Output 📤
- [x] 게임 시작 알림 문구를 출력한다.
- [x] 시도할 횟수 알림 문구를 출력한다.
- [x] 각 실행별 실행 결과를 출력한다.
- [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다.
  - [x] 우승자는 한 명 이상일 수 있다. 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.

### 프로그래밍 요구사항 🧐
* Kotlin 1.9.0에서 실행 가능해야 한다.
* Kotlin 코드로만 구현해야 한다.
* 프로그램 실행의 시작점은 Application의 main()이다.
* build.gradle(.kts)을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다. 
* Kotlin 코드 컨벤션 가이드를 준수하며 프로그래밍한다. 
* 프로그램 종료 시 System.exit()를 호출하지 않는다. 
* 프로그램 구현이 완료되면 ApplicationTest의 모든 테스트가 성공해야 한다. 
* 프로그래밍 요구 사항에서 달리 명시하지 않는 한 파일, 패키지 이름을 수정하거나 이동하지 않는다. 
* indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다. 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다. 
* 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라. 
* JUnit 5와 AssertJ를 이용하여 본인이 정리한 기능 목록이 정상 동작함을 테스트 코드로 확인한다.

---
