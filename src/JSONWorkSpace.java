
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;


public class JSONWorkSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String sjo = "{\"RFID_TAG1\":{\"duplicate_serial_no\":\"MeritSystems\",\"matched_tag\":\"pch_rfid_tag2\"},\"RFID_TAG2\":{\"duplicate_serial_no\":\"MeritSystems\",\"matched_tag\":\"pch_rfid_tag2\"}}";
		try {
			JSONObject jsonObject = new JSONObject(sjo); 
			
			jsonObject.put("RFID_TAG1","empty");
			System.out.println(jsonObject);

			
			

		}catch (JSONException e) {
            e.printStackTrace();
        }
		
		/*
		String jsonstring = "{ \"child\": { \"something\": \"value\", \"something2\": \"value\" } }";
		JSONObject resobj = new JSONObject(jsonstring);
		Iterator<?> keys = resobj.keys().iterator();
		while(keys.hasNext() ) {
		    String key = (String)keys.next();
		    if ( resobj.get(key) instanceof JSONObjecst ) {
		        JSONObject xx = new JSONObject(resobj.get(key).toString());
		        System.out.println("res1",xx.getString("something"));
		        Log.d();
		        Log.d("res2",xx.getString("something2"));
		    }
		} */
		
		
	}

}
