package zadania.zadanie5;

public class SdaHashSetMain {
    public static void main(String[] args) {
        var sdaHashSet = new SDAHashSet<String>();
        sdaHashSet.add("Java");
        sdaHashSet.add("Java");
        System.out.println(sdaHashSet.size());
    }
}
