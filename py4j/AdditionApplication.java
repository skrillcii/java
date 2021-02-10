import py4j.GatewayServer;

public class AdditionApplication {

    public int addition(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        AdditionApplication app = new AdditionApplication();
        // app is now the gateway.entry_point
        GatewayServer server = new GatewayServer(app, 25333);
        server.start();
        System.out.println("Gateway Server Started");
    }
}
