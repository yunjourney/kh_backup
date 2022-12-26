package 소켓예제1;
import java.net.InetAddress;
import java.net.UnknownHostException;
// IP 주소 확인
// DNS 에 대한 IP 주소 확인

public class SocketEx1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("내컴퓨터 IP주소 : " + local.getHostAddress());
        InetAddress[] ipAddr = InetAddress.getAllByName("www.kakao.com");
        for(InetAddress remote : ipAddr) {
            System.out.println("카카오 IP 주소 : " + remote.getHostAddress());
        }
    }
}