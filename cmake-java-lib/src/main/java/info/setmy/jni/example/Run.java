package info.setmy.jni.example;

/**
 *
 * @author Imre Tabur <imre.tabur@mail.ee>
 */
public class Run {

    static {
        try {
            System.loadLibrary("exampleshared");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n");
        }
    }

    public static void main(String[] args) {
        Example ex = new Example();
        String retval = ex.getHelloString("Beavis");
        System.out.println("Hello World! Native: " + retval);
    }
}
