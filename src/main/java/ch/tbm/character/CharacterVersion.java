package ch.tbm.character;

import java.rmi.server.UID;

public class CharacterVersion {
    public UID CharacterVersionID;
    public UID CharacterID;
    private Integer VersionID;
    private String CharacterDescription;
    private UID CurrentOrganisation;
    private UID CurrentLocation;

    public CharacterVersion(UID characterID, Integer versionID, String characterDescription, UID currentOrganisation){
        CharacterVersionID = new UID();
        CharacterID = characterID;
        setVersionID(versionID);
        setCharacterDescription(characterDescription);
        setCurrentOrganisation(currentOrganisation);
    }

    public UID getCharacterID() {
        return CharacterID;
    }

    public void setCharacterDescription(String characterDescription) {
        CharacterDescription = characterDescription;
    }

    public void setVersionID(Integer versionID) {
        VersionID = versionID;
    }

    public void setCurrentOrganisation(UID currentOrganisation) {
        CurrentOrganisation = currentOrganisation;
    }

    public Integer getVersionID() {
        return VersionID;
    }

    public String getCharacterDescription() {
        return CharacterDescription;
    }

    public UID getCurrentOrganisation() {
        return CurrentOrganisation;
    }

    public UID getCurrentLocation() {
        return CurrentLocation;
    }

    public void setCurrentLocation(UID currentLocation) {
        CurrentLocation = currentLocation;
    }
}
