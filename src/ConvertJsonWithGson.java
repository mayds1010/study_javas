import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
    public static void main(String[] args) {
        // 문자열 Json -> Map으로 변경
        Gson gson = new Gson();
        String jsonStr = "{id:1, name:yojulab}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);

        // Map -> 문자열 Json으로 변경
        String mapStr = gson.toJson(jsonMap);

        // 문자열 Json -> object(bean, model, vo)로 변경
        String jsonStrBean = "{firstName:yo, secoundName:jo,handleName:lab}";
        MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);
        int i = 0;
    }
}
