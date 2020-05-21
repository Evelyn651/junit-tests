import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortsTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student evey = new Student(1, "Evelyn A");
        evey.addGrade(100);

        Student ber = new Student(2, "Amber V");
        ber.addGrade(100);
        ber.addGrade(100);
        ber.addGrade(100);

        cohortWithOne.addStudent(evey);
        cohortWithMany.addStudent(evey);
        cohortWithMany.addStudent(ber);
    }

    @Test
    public void testIfAddsStudentsAndGetsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());

    }

    @Test
    public void testIfAverageIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }
}
