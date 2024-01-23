import java.util.Arrays;

public class Zoo {
    Animale[] animali;

    public Zoo(Animale[] animali) {
        this.animali = animali;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animali=" + Arrays.toString(animali) +
                '}';
    }

    public boolean contieneGatto() {
        for(Animale animale1 : animali) {
            if(animale1 instanceof Gatto) {
                return true;
            }
        }
        return false;
    }
}
