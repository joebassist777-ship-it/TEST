package ChoInfo;

// 영화 정보를 저장하는 클래스
public class MovieInfo {
    // 영화 제목 (예: "레옹")
    private String title;

    // 상영 시간 (단위: 분)
    private int time;

    // 영화 가격 (단위: 원)
    private int price;

    // 생성자: 객체를 만들 때 영화 정보를 입력받아 초기화
    public MovieInfo(String title, int time, int price) {
        this.title = title;
        this.time = time;
        this.price = price;
    }

    // Getter 메서드: 외부에서 영화 제목을 가져올 수 있게 함
    public String getTitle() {
        return title;
    }

    // Getter 메서드: 외부에서 상영 시간을 가져올 수 있게 함
    public int getTime() {
        return time;
    }

    // Getter 메서드: 외부에서 가격을 가져올 수 있게 함
    public int getPrice() {
        return price;
    }

    // toString() 메서드 오버라이딩:
    // 객체를 출력할 때 보기 좋게 영화 정보를 문자열로 반환
    @Override
    public String toString() {
        return "🎬 영화 제목: " + title + "\n" +
               "⏱️ 상영 시간: " + time + "분\n" +
               "💰 가격: " + price + "원";
    }
}

------------------------------------------------------


	package ChoInfo;

public class maine {
    public static void main(String[] args) {
        // MovieInfo 객체를 저장할 배열 생성 (총 4개의 영화 정보 저장 가능)
        MovieInfo[] movies = new MovieInfo[4];

        // 각 배열 요소에 영화 정보 객체를 생성해서 저장
        movies[0] = new MovieInfo("28 년후", 130, 12000);
        movies[1] = new MovieInfo("귀멸의 칼날", 180, 15000);
        movies[2] = new MovieInfo("레옹", 105, 10000);
        movies[3] = new MovieInfo("봇치 더 록 극장판", 120, 10000);

        // 배열을 순회하면서 각 영화 정보를 출력
        for (MovieInfo m : movies) {
            // toString() 메서드가 자동 호출되어 보기 좋은 형식으로 출력됨
            System.out.println(m);
            System.out.println("--------------------"); // 구분선 출력
        }
    }
}




	
