package me.labate.utt.lo02.core;

import me.labate.utt.lo02.core.Game.Season;
/**
 * Ingredients Card of the game
 * @author Alabate
 *
 */
public class IngredientCard extends Card {

	public enum IngredientMethod { GIANT, FERTILIZER, LEPRECHAUN };
	/**
	 * convert int to IngredientMethod
	 * @param integer
	 * @return Ingredient method from int
	 */
	public static IngredientMethod intToIngredientMethod(int integer){
		IngredientMethod method;
		switch(integer){
		case 0:
			method = IngredientMethod.GIANT;
			break;
		case 1:
			method = IngredientMethod.FERTILIZER;
			break;
		default:
			method = IngredientMethod.LEPRECHAUN;
			break;
		}
		return method;
	}

	/**
	 * List of cards that contains methods that contains value for each season
	 */
	private static final int[][][] deck = {
		{{1, 1, 1, 1}, {2, 0, 1, 1}, {2, 0, 2, 0}},
		{{2, 0, 1, 1}, {1, 3, 0, 0}, {0, 1, 2, 1}},
		{{0, 0, 4, 0}, {0, 2, 2, 0}, {0, 0, 1, 3}},
		{{1, 3, 1, 0}, {1, 2, 1, 1}, {0, 1, 4, 0}},
		{{2, 1, 1, 1}, {1, 0, 2, 2}, {3, 0, 0, 2}},
		{{1, 2, 2, 0}, {1, 1, 2, 1}, {2, 0, 1, 2}},
		{{2, 1, 1, 2}, {1, 1, 1, 3}, {2, 0, 2, 2}},
		{{0, 3, 0, 3}, {2, 1, 3, 0}, {1, 1, 3, 1}},
		{{1, 2, 1, 2}, {1, 0, 1, 4}, {2, 4, 0, 0}},
		{{1, 3, 1, 2}, {2, 1, 2, 2}, {0, 0, 3, 4}},
		{{2, 2, 0, 3}, {1, 1, 4, 1}, {1, 2, 1, 3}},
		{{2, 2, 3, 1}, {2, 3, 0, 3}, {1, 1, 3, 3}},
		{{2, 2, 3, 1}, {2, 3, 0, 3}, {1, 1, 3, 3}},
		{{2, 2, 2, 2}, {0, 4, 4, 0}, {1, 3, 2, 2}},
		{{3, 1, 3, 1}, {1, 4, 2, 1}, {2, 4, 1, 1}},
		{{4, 1, 1, 1}, {1, 2, 1, 3}, {1, 2, 2, 2}},
		{{2, 3, 2, 0}, {0, 4, 3, 0}, {2, 1, 1, 3}},
		{{2, 2, 3, 0}, {1, 1, 1, 4}, {2, 0, 3, 2}},
		{{3, 1, 4, 1}, {2, 1, 3, 3}, {2, 3, 2, 2}},
		{{2, 4, 1, 2}, {2, 2, 2, 3}, {1, 4, 3, 1}},
		{{3, 3, 3, 0}, {1, 3, 3, 2}, {2, 3, 1, 3}},
		{{1, 2, 2, 1}, {1, 2, 3, 0}, {0, 2, 2, 2}},
		{{4, 0, 1, 1}, {1, 1, 3, 1}, {0, 0, 3, 3}},
		{{2, 0, 1, 3}, {0, 3, 0, 3}, {1, 2, 2, 1}}}; 


	/**
	 * Constructor setting the ID
	 * @param ID
	 */
	public IngredientCard(int ID)
	{
		super(ID);
	}
	/**
	 * Get the card value for the given method on the given season
	 * @param method The selected method
	 * @param season The selected season
	 * @return the value or -1 if the method is not on the card
	 */
	public int getValue(IngredientMethod methodID, Season season) {
		return getValue(deck, methodID.ordinal(), season);
	}
	public static int deckLength(){
		return deck.length;
	}
}