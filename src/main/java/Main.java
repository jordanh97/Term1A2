import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main implements Item{

    public int returnValue1(){
        return value1;
    }

    public static void main(String[] args)

    {

        ArrayList<String> stringArrayList = new ArrayList<String>();

        stringArrayList.add("Yes");

        HashMap<Integer, String> stringHashMap = new HashMap<Integer, String>();

        stringHashMap.put(value1, "ok");

        Set<String> stringSet = new LinkedHashSet<String>();

        stringSet.add("No");

        System.out.println("Is this fun? " + stringArrayList.get(0) + "! Great is that " + stringHashMap.get(value1) + "? "
                + " " + stringSet.toString());

    }

}
