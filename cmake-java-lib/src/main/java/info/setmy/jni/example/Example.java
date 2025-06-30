package info.setmy.jni.example;

/**
 * Example class.
 *
 * @author Imre Tabur <imre.tabur@mail.ee>
 */
public class Example {

    private String someValue;

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }

    public native String getHelloString(String in);

    public String fromJNI(String in) {
        if (in == null) {
            return "Chocolate";
        }
        String tmp = "Cocoa " + in;
        return tmp;
    }
}
