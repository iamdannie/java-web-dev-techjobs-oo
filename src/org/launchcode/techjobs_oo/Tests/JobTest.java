package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.Job;

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
//    @Test
//    public void testJobConstructorSetsAllFields() {
//        Job jobSearchField = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        assertEquals("Product tester",jobSearchField.getName());
//        assertEquals("ACME",jobSearchField.getValue());
//        assertEquals("Desert",jobSearchField.getValue);
//        assertEquals("Quality control",jobSearchField.getValue);
//        assertEquals("Persistence",jobSearchField.getValue);
//    }
}
