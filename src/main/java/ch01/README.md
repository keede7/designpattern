
### 전략패턴


행동을 상속할 때 단점.
1. 서브클래스에서 코드가 중복된다.
2. 실행시 특징을 바꾸기 어렵다
3. 모든 오리의 행동을 알기 힘들다.
4. 코드 변경시 다른 오리에 영향을 미칠 수 있다.
     


### 인터페이스의 사용

서브 클래스에서 해당 인터페이스를 구현해서 일부 문제점을 해결했다.

하지만, 코드를 재사용하지 않으므로 코드관리에 문제가 생긴다.

`Flyable`, `Quackable` 인터페이스를 사용하는 방법은 좋았지만, 

한가지 행동을 바꿀 떄 마다 그 행동에 정의된 서로 다른 서브클래스를 찾아서 일일히 고쳐야한다.

그 과정에서 새로운 버그가 발생할 수 도 있다.



### 디자인 원칙 특징 1

- 애플리케이션에서 달라지는 부분을 찾고 달라지지 않는 부분과 분리한다.

### 디자인 원칙 특징 2

- 구현보다 인터페이스에 맞춰 프로그래밍한다.



### 바뀌는 부분과 그렇지 않은 부분의 분리

분리를 하려면 아예 2개의 클래스 집합으로 만들어야한다.

나는것, 소리지르는 것에 대한 행동을 구현한 것을 각 클래스로 만들어서 집어넣는다.

```java
public class FlyWithWings implements FlyBehavior {
    void fly() {
        // 나는 방법을 구현한다.
    }
}

public class FlyNoWay implements FlyBehavior {
    void fly() {
        // 날지 못하는 방법을 구현한다.
    }
}
```

지금까지 Duck 클래스에 구체적으로 구현하거나 서브클래스에서 자체적으로 구현하는 방법과는 다른 방법이다.

이전 방법은 특정 구현에 의존했으므로 행동을 변경할 여지가 없었다.

이 방법으로는 굳이 Duck 클래스에서나 서브클래스에서 구현을 할 필요가 없어진다.

이런식으로 하면 날 수 있는 오리들에 대한 구현을 할 필요 없이 해당 구현체로 갈아끼우면 된다.

변경을 할 때에도 해당 구현클래스에서 변경만 해주면 된다.


### 행동의 통합

`Fly` 와 `Quack` 행동은 모두 인터페이스로 옮겼으므로 기존의 `Duck` 에서 `fly()` 와 `quack()` 은 필요가없다.






