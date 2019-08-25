package analyzer;

/**
 * 类：JsonAnalyzer
 * 作用：解析Json数据
 *
 */
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class JsonAnalyzer {

    private JSONObject jsonObject=null;
    private JSONArray jsonArray=null;
    private String words="";

    public String setJsonAnalyzer(String json){

        jsonObject=JSONObject.fromObject(json);
        jsonArray=jsonObject.getJSONArray("words_result");
        for (int i = 0; i < jsonArray.size(); i++) {
            jsonObject=jsonArray.getJSONObject(i);
//            System.out.println(jsonObject);
//            System.out.print(jsonObject.getString("words"));
            words=words+jsonObject.getString("words")+"\t";
            if(i%3==0 && i!=0){
                words=words+"\n\r";
//                System.out.println("");

            }

        }
        System.out.println(words);
        return words;

    }
}
