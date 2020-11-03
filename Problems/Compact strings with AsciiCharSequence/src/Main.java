import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class AsciiCharSequence implements java.lang.CharSequence/* extends/implements */ {

    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char) array[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, i, i1));
       /* byte[] subArray = new byte[i1 - i];
        int counter = 0;
        for (i = i; i < i1; i++) {
            subArray[counter] = array[i];
        }
         CharSequence output = new AsciiCharSequence(subArray);
        return output;*/
    }

    @Override
    public String toString() {
        return new String(array, StandardCharsets.UTF_8);
    }
    // implementation
}