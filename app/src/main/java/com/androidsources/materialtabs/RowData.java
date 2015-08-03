package com.androidsources.materialtabs;

/**
 * Created by Gowtham Chandrasekar on 31-07-2015.
 */
public class RowData {

    private int profilePic;
    private String name;
    private String callDetails;


    public RowData(String name, String callDetails, int profilePic) {
        this.name = name;
        this.profilePic = profilePic;
        this.callDetails = callDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCallDetails() {
        return callDetails;
    }

    public void setCallDetails(String callDetails) {
        this.callDetails = callDetails;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }
}

