package exception.ex4;

import exception.ex4.exception.NetworkClientExceptionV4;

public class NetworkServiceV4 {

    public void sendMessage(String data) throws NetworkClientExceptionV4 {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disConnect();
        }
    }
}
