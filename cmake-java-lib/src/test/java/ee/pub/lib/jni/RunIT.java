package ee.pub.lib.jni;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Imre Tabur <imre.tabur@eesti.ee>
 */
public class RunIT {

    /**
     * Run application as test.
     */
    @Test
    public void run() {
        String[] args = {"One", "Two"};
        Run.main(args);
    }
}
