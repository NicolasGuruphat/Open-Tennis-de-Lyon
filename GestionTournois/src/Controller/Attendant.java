/***********************************************************************
 * Module:  Participant.java
 * Author:  p2007545
 * Purpose: Defines the Class Participant
 ***********************************************************************/

package Controller;

import java.sql.Date;

public abstract class Attendant {
    protected int id;
    protected String lastName, firstName, nationality;
    protected Date birthDate;
    
    public Attendant(int id, String lastName, String firstName, 
            Date birthDate, String nationality) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.nationality = nationality;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Attendant{" + "id=" + id + 
                ", lastName=" + lastName + 
                ", firstName=" + firstName + 
                ", nationality=" + nationality + 
                ", birthDate=" + birthDate + '}';
    }
    
    
}