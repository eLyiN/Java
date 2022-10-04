/**
 * Children class SmartPhone is inherited class that implements SmartPhone attributes.
 */

public class SmartPhone extends SmartDevice {

     String cameraType;

    public SmartPhone(){

    }

    public SmartPhone(String deviceName, String deviceType, String deviceModel, String deviceVersion, String deviceSerialNumber, String deviceManufacturer, String deviceColor, String cameraType) {
        super(deviceName, deviceType, deviceModel, deviceVersion, deviceSerialNumber, deviceManufacturer, deviceColor);
        this.cameraType = cameraType;
    }
}

