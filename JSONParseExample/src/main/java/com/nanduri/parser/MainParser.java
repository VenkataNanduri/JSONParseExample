package com.nanduri.parser;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.nanduri.jsonmodel.Member;

public class MainParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String inputJson="{ \"email\":\"abc@123.com\", \"did_you_mean\":\"abc@me.com\", \"user\":\"abc\", \"domain\":\"123.com\", \"format_valid\":true, \"mx_found\":false, \"smtp_check\":false, \"catch_all\":null, \"role\":false, \"disposable\":false, \"free\":true, \"score\":0.16}";
		String inputJson="{ \"email\":\"abc@123.com\", \"did_you_mean\":\"abc@me.com\", \"user\":\"abc\", \"domain\":\"123.com\", \"format_valid\":true, \"mx_found\":false, \"smtp_check\":false, \"catch_all\":null, \"role\":false, \"disposable\":false, \"free\":true, \"score\":0.16, \"employee\":{\"id\":23,\"name\":\"abc\"}}";
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Member mem = mapper.readValue(inputJson, Member.class);
			System.out.println("Score:"+mem.getScore());
			System.out.println("Employee ID:"+mem.getEmployee().getId());
		}
		catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
