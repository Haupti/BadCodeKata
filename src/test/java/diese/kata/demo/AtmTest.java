package diese.kata.demo;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AtmTest {

	@Test
	void oneCentIsPayedOffAsAPenny() {
		assertThat(Pay.out(1)).isEqualTo(List.of(new Coin(1)));
	}

	@Test
	void getCoinOfValue(){
		assertThat(Pay.out(5)).isEqualTo(List.of(new Coin(5)));
		assertThat(Pay.out(2)).isEqualTo(List.of(new Coin(2)));
		assertThat(Pay.out(1)).isEqualTo(List.of(new Coin(1)));
		assertThat(Pay.out(0)).isEqualTo(Collections.emptyList());
	}

	@Test
	void splitsIntoToPenniesOfValue(){
		assertThat(Pay.out(4)).isEqualTo(List.of(new Coin(2),new Coin(2)));
		assertThat(Pay.out(3)).isEqualTo(List.of(new Coin(2), new Coin(1)));
		assertThat(Pay.out(10)).isEqualTo(List.of(new Coin(5),new Coin(5)));
	}

	@Test
	void splitsIntoGiggestPossibleSetOfCoins() {
		assertThat(Pay.out(11)).isEqualTo(List.of(new Coin(5),new Coin(5),new Coin(1)));
		assertThat(Pay.out(13)).isEqualTo(
				List.of(new Coin(5),new Coin(5),new Coin(2),new Coin(1)));
		assertThat(Pay.out(14)).isEqualTo(
				List.of(new Coin(5),new Coin(5),new Coin(2),new Coin(2)));
	}

}
