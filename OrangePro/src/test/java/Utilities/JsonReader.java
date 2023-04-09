package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	

	public String add_json_file_for_cred(String Filename, String Key,String creds) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser = new JSONParser();
		String file="C:\\Users\\SOUMIPRA\\Desktop\\Cg\\OrangePro\\src\\main\\resources\\"+Filename+".json";
		Object obj = (Object) parser.parse(new FileReader(file));
		JSONObject jsonObj = (JSONObject) obj;
		System.out.println(obj.toString());
		
		JSONObject credObj = (JSONObject) jsonObj.get(Key);
		String data = (String) credObj.get(creds);
//		String password = (String) credObj.get("password");
		return data;
		
	}


}
