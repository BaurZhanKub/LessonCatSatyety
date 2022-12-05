public enum Food {
    MEAT(6), WATER(1), MAUS(4), CHEESE(3), FISH(5);
    private int foodVal;

    Food(int foodVal) {
        this.foodVal = foodVal;
    }

    public int getFoodValue() {
        return this.foodVal;
    }
}
