package zadania.zadanie34;

public class ExtendedThread extends Thread {

    private String string;

    public ExtendedThread(String s) {
        this.string = s;
    }

    @Override
    public void run() {
        System.out.println(string);
    }
}
