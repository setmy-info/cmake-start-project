package ee.pub.lib.jni;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Imre Tabur <imre.tabur@eesti.ee>
 */
public class Run {

    public static final Logger log = LogManager.getLogger(Run.class.getName());

    static {
        try {
            /*
            String libpath = System.getProperty("java.library.path");
            libpath = libpath + ":/xxx/cmake-start-project/cmake-java-lib/target/classes";
            System.setProperty("java.library.path", libpath);
             */
            System.loadLibrary("exampleshared");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
        }
    }

    public static void main(String[] args) {
        Example ex = new Example();
        String retval = ex.getHelloString("Beavis");
        log.debug("Debug Hello world! Native: " + retval);
        System.out.println("Hello World! Native: " + retval);
    }
}
