package labCoin;

public class CoinApp {

	public static void main(String[] args) {
		Coin[] allCoins = Coin.values();

		for (Coin el : allCoins) {
			System.out.println(el.toString());
		}
	}

}
