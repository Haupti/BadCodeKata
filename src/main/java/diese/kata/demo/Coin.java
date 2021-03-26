package diese.kata.demo;

import java.util.Objects;

public class Coin {
	private final int value;


	public Coin(int i) {
		this.value = i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Coin coin = (Coin) o;
		return value == coin.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
