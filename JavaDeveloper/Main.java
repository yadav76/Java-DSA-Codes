import java.util.ArrayList;

class Main{
    public static void main(String[] args) {
        System.err.println("Hello World!");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(23);

        System.out.println(list);
        System.out.println(list.get(-1));
    }
}