/**
 *  Clase padre
 */

public class SmartDevice {
    // 1. Atr

    protected String deviceName;
    protected String deviceType;
    protected String deviceModel;
   protected String deviceVersion;
    protected String deviceSerialNumber;
    protected String deviceManufacturer;
    protected String deviceColor;


    // 2. constructores

    public SmartDevice() {
    }

    public SmartDevice(String deviceName, String deviceType, String deviceModel, String deviceVersion, String deviceSerialNumber, String deviceManufacturer, String deviceColor) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceModel = deviceModel;
        this.deviceVersion = deviceVersion;
        this.deviceSerialNumber = deviceSerialNumber;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceColor = deviceColor;
    }

    // 3. metodos (comportamiento)
}

