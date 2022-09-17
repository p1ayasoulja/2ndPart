public class Syrin {
    public static void main(String[] args) {
        String g = new String("Hello");
        char jj[] = {'a', 'b', 'c'};
        String ne = new String(jj, 1, 2);
        System.out.println(ne);

        String hg = new String(g);
        System.out.println("abc".length());
        String plus = g + ne + hg;
        System.out.println(plus);
        char ch = plus.charAt(4);
        System.out.println(ch);
        char mass[] = new char[10];
        plus.getChars(2, 5, mass, 0);
        System.out.println(mass);
        char y[] = new char[10];
        y = plus.toCharArray();
        System.out.println(y);
    }
}
