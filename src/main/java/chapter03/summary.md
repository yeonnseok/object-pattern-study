# chapter03. 다형성과 추상타입
## 1. 상속 개요
예를 들어 금액을 할인해주는 Coupon 을 명세한 객체가 있다고 해보자.
일정 금액 이상에만 할인을 해주는 LimitedPriceCoupon 을 추가로 
구현하고 싶을 때 이미 구현되어 있는 Coupon 클래스를 상속받으면
중복되는 구현을 그대로 사용할 수가 있다.

여기서 LimitedPriceCoupon 은 상위(super) 클래스 또는 부모(parent) 클래스라고
부른다. 자식 클래스는 부모 클래스에 정의된 구현을 물려 받는다.

부모 클래스에 구현된 메서드를 재정의하고 싶다면 오버라이드를 통해서 
재정의할 수 있다.

---
## 2. 다형성과 상속
다형성(polymorphism)은 한 객체가 여러가지 모습을 갖는 다는 것을 의미한다.
여기서 모습이란 타입을 뜻하는데, 다형성이란 한 객체가 여러 타입을 가질 수 
있다는 것을 뜻한다.

<img src="https://user-images.githubusercontent.com/42382027/77161200-6e164200-6aec-11ea-9943-cd4140e27acd.jpeg" width="400" height="250" />

위 그림을 보면 중간에 위치한 객체는 타입A, 타입B, 타입C 에 정의된 인터페이스의
구현을 제공하는데, 이 경우 다른 코드에서는 이 객체에게 타입A 에 
정의된 기능 실행을 요청하거나 타입B, 타입C에 정의된 기능실행도
요청할 수 있다.

즉, 이 객체를 타입A, 타입B, 타입C로도 사용할 수 있는 것이다.

자바에서는 이러한 타입 상속을 통해 다형성을 구현한다.
타입을 상속받을 수 있다는 말은 다시말해서 상속하는 타입이 제공하는 기능을
구현하여 제공할 수 있다는 것을 의미한다.

### 인터페이스 상속과 구현 상속
#### 인터페이스 상속 
인터페이스 상속은 순전히 `타입 정의만을 상속`받는 것이다.
자바의 인터페이스나, 추상 클래스를 상속받는 경우이다.

구현을 공유할 필요가 있다면 추상클래스를 사용하고,
구현을 공유할 필요없이 타입만을 상속하여 오퍼레이션들을 구현하고 
싶을 경우에는 인터페이스를 사용하면 된다.

#### 구현 상속
구현 상속은 클래스의 상속을 통해서 이루어진다. 구현 상속은 보통
상위 클래스에 정의된 기능을 재사용하기 위한 목적으로 사용된다.
그러나 원할 때는, 상속받는 메서드를 오버라이드해서 재정의 하기도 한다.

---
## 3. 추상 타입과 유연함
> 추상화(abstraction)는 데이터나 프로세스 등을 의미가 비슷한 개념이나 
표현으로 정의하는 과정이다. 

어떤 프로그램을 만드는데 세 가지 기능이 있다고 해보자.
* FTP에서 파일을 다운로드
* 소켓에서 데이터 읽기
* DB 테이블의 데이터를 조회

좀 더 자세히 분석해보면 세 기능은 모두 로그를 수집하기 위한 기능이다.
따라서 위 기능들은 각각 로그 수집이라는 보다 추상화된 공통의 개념으로 정의할 수 있다.
그러면 아래와 같이 로그 수집이라는 이름으로 상위 인터페이스를 추출할 수 있는 것이다.

```java
public interface LogCollector {
    void collect();
}
```
추상화된 타입은 오퍼레이션의 시그니처만 정의할 뿐 실제 구현을 제공하지는 못한다.
단지, `로그 정보를 수집한다는 의미만 제공`할 뿐이다.
이러한 추상화 과정은 객체지향 설계에서 매우 중요한 부분에 해당한다.

### 추상 타입을 이용한 구현 교체의 유연함
```
// 구체 클래스를 직접 사용하면 문제가 될까?
SocketLogReader reader = new SocketLogReader();
reader.collect();
```

