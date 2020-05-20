import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student evey;
    Student severalGrades;

    @Before
    public void init(){
        evey = new Student(1, "Evelyn A");
        evey.addGrade(100);
        severalGrades = new Student(2, "Amber V");
        severalGrades.addGrade(95);
        severalGrades.addGrade(85);
        severalGrades.addGrade(95);
    }

    @Test
    public void ifStudentCanBeCreated(){
        assertEquals("Evelyn A", evey.getName());
        assertEquals(1, evey.getId());
    }

    @Test
    public void testIfGradesWillBeAdded(){
        assertSame(100, evey.getGrades().get(0));
    }

    @Test
    public void isAverageGradeWorking(){
        assertEquals(100.0, evey.getGradeAverage(), 0);
        assertEquals(91.66666666666667, severalGrades.getGradeAverage(), 0);
    }
}
