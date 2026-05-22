//
// Created by ich on 22 May 2026
//

package Helper;

import Main.BlackJack;

import java.awt.*;

public class Helper {

	public static void print(Object input) {System.out.print(input);}

	public static void println(Object input) {System.out.println(input);}

	// TODO: implement logger
	public static void log(Object input) {
	}

	public static final String WINDOW_TITLE = "BlackJack";
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 1080;

	// ratio: 1.452
	public static final int CARD_WIDTH = 250;
	public static final int CARD_HEIGHT = 363;

	public static final Color TABLE_BG_CASINO_GREEN = new Color(0, 102, 51, 255);
	public static final Color TABLE_BG_DEEP_EMERALD = new Color(0, 66, 37, 255);
	public static final Color TABLE_BG_FOREST_GREEN = new Color(34, 85, 34, 255);
	public static final Color TABLE_BG_OLIVE_GREEN = new Color(85, 107, 47, 255);
	public static final Color TABLE_BG_NAVY_BLUE = new Color(0, 35, 102, 255);
	public static final Color TABLE_BG_ROYAL_BLUE = new Color(25, 75, 170, 255);
	public static final Color TABLE_BG_TEAL = new Color(0, 105, 105, 255);
	public static final Color TABLE_BG_DEEP_RED = new Color(128, 0, 32, 255);
	public static final Color TABLE_BG_BURGUNDY = new Color(90, 0, 35, 255);
	public static final Color TABLE_BG_PURPLE = new Color(75, 35, 120, 255);
	public static final Color TABLE_BG_CHARCOAL_GRAY = new Color(45, 45, 45, 255);
	public static final Color TABLE_BG_MIDNIGHT_BLACK = Color.black;

	public enum TableBackground {
		CASINO_GREEN("Casino Green", TABLE_BG_CASINO_GREEN),
		DEEP_EMERALD("Deep Emerald", TABLE_BG_DEEP_EMERALD),
		FOREST_GREEN("Forest Green", TABLE_BG_FOREST_GREEN),
		OLIVE_GREEN("Olive Green", TABLE_BG_OLIVE_GREEN),
		NAVY_BLUE("Navy Blue", TABLE_BG_NAVY_BLUE),
		ROYAL_BLUE("Royal Blue", TABLE_BG_ROYAL_BLUE),
		TEAL("Teal", TABLE_BG_TEAL),
		DEEP_RED("Deep Red", TABLE_BG_DEEP_RED),
		BURGUNDY("Burgundy", TABLE_BG_BURGUNDY),
		PURPLE("Purple", TABLE_BG_PURPLE),
		CHARCOAL_GRAY("Charcoal Gray", TABLE_BG_CHARCOAL_GRAY),
		MIDNIGHT_BLACK("Midnight Black", TABLE_BG_MIDNIGHT_BLACK);

		final String label;
		final Color color;

		TableBackground(String label, Color color) {
			this.label = label;
			this.color = color;
		}
	}

	public String label(String label) {
		return label;
	};

	public String cardName(Rank rank, Suit suit) {
		return rank.symbol + suit.symbol;
	}

	// TODO: implement GameState
	public enum GameState {
		ROUND_OVER(0),
		PLAYER_TURN(1),
		DEALER_TURN(2);

		public final int GameValue;

		GameState(int GameValue) {
			this.GameValue = GameValue;
		}
	}

	private enum Rank {
		ACE("A", 11),
		TWO("2", 2),
		THREE("3", 3),
		FOUR("4", 4),
		FIVE("5", 5),
		SIX("6", 6),
		SEVEN("7", 7),
		EIGHT("8", 8),
		NINE("9", 9),
		TEN("10", 10),
		JACK("J", 10),
		QUEEN("Q", 10),
		KING("K", 10);

		final String symbol;
		final int value;

		Rank(String symbol, int value) {
			this.symbol = symbol;
			this.value = value;
		}
	}

	public enum Suit {
		CLUBS("C"),
		DIAMONDS("D"),
		HEARTS("H"),
		SPADES("S");

		final String symbol;

		Suit(String symbol) {
			this.symbol = symbol;
		}
	}

	public static class Card {
		Rank rank;
		Suit suit;

		Card(Rank rank, Suit suit) {
			this.rank = rank;
			this.suit = suit;
		}
	}
}
