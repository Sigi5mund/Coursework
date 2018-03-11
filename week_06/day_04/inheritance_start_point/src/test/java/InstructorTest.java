import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructorTest {

    Instructor instructor;

    @Before
    public void before(){
        instructor = new Instructor("Ally", "G3", "JavaScript");
    }


    @Test
    public void hasName(){
        assertEquals("Ally", instructor.getName());
    }

    @Test
    public void hasCohort(){
        assertEquals("G3", instructor.getCohort());
    }

    @Test
    public void canChangeName(){
        instructor.setName("Sandy");
        assertEquals("Sandy", instructor.getName());
    }
    @Test
    public void canChangeCohort(){
        instructor.setCohort("E17");
        assertEquals("E17", instructor.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", instructor.talk("Java"));
    }

    @Test
    public void hasModuleTeam(){
        assertEquals("JavaScript", instructor.getModuleTeam());
    }

    @Test
    public void canChangeModuleTeam(){
        instructor.moduleTeam("Java");
        assertEquals("Java", instructor.getModuleTeam());
    }

}

