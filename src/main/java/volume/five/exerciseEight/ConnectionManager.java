package volume.five.exerciseEight;

class Connection {
    private Connection() {
    }

    static Connection getInstanceOfConnection() {
        return new Connection();
    }
}

public class ConnectionManager {
    private Connection[] conArray = new Connection[5];

    ConnectionManager() {
        for (int i = 0; i < conArray.length; i++) {
            conArray[i] = Connection.getInstanceOfConnection();
        }
    }

    public Connection getConnection() {
        for (int i = 0; i < conArray.length; i++) {
            if (conArray[i] != null) {
                Connection current = conArray[i];
                conArray[i] = null;
                return current;

            }
        }
        return null;
    }
}

class ConClient {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        for (int i = 0; i < 10; i++) {
            System.out.println(connectionManager.getConnection());

        }
    }
}
