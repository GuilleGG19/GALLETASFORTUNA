import java.util.ArrayList;

public class Galleta implements frase {
    public Galleta(){

    }

    @Override
    public Object frases() {
        ArrayList frap= new ArrayList();
        frap.add("Viva Cristo Rey");
        frap.add("Los porros son malos");
        frap.add("Vas a perder 100 quetzales");
        frap.add("Te va a dar diarrea");
        frap.add("Te van a invitar a una michelada");

        int num1= (int)(Math.random()*5);
        return frap.get(num1);

    }
}
