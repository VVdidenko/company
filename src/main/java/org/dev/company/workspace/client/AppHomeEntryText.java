package org.dev.company.workspace.client;

import java.io.Serializable;

/**
 * Created by admin on 07.01.2016.
 */
public class AppHomeEntryText implements Serializable {
    private String firstName ;
    private String lastName ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
