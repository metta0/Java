package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public void connect(){
        System.out.println(address + " 서버 연결 성공");
    }

    public String send(String data) {
        System.out.println("data = " + data);
        return "success";
    }

    public void disConnect(){
        System.out.println(address + " 서버 연결 해제");
    }
}
