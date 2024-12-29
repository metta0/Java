package exception.ex3.exception;


import exception.ex3.NetworkClientV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) throws NetworkClientExceptionV3 {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectionExceptionV3 e) {
            System.out.println("주소: " + e.getAddress() + " 메세지" + e.getMessage());
        } catch (NetworkClientExceptionV3 e){
            System.out.println("[네트워크 오류] 메세지 = " + e.getMessage());
        } catch (Exception e){
            System.out.println("[알 수 없는 오류] 메세지 = " + e.getMessage());
        } finally {
            client.disConnect();
        }
    }
}
