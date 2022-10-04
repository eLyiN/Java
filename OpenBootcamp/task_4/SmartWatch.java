/**
 * Children class SmartWatch is inherited class that implements SmartWatch attributes.
 */

public class SmartWatch extends SmartDevice {


    String BeltColor;
    String BeltSize;

    public SmartWatch() {

    }

    public SmartWatch(String deviceName, String deviceType, String deviceModel, String deviceVersion, String deviceSerialNumber, String deviceManufacturer, String deviceColor, String beltColor, String beltSize) {
        super(deviceName, deviceType, deviceModel, deviceVersion, deviceSerialNumber, deviceManufacturer, deviceColor);
        BeltColor = beltColor;
        BeltSize = beltSize;
    }
}

