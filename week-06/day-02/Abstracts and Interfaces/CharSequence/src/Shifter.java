public class Shifter implements CharSequence {
    public String Sequence;
    public int Shift;


    public Shifter() {
    }

    public Shifter(String sequence, int shift) {
        Shift = shift;
        Sequence = sequence;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        String result = Sequence.substring(Shift);

        for (int i = 0; i < Shift; i++) {

            result += Sequence.charAt(i);

        } return result.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

}