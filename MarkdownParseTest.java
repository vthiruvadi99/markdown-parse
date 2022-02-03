import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }
    /* 
    @Test
    public void testMarkdownParse() throws IOException{
        Path filename = Path.of("test-file.md");
        String contents = Files.readString(filename);

        assertEquals(List.of("https://something.com","some-page.html"), MarkdownParse.getLinks(contents));
    }

    @Test
    public void testMDParse() throws IOException{
        Path filename = Path.of("test2.md");
        String contents = Files.readString(filename);

        assertEquals(List.of("google.com"), MarkdownParse.getLinks(contents));
    }
    
    @Test
    public void testMDParser() throws IOException{
        
        Path filename = Path.of("test3.md");
        String contents = Files.readString(filename);

        assertEquals(List.of(), MarkdownParse.getLinks(contents));
    }
    */
}
