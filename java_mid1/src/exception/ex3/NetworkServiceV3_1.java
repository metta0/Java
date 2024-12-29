package exception.ex3;


import exception.ex3.exception.ConnectionExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV3 {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectionExceptionV3 e) {
            System.out.println("주소: " + e.getAddress() + " 메세지" + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("오류 데이터: " + e.getSendData() + " 메세지: " + e.getMessage());
        } finally {
            client.disConnect();
        }
    }
}
