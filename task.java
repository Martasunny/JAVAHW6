//Разработать программу, имитирующую поведение коллекции HashSet.
//В программе содать метод add добавляющий элемент, и метод позволяющий выводить 
//эллементы коллекции в консоль. Формат данных Integer.
import java.until.HashMap

public class hw6 {

    private static HashMap<Integer, Object> hMap = new Hashmap<>();

    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        add(3);
        add(1);
        add(3);
        add(3);
        add(7);
        add(10);
        add(6);
        System.out.println(hMap.keySet());    
    }

    public static void add(Integer number) {
        hMap.put(number, OBJ);
    }
}
