public enum Food {
    MEAT(60), WATER(20), MAUS(40), CHEESE(30), FISH(50);
    private int foodVal;

    Food(int foodVal) {
        this.foodVal = foodVal;
    }

    public int getFoodValue() {
        return this.foodVal;
    }
}
