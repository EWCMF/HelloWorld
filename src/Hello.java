public class Hello {
    public static void helloWorld() {
        System.out.println("Hello world");
    }

    public static void helloNavn(String navn) {
        System.out.println("Hello " + navn);
    }

    public static String getHelloNavn(String navn) {

        if (navn.trim().equals(""))
            return "Hello!";
        else
            return "Hello " + navn.trim() + "!";
    }
}
