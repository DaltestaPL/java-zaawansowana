package zadania.lambda;

public class Internist implements Doctor, HospitalDoctor {

    @Override
    public void treat() {
        System.out.println("Internist is treating");
    }


    public void testMethod() {
        System.out.println("Method not from interface");
    }

    @Override
    public void hospitalTreat(String s) {
        System.out.println("Hospital treating: " + s);
    }
}
