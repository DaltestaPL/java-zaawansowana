package zadania.lambda;

public class Hospital  {

    public static void main(String[] args) {
        Doctor doctor = new Internist();
        doctor.treat();


//        Doctor ophthalmologist = new Doctor() {
//            @Override
//            public void treat() {
//                System.out.println("Ophthalmologist is treating");
//            }
//        };
        Doctor ophthalmologist = () -> System.out.println("Ophthalmologist is treating");
        ophthalmologist.treat();

        HospitalDoctor hospitalDoctor = new Internist();
        hospitalDoctor.hospitalTreat("patient");

//        HospitalDoctor hospitalDoctor1 = new HospitalDoctor() {
//            @Override
//            public void hospitalTreat(String s) {
//                System.out.println("Lambda doctor is treating: " + s);
//            }
//        };
        HospitalDoctor hospitalDoctor1 = (String s) -> System.out.println("Lambda doctor is treating: " + s);
        hospitalDoctor1.hospitalTreat("patient");
    }
}
