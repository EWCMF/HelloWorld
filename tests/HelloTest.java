import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testGetHelloNavn() {
        String resultat;
        resultat = Hello.getHelloNavn("Laila");
        assertEquals("Hello Laila!", resultat);

        resultat = Hello.getHelloNavn("2");
        assertEquals("Hello 2!", resultat);

        resultat = Hello.getHelloNavn("€£#@@!");
        assertEquals("Hello €£#@@!!", resultat);

        resultat = Hello.getHelloNavn(" ");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn("   Matias   ");
        assertEquals("Hello Matias!", resultat);
    }
}