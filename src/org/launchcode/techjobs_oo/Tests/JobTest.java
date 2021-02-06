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
                "ID:" + testStringJob.getId()+ "\n"+
                "NAME:" + testStringJob.getName() +"\n" +
                "EMPLOYER:" + testStringJob.getEmployer()+ "\n"+
                "LOCATION:" + testStringJob.getLocation()+"\n"+
                "POSITION TYPE:" +testStringJob.getPositionType().getValue()+"\n"+
                "CORE COMPETENCY:" +testStringJob.getCoreCompetency();

            assertEquals(output, testStringJob.toString());



    }
}
