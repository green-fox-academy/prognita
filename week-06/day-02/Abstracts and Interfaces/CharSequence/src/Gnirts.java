import java.util.Set;

public class Gnirts implements CharSequence{
    public String Sequence;

    public Gnirts() {
    }

    public Gnirts(String sequence) {
        Sequence = sequence;
    }

    public String getSequence() {
        return Sequence;
    }

    public void setSequence(String sequence) {
        Sequence = sequence;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return Sequence.charAt(Sequence.length() - index-1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}
