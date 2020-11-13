/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.md.project.personConfiguration;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mdjukanovic
 */
public class PersonConfiguration {
    
    String firstname;
    String lastname;
    String gender;
    Date birthday;
    String marriage;
    boolean vegeterian;

    public PersonConfiguration(String firstname, String lastname, String gender, Date birthday, String marriage, boolean vegeterian) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthday = birthday;
        this.marriage = marriage;
        this.vegeterian = vegeterian;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getMarriage() {
        return marriage;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    @Override
    public String toString() {
        return "PersonConfiguration{" + "firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + ", birthday=" + birthday + ", marriage=" + marriage + ", vegeterian=" + vegeterian + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.firstname);
        hash = 71 * hash + Objects.hashCode(this.lastname);
        hash = 71 * hash + Objects.hashCode(this.gender);
        hash = 71 * hash + Objects.hashCode(this.birthday);
        hash = 71 * hash + Objects.hashCode(this.marriage);
        hash = 71 * hash + (this.vegeterian ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonConfiguration other = (PersonConfiguration) obj;
        if (this.vegeterian != other.vegeterian) {
            return false;
        }
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        if (!Objects.equals(this.lastname, other.lastname)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.marriage, other.marriage)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
