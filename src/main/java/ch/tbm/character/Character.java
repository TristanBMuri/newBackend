package ch.tbm.character;

import java.rmi.server.UID;
import java.util.Date;

public class Character {
    private UID CharacterID;
    private String Name;
    private String Family_Name;
    private UID PlaceOfBirth;
    private Date DateOfBirth;
    private UID[] Parents;
    private CharacterVersion[] CharacterVersions;

    public Character(UID characterID, String name, String familyName, UID placeOfBirth,
                     Date dateOfBirth, UID[] parents,
                     CharacterVersion[] characterVersions) {
        CharacterID = characterID;
        Name = name;
        Family_Name = familyName;
        PlaceOfBirth = placeOfBirth;
        DateOfBirth = dateOfBirth;
        Parents = parents;
        CharacterVersions = characterVersions;
    }

    public UID getCharacterID() {
        return CharacterID;
    }

    public CharacterVersion[] getCharacterVersions() {
        return CharacterVersions;
    }

    public void setCharacterVersions(CharacterVersion[] characterVersions) {
        CharacterVersions = characterVersions;
    }

    public UID[] getParents() {
        return Parents;
    }

    public void setParents(UID[] parents) {
        Parents = parents;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public UID getPlaceOfBirth() {
        return PlaceOfBirth;
    }

    public void setPlaceOfBirth(UID placeOfBirth) {
        PlaceOfBirth = placeOfBirth;
    }

    public String getFamily_Name() {
        return Family_Name;
    }

    public void setFamily_Name(String family_Name) {
        Family_Name = family_Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
