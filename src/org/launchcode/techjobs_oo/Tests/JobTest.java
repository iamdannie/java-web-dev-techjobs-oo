package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

public class JobTest {
    Job houseKeeper;
    Job groundsMen;
    @Before
    public void createJobs() {
        houseKeeper = new Job();
        groundsMen = new Job();

    }
    @Test
    public void testSettingJobId() {
        assertNotEquals(houseKeeper, groundsMen);
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobSearchField = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester",jobSearchField.getName());
        assertEquals("ACME",jobSearchField.getEmployer().getValue());
        assertEquals("Desert",jobSearchField.getLocation().getValue());
        assertEquals("Quality control",jobSearchField.getPositionType().getValue());
        assertEquals("Persistence",jobSearchField.getCoreCompetency().getValue());
    }
    @Test
    public void testJobForEquality() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job.equals(job1));
    }
    @Test
    public void toToString() {
        Job testStringJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String output =
                "\n"+"ID:" + testStringJob.getId()+ "\n"+
                "NAME:" + testStringJob.getName() +"\n" +
                "EMPLOYER:" + testStringJob.getEmployer()+ "\n"+
                "LOCATION:" + testStringJob.getLocation()+"\n"+
                "POSITION TYPE:" +testStringJob.getPositionType().getValue()+"\n"+
                "CORE COMPETENCY:" +testStringJob.getCoreCompetency()+ "\n";

            assertEquals(output, testStringJob.toString());

    }

    @Test
    public void TestToStringAndNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        char first = job.toString().charAt(0);
        char last = job.toString().charAt(job.toString().length()-1);
        assertTrue(first==last);
        assertEquals(first,last);
    }

}
