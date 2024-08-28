package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list =  new StudentList();;

    @Test
    public void TestAddStudentList(){

        list.addNewStudent("6610450901", "James", 25.5);

        Student found_student = list.findStudentById("6610450901");
        assertEquals("6610450901", found_student.getId());
        assertEquals("James", found_student.getName());
        assertEquals(25.5, found_student.getScore());

    }

    @Test
    public void TestFindStudentById(){

        list.addNewStudent("6610450901", "James", 25.5);
        Student found_student = list.findStudentById("6610450901");
        assertEquals("6610450901", found_student.getId());

    }

    @Test
    public void TestGiveScoreToId(){
        list.addNewStudent("6610450901", "James", 25.5);
        list.giveScoreToId("6610450901", 20.5);

        double expected_score = 25.5 + 20.5;
        Student found_student = list.findStudentById("6610450901");
        assertEquals(expected_score, found_student.getScore());

    }

    @Test
    public void TestViewGradeOfId(){
        list.addNewStudent("6610450901", "James", 25.5);
        String expected_Grade = list.viewGradeOfId("6610450901");

        assertEquals("F", expected_Grade);
    }






}