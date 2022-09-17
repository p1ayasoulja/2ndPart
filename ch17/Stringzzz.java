public class Stringzzz {
    public static void main(String[] args) {
        String g1 = "Hello";
        String g2 = "og og HELLO";
        if (g1.equalsIgnoreCase(g2)) System.out.println("good");
        System.out.println(g1.regionMatches(true, 0, g2, 6, 3));
        System.out.println(g1.startsWith("el", 1));
        String mass[] = {"Zero", "alpha", "Demo", "demo", "zero", "1p"};
        String demo;
        for (int j = 0; j < mass.length; j++) {
            for (int i = j + 1; i < mass.length; i++) {
                if (mass[i].compareTo(mass[j]) < 0) {
                    demo = mass[i];
                    mass[i] = mass[j];
                    mass[j] = demo;
                }
            }
            System.out.println(mass[j]);
        }
        String dem = "I love sneakers, its not bout chocolate!";
        /*dem.indexOf('k');
        dem.lastIndexOf('c');
        dem.indexOf("not");
        dem.lastIndexOf("its");*/
        String neww = dem.substring(5, 10);
        System.out.println(neww);

        String sort0 = "This is demo";
        String sort = sort0.concat(" ??");
        String sear = "demo";
        String change = "final";
        String result;
        int i;
        do {

            System.out.println(sort);
            i = sort.indexOf(sear);
            if (i != -1) {
                result = sort.substring(0, i);
                result = result + change;
                result = result + sort.substring(i + sear.length());

                sort = result.replace('?','!');


            }

        } while (i != -1);

        String r1="      Hello, Dear World      ".trim();
        System.out.println(r1);
        StringBuffer gh=new StringBuffer("Wusap bro");
        gh.ensureCapacity(100);
        System.out.println(gh.length());
        System.out.println(gh.capacity());
        gh.setCharAt(2,'z');
        gh.setLength(5);
        System.out.println(gh);
        char m[]=new char[10];
        gh.getChars(1,3,m,0);
        System.out.println(m);





    }
}

