package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    Job jobOne, jobTwo;

    @Before
    public void createJobObject () {

        jobOne = new Job();
        jobTwo = new Job();

    }

    // Test to see if two jobs created does not share the same ID

    @Test
    public void emptyTest() {

        assertFalse(jobOne.getId() == jobTwo.getId());

    }

    // Test to see if constructor successfully set all fields


    @Test
    public void testJobConstructorSetsAllFields () {

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", jobThree.getName());
        assertEquals("ACME", jobThree.getEmployer().getValue());
        assertEquals("Desert", jobThree.getLocation().getValue());
        assertEquals("Quality control", jobThree.getPositionType().getValue());
        assertEquals("Persistence", jobThree.getCoreCompetency().getValue());

        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);

    }

    // Test to see that two identical objects are not equal

    @Test
    public void testJobsForEquality () {

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(jobThree.equals(jobFour));

    }

    // Test to see if format starts and end with a blank line

    @Test
    public void testJobsToStringBlankLines () {

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n', jobThree.toString().charAt(0));
        assertEquals('\n', jobThree.toString().charAt(jobThree.toString().length()-1));

    }

    // Test to see toString of Job class

    @Test
    public void testJobsToStringLabel () {

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String format = "\nID: " + jobThree.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n";

        assertEquals(format, jobThree.toString());

    }

    // Test to see toString of Job class with blank fields

    @Test
    public void testJobsToStringLabelWithEmptyField () {

        Job jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));

        String format = "\nID: " + jobThree.getId() + "\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available\n";

        assertEquals(format, jobThree.toString());

    }

    // Test to see toString of Job class returning a specific string
    // for object created only ID initialized

    @Test
    public void testJobsToStringLabelOnlyIdField () {

        Job jobThree = new Job();

        String format = "\nOOPS! This job does not seem to exist.\n";

        assertEquals(format, jobThree.toString());

    }

    @Test
    public void testJobsToStringLabelOnlyIdFieldWithBlankOtherFields () {

        Job jobThree = new Job("",new Employer(""),new Location(""),new PositionType(""), new CoreCompetency(""));

        String format = "\nOOPS! This job does not seem to exist.\n";

        assertEquals(format, jobThree.toString());

    }

}
