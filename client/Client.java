import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private Client() {}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9401);
            Calculator stub = (Calculator) registry.lookup("Calculator");

            double resultAdd = stub.add(5, 3);
            double resultSubtract = stub.subtract(8, 4);
            double resultMultiply = stub.multiply(2, 6);
            double resultDivide = stub.divide(10, 2);

            System.out.println("Addition: " + resultAdd);
            System.out.println("Subtraction: " + resultSubtract);
            System.out.println("Multiplication: " + resultMultiply);
            System.out.println("Division: " + resultDivide);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