물론 처음에는 문제가 되지 않는다. 하지만 조건에 따라 타입을 바꿔야할 경우
어김없이 또 if-else 문이 등장하게 된다.
```java
public class FlowController {
    public void process() {
        byte[] data = null;
        if (useFile) {
            FileDataReader fileReader = new FileDataReader();
            data = fileReader.read();
        }  else {
            SocketDataReader socketReader = new SocketDataReader();
            data = socketReader.read();
        }
    }
}
```
요구사항이 변화가 생기고, Reader의 방식이 계속 추가될 때마다 FlowController
는 영향을 받는다. 두 객체는 `어떤 곳으로 부터 바이트 데이터를 읽는다.`라는 공통점이 있다.

공통된 요소를 추상타입으로 추출할 수 있고, 그 타입을 사용하면
```java
public class FlowController {
    public void process() {
        ByteSource source = null;
        if (useFile) {
            source = new FileDataReader();
        } else {
            source = new SocketDataReader();
        }
        byte[] data = source.read();
    }
}
```
이렇게 추상타입으로 일원화 시킬 수 있다.
하지만 여전히 if-else문이 존재한다. 
ByteSource의 종류가 변경되더라도 FlowController가 바뀌지 않도록 하는 방법에는
다음의 두 가지 방법이 존재한다.

* ByteSource 타입의 객체를 생성하는 기능을 별도 객체로 분리한 뒤,
그 객체를 사용해서 ByteSource 생성
* 생성자(또는 다른 메서드)를 이용해서 사용할 ByteSource 를 전달받기

#### ByteSource 타입의 객체를 생성하는 객체를 별도로 분리
```java
public class ByteSourceFactory {
    public ByteSource create() {
        if (useFile()) {
            return new FileDateReader();
        } else {
            return new SocketDataReader();
        }
    }
    
    private boolean useFile() {
        String useFileVal = System.getProperty("useFile");
        return useFileVal != null && Boolean.valueOf(useFileVal);
    }   
    
    private static ByteSourceFactory instance;
    public static ByteSourceFactory getInstance() {
        if (instance == null) {
            return new ByteSourceFactory();
        }
    }
    private ByteSourceFactory();
}
```
ByteSourceFactory 클래스는 ByteSource 타입의 객체를 생성하는 과정을 추상화 했다고 볼 수 잇다.
이렇게 외부에서 필요한 객체를 생성해서 사용하면 코드가 한층 더 간결해 진다.
```java
public class FlowController {
    public void process() {
        ByteSource source = ByteSourceFactory.getInstance().create();
        byte[] data = source.read();
    }
}
```
여기서 만약 데이터를 읽는 방식이 하나더 추가되었다고 가정해보자.
변경되는 부분은 어디인가?
아마 ByteSourceFactory만 변경되면 되고, FlowController 의 코드는
변경하지 않아도 될 것이다.

현재까지 두번의 추상화 과정이 있었다.
* 바이트 데이터 읽기 : ByteSource 인터페이스 도출
* ByteSource 객체를 생성하기 : ByteSourceFactory 도출


> 결과적으로 추상화는 공통된 개념을 도출해서 추상 타입을 정의해 주기도 하지만,
> 많은 책임을 가진 객체로 부터 책임을 분리하는 촉매제가 되기도 한다.

### 인터페이스에 대고 프로그래밍하기
추상타입을 사용하면 기존 코드를 건드리지 않으면서 구체 클래스를 교체할 수 있는
유연함을 얻을 수 있는데, `인터페이스에 대고 프로그래밍하기` 규칙은
바로 추상화를 통한 유연함을 얻기 위한 규칙이다.

주의할 점은 유연함을 얻는 과정에서 타입(추상 타입)이 증가하고 구조도 
복잡해지기 때문에 모든 곳에서 인터페이스를 사용해서는 안된다는 것이다. 
이 경우, 불필요하게 프로그램의 복잡도만 증가시킬 수 있다.
**인터페이스를 사용해야 할 때는 변화 가능성이 높은 경우에 한해서 사용해야 한다.**

### 인터페이스는 인터페이스 사용자 입장에서 만들기
향후 구현 변경의 유연함을 얻기 위해 단순 인터페이스를 도출하게 되면
이름에서 특정 객체에 대한 인터페이스라고 착각할 수 있다.
다른 성격의 객체가 있다고 가정하고 둘의 공통 속성으로 추상화할 수 있는
네이밍을 지어야 한다.

### 인터페이스와 테스트
인터페이스의 추상 타입을 사용하면 특정 객체가 구현이 덜 되었더라도,
그것을 사용하는 객체는 추상 타입으로 정의를 해놓으면 테스트하기가 
수월해진다. 작동하는 듯한 임시의 코드로 구현해놓을 수 있기 때문이다.


