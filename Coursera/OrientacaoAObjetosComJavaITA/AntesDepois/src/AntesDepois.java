import org.junit.*;

public class AntesDepois {
    
    @Before
    public void antes(){
        System.out.println("@Before");
    }

    @After
    public void despois(){
        System.out.println("@After");
    }

    @BeforeClass
    public static void antesClasse() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void depoisClasse() {
        System.out.println("@AfterClass");
    }

    @Test
    public void test1() {
        System.out.println("Teste 1");
    }

    @Test
    public void test2() {
        System.out.println("Teste 2");
    }

    @Test
    public void test3() {
        System.out.println("Teste 3");
    }
    
}
