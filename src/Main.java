public class Main {
    public static void main(String[] args) {
        Gatto gatto = new Gatto();
        Cane cane = new Cane();
        System.out.println(gatto);
        System.out.println(cane);
        Animale[] animali = {cane, gatto};
        Zoo zoo = new Zoo(animali);
        System.out.println(zoo);
        System.out.println(zoo.contieneGatto());
    }
}