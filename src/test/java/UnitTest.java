import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.*;
class UnitTest {
    @Test
    public void test_Unit() {
        // Unit has a constructor
        // but we should not be able to create a Unit
        System.out.println("Testing Unit Class");
        try {
            Class<Unit> clazz = Unit.class;
            Constructor<Unit> ctor = clazz.getDeclaredConstructor();
            try {
                ctor.newInstance();
                fail("Should not be able to create an instance of Unit");
            } catch (Exception e) {
            // should happen
            }
            System.out.println("Testing Unit Constructor passes");
            // takeDamage should not be implemented in the Unit class
            Method m = clazz.getDeclaredMethod("takeDamage", double.class);
            assertEquals(void.class, m.getReturnType());
            assertTrue(Modifier.isAbstract(m.getModifiers()));
            // canRecruit should not be implemented in the Unit class
            m = clazz.getDeclaredMethod("canRecruit", new Class[]{});
            assertEquals(boolean.class, m.getReturnType());
            assertTrue(Modifier.isAbstract(m.getModifiers()));
        } catch (Exception e) {
            // not supposed to happen
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
    @Test
    public void test_TomJerryUnit() {
        System.out.println("Testing Tom & Jerry Unit Class");
        Unit tj = new TomJerryUnit('a', "Test Name", 10.0, 5.0, 5.0,
                10.0, 5, 10, 15, 3, 5, false,
                true, true, "Blue");
        // check inheritance
        assertTrue(tj instanceof Unit);
        try {
            // takeDamage should be implemented
            Method m = TomJerryUnit.class.getDeclaredMethod("takeDamage",
                    double.class);
            assertEquals(void.class, m.getReturnType());
            assertTrue(Modifier.isAbstract(m.getModifiers()));
        } catch (Exception e) {
            System.out.println("in here");
            // not supposed to happen
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
    @Test
    public void test_BartSimpsonUnit() {
        System.out.println("Testing Bart Simpson Unit Class");
        BartSimpsonUnit bart = new BartSimpsonUnit(/*replace with arguments*/);
        assertTrue(bart instanceof Unit);
        try {
            // canRecruit should be implemented
            Method m = BartSimpsonUnit.class.getDeclaredMethod("canRecruit", new Class[]{});
            assertEquals(boolean.class, m.getReturnType());
            assertTrue(Modifier.isAbstract(m.getModifiers()));
        } catch (Exception e) {
            // not supposed to happen
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}