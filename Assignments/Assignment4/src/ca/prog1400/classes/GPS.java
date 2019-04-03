package ca.prog1400.classes;

import ca.prog1400.common.LogToConsole;

import static ca.prog1400.ui.MainPanel.getGpsArrayList;

public class GPS implements ILoggable{
    private String latitude;
    private String longitude;

    public GPS(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void gpsLogToFile() {
    }

    // output gps data to console for debugging
    @Override
    public void gpsLogToConsole() {
        LogToConsole.LogToConsole(getGpsArrayList());
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
