public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Apple","IPhone 11",6.2,3000,"IOS 14",64);
        SmartWatch myWatch = new SmartWatch("Samsumg","Galaxy Watch 3",1.5,400,true,true);

        System.out.println("------------------");
        System.out.println("SmartPhone: "+"\nMarca: " + myPhone.brand + "\nModelo: " + myPhone.model +
                            "\nTamaño de Pantalla: " + myPhone.screenSize + "\nCapacidad de Bateria: " + myPhone.batteryCapacity +
                            "\nSistema Operativo: " + myPhone.operatingSystem + "\nCapacidad de Alamacenamiento: " + myPhone.storageCapacity);
        System.out.println("------------------");
        System.out.println("SmartWatch: " + "\nMarca: " + myWatch.brand + "\nModelo: " + myWatch.model +
                            "\nTamaño de Pantalla: " + myWatch.screenSize + "\nCapacidad de Bateria: " + myWatch.batteryCapacity +
                            "\nRitmo Cardiaco: " + myWatch.hasHeartRateMonitor + "\nEs Resistente al agua: "+myWatch.isWaterResistant);
        System.out.println("------------------");
    }
}