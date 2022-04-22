public enum Seasons {
    SUMMER(35), WINTER(-20), FALL(12), SPRING(15);

    private int temperature;

    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
