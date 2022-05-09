package src;

public class TreasureChest {
	public final int GOLD_DOUBLOON_WEIGHT;
	public final int GEM_STONE_WEIGHT;
	
	private TreasureChest(int GOLD_DOUBLOON_WEIGHT, int GEM_STONE_WEIGHT) {
		if (GOLD_DOUBLOON_WEIGHT < 0 || GEM_STONE_WEIGHT < 0) {
			throw new IllegalArgumentException("Weight cannot be less than 0");
		}
		this.GOLD_DOUBLOON_WEIGHT = GOLD_DOUBLOON_WEIGHT;
		this.GEM_STONE_WEIGHT = GEM_STONE_WEIGHT;
	}
	
	public static TreasureChest createNewTreasureChestWithGoldDoubloon(int GOLD_DOUBLOON_WEIGHT) {
		return new TreasureChest(GOLD_DOUBLOON_WEIGHT, 0);
		}
	
	public static TreasureChest createNewTreasureChestWithGemStone(int GEM_STONE_WEIGHT) {
		return new TreasureChest(0, GEM_STONE_WEIGHT);
	}
	
	public static TreasureChest createNewTreasureChestWithGoldDoubloonAndGemStone(int GOLD_DOUBLOON_WEIGHT, int GEM_STONE_WEIGHT) {
		return new TreasureChest(GOLD_DOUBLOON_WEIGHT, GEM_STONE_WEIGHT);
	}
}
