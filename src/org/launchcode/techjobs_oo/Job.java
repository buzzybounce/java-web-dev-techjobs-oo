package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job () {

        id = nextId;
        nextId++;

    }

    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {

        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }


    @Override
    public String toString () {

        String format = "\n";

        if ((getName() == null && getEmployer() == null && getLocation() == null && getPositionType() == null && getCoreCompetency() == null) || (getName().isBlank() && getEmployer().toString().isBlank() && getLocation().toString().isBlank() && getPositionType().toString().isBlank() && getCoreCompetency().toString().isBlank())) {

            format += "OOPS! This job does not seem to exist.";

        }

        else {

            format += "ID: " + getId() + '\n';

            // Name

            if (getName().isBlank()) {

                format += "Name: Data not available\n";

            }

            else {

                format += "Name: " + getName() + '\n';

            }

            // Employer

            if (getEmployer().toString().isBlank()) {

                format += "Employer: Data not available\n";

            }

            else {

                format += "Employer: " + getEmployer().toString() + '\n';

            }

            // Location

            if (getLocation().toString().isBlank()) {

                format += "Location: Data not available\n";

            }

            else {

                format += "Location: " + getLocation().toString() + '\n';

            }

            // Position Type

            if (getPositionType().toString().isBlank()) {

                format += "Position Type: Data not available\n";

            }

            else {

                format += "Position Type: " + getPositionType().toString() + '\n';

            }

            // Core Competency

            if (getCoreCompetency().toString().isBlank()) {

                format += "Core Competency: Data not available";

            }

            else {

                format += "Core Competency: " + getCoreCompetency().toString();

            }

        }

        return format + '\n';

    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}
