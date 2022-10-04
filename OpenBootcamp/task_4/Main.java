public class Main {
    public static void main(String[] args) {


        SmartPhone Iphone = new SmartPhone("Iphone", "SmartPhone", "14X",
                "IOS", "10232919281P", "10232919",
                "white", "FX200N");
        SmartWatch Iwatch = new SmartWatch("Iwatch", "SmartWatch", "101X",
                "IoSWatch", "1023292198N", "123094980",
                "pink", "red", "white");

        System.out.println(Iphone.deviceManufacturer);
        System.out.println(Iphone.deviceModel);
        System.out.println(Iphone.deviceSerialNumber);
        System.out.println(Iphone.deviceName);
        System.out.println(Iphone.deviceType);
        System.out.println(Iphone.deviceVersion);
        System.out.println(Iphone.deviceColor);
        System.out.println(Iphone.cameraType);

        System.out.println(Iwatch.deviceManufacturer);
        System.out.println(Iwatch.deviceModel);
        System.out.println(Iwatch.deviceSerialNumber);
        System.out.println(Iwatch.deviceName);
        System.out.println(Iwatch.deviceType);
        System.out.println(Iwatch.deviceVersion);
        System.out.println(Iwatch.deviceColor);
        System.out.println(Iwatch.BeltSize);
        System.out.println(Iwatch.BeltColor);


    }
}

