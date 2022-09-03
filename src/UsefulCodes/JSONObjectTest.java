package UsefulCodes;

import org.json.JSONObject;

public class JSONObjectTest {

    public static String code = "200";
    public static String message = "Success";

    public static void main(String args[]){

        String input = "{\"main\":{\"status\":\"test\",\"message\":\"how to read and append a JSON Object\"}}";

        JSONObject obj = new JSONObject(input);
        JSONObject result = new JSONObject();
        result.put("respCode",code);
        result.put("respMessage",message);

        System.out.println("Result Object created: "+result.toString());
        obj.put("result",result);
        System.out.println("Final Object created: "+obj.toString());
    }
}
