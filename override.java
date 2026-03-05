class Vehicle{
    void run(){
        System.out.println("running");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("also running");
    }
}

public class override {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.run();
    }
}
