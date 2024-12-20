package methods;

//Native methods are implemented in a language other than Java (e.g., C). This is just an example declaration as their implementation is not done in Java.
public class NativeExample {
    public native void nativeMethod(); // Implemented in C or C++

    static {
        System.loadLibrary("nativeLibrary"); // Load the native library
    }
}
