import architecture.EventSystem;
import architecture.OOPStyle;
import architecture.PipeFilter;
import architecture.ProceduralStyle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @Test
    public void testProceduralStyle() {
        String result = ProceduralStyle.process("resources/input_files/sample.txt");
        assertNotNull(result);
    }

    @Test
    public void testOOPStyle() {
        String result = OOPStyle.process("resources/input_files/sample.txt");
        assertNotNull(result);
    }

    @Test
    public void testEventSystem() {
        String result = EventSystem.process("resources/input_files/sample.txt");
        assertNotNull(result);
    }

    @Test
    public void testPipeFilter() {
        String result = PipeFilter.process("resources/input_files/sample.txt");
        assertNotNull(result);
    }
}

