package exception.ex0;

import nested.nested.ex1.Network;

public class NetworkServiceV0 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disConnect();

    }
}
