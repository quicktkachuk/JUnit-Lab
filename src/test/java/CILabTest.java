import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1()
    {
//       fail("Not yet implemented");
        this.myString.setString("USA");
        assertTrue(this.myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2()
    {
//        fail("Not yet implemented");
        this.myString.setString("leetcode");
        assertTrue(this.myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3()
    {
//        fail("Not yet implemented");
        this.myString.setString("Hello");
        assertTrue(this.myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4()
    {
//        fail("Not yet implemented");
        this.myString.setString("hEllo");
        assertFalse(this.myString.detectCapitalUse());
    }

}
