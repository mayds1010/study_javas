import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
         * 외교부 국가/지역별 최신 안전소식(코로나 관련) - 중국 url
         * https://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/
         * getCountrySafetyNewsListNew
         * ?serviceKey=EaBOuTaCK4MfqgD%
         * 2BZ27IQTUpjaMTuV3ZlVyUmxkdaOXnCfxmEO4c4vMXmBXNlRsDANlCk7BHYACaI7gB5NJ8dg%3D%
         * 3D
         * &returnType=JSON
         * &numOfRows=10
         * &pageNo=1
         * &cond[country_nm::EQ]=중국 (string을 여러번 데이터 연결을 할때는 StringBuffer)
         */

        StringBuilder urlBuilder = new StringBuilder(
                "http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew"); /* URL */
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=").append(
                "EaBOuTaCK4MfqgD%2BZ27IQTUpjaMTuV3ZlVyUmxkdaOXnCfxmEO4c4vMXmBXNlRsDANlCk7BHYACaI7gB5NJ8dg%3D%3D"); /**
                                                                                                                    * Service
                                                                                                                    * Key
                                                                                                                    */

        urlBuilder.append("&" + URLEncoder.encode("returnType", "UTF-8") + "="
                + URLEncoder.encode("JSON", "UTF-8")); /* XML 또는 JSON */
        urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
                + URLEncoder.encode("10", "UTF-8")); /*
                                                      * 한
                                                      * 페이지
                                                      * 결과
                                                      * 수
                                                      */
        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "="
                + URLEncoder.encode("1", "UTF-8")); /* 페이지 번호 */

        urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]", "UTF-8") + "="
                + URLEncoder.encode("중국", "UTF-8")); /* ISO 2자리코드 */

        URL url; // 주소를 불러옴 샌드(캐스트해야함)
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.addRequestProperty(null, null);
            System.out.println("Response code : " + conn.getResponseCode()); // Response code :200출력

            BufferedReader reader = null; // 정상적일때 읽히는 방식
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) { // 정상
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else { // 비정상
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }

            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) { // readLine():한번 읽고 다음라인을 읽음
                stringBuffer.append(line);
            }
            int i = 1; // 디버깅을 하기 위한 의미없는 코드
            reader.close(); // 자원반납(컴퓨터 자원들은 모두 반납해야함)
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

    }
}
// https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List?serviceKey=EaBOuTaCK4MfqgD%2BZ27IQTUpjaMTuV3ZlVyUmxkdaOXnCfxmEO4c4vMXmBXNlRsDANlCk7BHYACaI7gB5NJ8dg%3D%3D&pageNo=1&numOfRows=10&type=xml