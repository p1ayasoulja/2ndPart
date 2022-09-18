public class Memory {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Runtime r= Runtime.getRuntime();
        long mem1,mem2;
        mem1=r.freeMemory();
        System.out.println("fULL MEM = "+r.totalMemory()+" free memory = "+mem1);
        System.out.println("Lets go!");

        Integer rt[]=new Integer[1000];
        System.out.println("fULL MEM = "+r.totalMemory()+" free memory = "+r.freeMemory());
        for(int i=0;i<1000;i++){
            rt[i]=i;
        }
        mem2=r.freeMemory();
        System.out.println("Used memory is "+(mem1-mem2));
        for(int i=0;i<1000;i++){
            rt[i]=null;
        }
        long mem3;
        r.gc();
        mem3=r.freeMemory();
        System.out.println("New free memory is "+mem3);
        long finish=System.currentTimeMillis();
        System.out.println("we lost = "+(finish-start));
    }
}
