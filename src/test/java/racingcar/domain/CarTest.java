package racingcar.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CarTest {
	@ParameterizedTest
	@MethodSource("generateInput")
	void 이름_길이_1이상_5이하(String input) {
		assertThatThrownBy(() -> new Car(input))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessageContaining("의 길이가 1~5 사이에 있지 않습니다.");
	}

	static Stream<Arguments> generateInput() {
		return Stream.of(Arguments.of("bumblebee,pobi,sika"),
				Arguments.of("ie,aaaaa,jjjj"));
	}

	@ParameterizedTest
	@CsvSource(value = {"0 false", "3 false", "4 true", "9 true"}, delimiter = ' ')
	void 이동조건(int value, boolean expected) {
		Car car = new Car("bumbl");
		assertThat(car.move(value)).isEqualTo(expected);
	}

	@Test
	void 큰_포지션_반환() {
		Car car = new Car("a");
		car.move(4);
		car.move(4);

		assertThat(car.compareMaxPosition(3)).isEqualTo(3);
		assertThat(car.compareMaxPosition(1)).isEqualTo(2);
	}

	@ParameterizedTest
	@CsvSource(value = {"2:true", "3:false"}, delimiter = ':')
	void 포지션이_2인_자동차와_비교하여_우승_확인(int maxPosition, boolean expected) {
		Car car = new Car("a");

		car.move(4);
		car.move(4);

		assertThat(car.isMaxPosition(maxPosition)).isEqualTo(expected);
	}
}
