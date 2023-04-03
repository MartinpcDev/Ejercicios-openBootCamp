public class SmartWatch extends SmartDevice{
    boolean hasHeartRateMonitor;
    boolean isWaterResistant;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double screenSize, int batteryCapacity, boolean hasHeartRateMonitor, boolean isWaterResistant) {
        super(brand, model, screenSize, batteryCapacity);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
        this.isWaterResistant = isWaterResistant;
    }
}
