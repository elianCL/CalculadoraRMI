import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Calculator {

    public Server() {}

    @Override
    public double add(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public double subtract(double x, double y) throws RemoteException {
        return x - y;
    }

    @Override
    public double multiply(double x, double y) throws RemoteException {
        return x * y;
    }

    @Override
    public double divide(double x, double y) throws RemoteException {
        if (y != 0) {
            return x / y;
        } else {
            throw new RemoteException("Cannot divide by zero");
        }
    }

    public static void main(String args[]) {
        try {
            Server obj = new Server();
            Calculator stub = (Calculator) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9401);
            registry.bind("Calculator", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
