
public class Main{

    public static void main (String[] args){

        ClassX x = new ClassX();
        ClassY y = new ClassY();

        x.add(2, 5);

        System.out.println(x.add(2, 5));
        System.out.println(y.subtract(10, 5));
        System.out.println(x.drives(true));
        System.out.println(y.drives(true));

    }


}
