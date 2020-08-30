package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    @DisplayName("이름을 가진 자동차가 정상적으로 생성 되는지 확인한다.")
    @Test
    void constructorTest() {
        final Car expected = new Car("jun");

        assertThat(new Car("jun"))
                .isInstanceOf(Car.class)
                .isEqualToComparingFieldByField(expected);
    }
}
