// Base class
class Staff {
    void work() {
        System.out.println("Staff performs general duties.");
    }
}

// Subclass Doctor
class Doctor extends Staff {
    @Override
    void work() {
        System.out.println("Doctor diagnoses patients and prescribes medicines.");
    }
}

// Subclass Nurse
class Nurse extends Staff {
    @Override
    void work() {
        System.out.println("Nurse takes care of patients and assists doctors.");
    }
}

// Subclass Receptionist
class Receptionist extends Staff {
    @Override
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        
        // Creating objects using parent reference (polymorphism)
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        // Calling overridden methods
        s1.work();
        s2.work();
        s3.work();
    }
}
