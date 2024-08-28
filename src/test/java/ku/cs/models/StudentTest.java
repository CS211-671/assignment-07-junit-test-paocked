package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("6650", "Doe", 40.50);


    @Test
    public void TestStudentChangeNameShouldBeVerified(){
        student.changeName("JANE");
        assertEquals("JANE", student.getName());
    }

    @Test
    public void TestStudentAddScore(){
        double added_score = 40.50 + 25;
        student.addScore(25);
        assertEquals(added_score, student.getScore());
    }


   @Test
    public void TestStudentIsId(){

       assertTrue(student.isId("6650"));
       assertFalse(student.isId("6651"));

   }

}