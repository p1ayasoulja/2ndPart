public class Getpck {
    public static void main(String[] args) {
        Package pgs[];
        pgs=Package.getPackages();
        System.out.println("Packages!");
        for(int i=0;i<pgs.length;i++){
            System.out.println(pgs[i].getName()+" "+pgs[i].getImplementationTitle()+" "+pgs[i].getImplementationVendor()+
                    " "+pgs[i].getImplementationVersion());
        }
    }
}
