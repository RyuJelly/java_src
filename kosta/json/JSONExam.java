package kosta.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONExam {
	
	// JSONObject => jsonCode(문자열)
	// {"name" : "홍길동", "age" : 20, "address" : "가산동"}
	public JSONObject createJson() {
		JSONObject obj = new JSONObject();
		obj.put("name", "홍길동");
		obj.put("age", 20);
		obj.put("adress", "가산동");
		
		return obj;
	}
	
	public JSONObject createJson2() {
		JSONObject obj = new JSONObject();
		obj.put("name", "박길동");
		obj.put("age", 30);
		obj.put("adress", "강남");
		
		return obj;
	}
	

	public static void main(String[] args) {
		JSONExam e = new JSONExam();
		
		// 자바객체 => JSON 문자열
		JSONObject obj = e.createJson();
		JSONObject obj2 = e.createJson2();
//		System.out.println(obj.toJSONString());
		
		JSONArray ja = new JSONArray();
		ja.add(obj);
		ja.add(obj2);
		
		// JSONArray => json 문자열
//		System.out.println(ja.toJSONString());
		
		
		// List<Member> => json문자열
		List<Member> list = new ArrayList<Member>();
		list.add(new Member("홍길동", 20, "가산동"));
		list.add(new Member("콩길동", 22, "강남"));
		

//		System.out.println(net.sf.json.JSONArray.fromObject(list).toString()); // list를 json문자열로
		
		// JSON문자열 => 자바객체
		// [{"address":"가산동","age":20,"name":"홍길동"},{"address":"강남","age":22,"name":"콩길동"}]
		
		String jsonCode = net.sf.json.JSONArray.fromObject(list).toString();
		
		JSONParser parser = new JSONParser();
		Object re = null;
		
		try {
			re = parser.parse(jsonCode);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		if (re instanceof JSONArray) {
			JSONArray array = (JSONArray)re;
			Iterator iter = array.iterator();
			List<Member> list2 = new ArrayList<Member>();
			while(iter.hasNext()) {
				JSONObject jo = (JSONObject) iter.next();
				String name = (String) jo.get("name");
				String address = (String) jo.get("address");
				int age = ((Long) jo.get("age")).intValue();
				
				list2.add(new Member(name, age, address));
			}
			System.out.println(list2);
		}
	}

}
