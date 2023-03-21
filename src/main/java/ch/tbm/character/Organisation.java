package ch.tbm.character;

import java.rmi.server.UID;

public class Organisation {
    public UID OrganisationID;
    public String OrganisationName;
    public String OrganisationDescription;
    public UID IsPartOf;

    public Organisation(String orgName, String orgDescription, UID isPartOf){
        OrganisationID = new UID();
        OrganisationName = orgName;
        OrganisationDescription = orgDescription;
        IsPartOf = isPartOf;
    }

    public UID getOrganisationID() {
        return OrganisationID;
    }

    public void setOrganisationName(String organisationName) {
        OrganisationName = organisationName;
    }

    public void setIsPartOf(UID isPartOf) {
        IsPartOf = isPartOf;
    }

    public void setOrganisationDescription(String organisationDescription) {
        OrganisationDescription = organisationDescription;
    }
}
