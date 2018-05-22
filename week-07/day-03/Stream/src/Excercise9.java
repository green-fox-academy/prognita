public class Excercise9 {
    public static void main(String[] args) {
        char[] cchar = {'a', 'n', 'i', 't', 'a'};
        new String(cchar).chars().collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append)
                .toString();
        System.out.println(cchar);
    }
}
