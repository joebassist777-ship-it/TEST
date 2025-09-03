package Kakaotalk1;

// Message 클래스: 메시지 내용을 담는 객체
public class Message {
String text; 
// 메시지의 실제 텍스트를 저장하는 변수
    public Message(String text) {this.text = text;}
    // 생성자: 메시지를 만들 때 텍스트를 받아 저장
}


=======================

package Kakaotalk1;
// Me 클래스: 메시지를 보내는 사람 (팀원)
public class Me {
    String name; // 팀원의 이름

    public Me(String name) {this.name = name;}
        // 생성자: 이름을 받아 저장
        // 내가 타이핑 하여 메세지를 입력.
    public Message send(Message m) {return new Message(name + "에게 보내는 메시지 :  " + m.text);}
        // 각 메시지 앞에 이름을 붙여서 반환
        // 확인 버튼으로 메시지를 보내는 메서드
}


===========================


package Kakaotalk1;
public class Team {
    //메세지를 보는입장
    public static void main(String[] args) {
        Message m = new Message(" 안녕하세요!");
        // 메세지 생성

        // 메세지 받는 팀원 생성
        Me[] teamMembers = {
            new Me("현황"),
            new Me("준기"),
            new Me("금쌤"),
            new Me("논쨩")
            new Me("미즈키")
        };

        // 각 팀원에게 메시지를 보내고 출력
        for (Me member : teamMembers) {   // ( : ) 의 뜻은 향상된 for 오른쪽 멤버에서 왼쪽으로 호출
                                        // 즉 Me에있는 멤버에서 메세지를 보낼 멤버
            Message result = member.send(m); // 보낸 메시지를 리절트에 저장후, 메세지를 멤버들에게 보낸다.   
            System.out.println(result.text); // 결과 출력
        }
    }
}






=========================================
    












  


