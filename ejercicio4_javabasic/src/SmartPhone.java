public class SmartPhone extends SmartDevice{
    String operatingSystem;
    int storageCapacity;

    public SmartPhone(){
    }

    public SmartPhone(String brand, String model, double screenSize, int batteryCapacity, String operatingSystem, int storageCapacity) {
        super(brand, model, screenSize, batteryCapacity);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }
}
