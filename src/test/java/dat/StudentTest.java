package dat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private static Student student,student2,student3;

    @BeforeEach
    void setUp() {
        student=new Student("james",24,2.2);
        student2=new Student("benny",22,3.2);
        student3=new Student("bob",20,4.2);
        student.addFriend(student2);
        student.addFriend(student3);
    }


    @Test
    void getName() {
       // assertThat("james", is(student.getName()));
        assertThat("james", containsString(student.getName()));

    }

    @Test
    void getAge() {
        assertThat(24, equalTo(student.getAge()));
        assertThat(24, is(student.getAge()));
        assertThat(24, lessThanOrEqualTo(student.getAge()));
    }

    @Test
    void getGpa() {
        assertThat(2.2 , is(student.getGpa()));
        assertThat(3.3 , greaterThan(student2.getGpa()));
    }

    @Test
    void getFriends() {
        assertThat(student.getFriends(), hasItem(student2));
        assertThat(student.getFriends(),hasSize(2));

        //test for friends
        assertThat(student.getFriends(),containsInAnyOrder(student2,student3));
    }

    @Test
    void addFriend() {
    }
}