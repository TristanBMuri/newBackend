package ch.tbm.character;

import java.rmi.server.UID;
import java.util.Date;

public class Location {
    private UID LocationID;
    private UID IsInLocation;
    private String LocationName;
    private String LocationDescription;
    private String PopulationSize;
    private UID PreviousLocation;
    private Date StartYearExistence;

    public Location(UID locationID, UID isInLocation, String locationName, String locationDescription, String populationSize, UID previousLocation, Date startYearExistence) {
        LocationID = new UID();
        IsInLocation = isInLocation;
        LocationName = locationName;
        LocationDescription = locationDescription;
        PopulationSize = populationSize;
        PreviousLocation = previousLocation;
        StartYearExistence = startYearExistence;
    }

    public UID getLocationID() {
        return LocationID;
    }

    public void setIsInLocation(UID isInLocation) {
        IsInLocation = isInLocation;
    }

    public void setLocationDescription(String locationDescription) {
        LocationDescription = locationDescription;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public void setPopulationSize(String populationSize) {
        PopulationSize = populationSize;
    }

    public void setPreviousLocation(UID previousLocation) {
        PreviousLocation = previousLocation;
    }

    public void setStartYearExistence(Date startYearExistence) {
        StartYearExistence = startYearExistence;
    }
}
