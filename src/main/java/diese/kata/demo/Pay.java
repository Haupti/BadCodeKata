package diese.kata.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pay {

	private Pay() {
	}

	public static List<Coin> out(int amount) {
		List<Coin> coins = new ArrayList<>(Collections.emptyList());
		int rest = amount;

		iteration:
		while (rest > 0) {
			var nextCoinValue = 0;
			one:
			{
				nextCoinValue += 1;
				two:
				{
					if (nextCoinValue + 1 > rest) {
						break two;
					}
					nextCoinValue += 1;
					five:
					{
						if (nextCoinValue + 3 > rest) {
							break five;
						}
						coins.add(getCoinOfValue(nextCoinValue + 3));
						rest -= 5;
						continue iteration;
					}
					coins.add(getCoinOfValue(nextCoinValue));
					rest -= 2;
					continue iteration;
				}
				coins.add(getCoinOfValue(nextCoinValue));
				rest -= 1;
				continue iteration;
			}
		}
		return coins;
	}

	private static Coin getCoinOfValue(int nextCoinValue) {
		var value = 0;
		switch (nextCoinValue) {
			case 5:
				value += 3;
			case 2:
				value += 1;
			case 1:
				value += 1;
		}
		return new Coin(value);
	}
}
