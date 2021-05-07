package src.net.dv8tion;

import java.io.File;
import java.util.ArrayList;

import org.json.JSONObject;

public class Prueba {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\David\\Tests\\Imgur\\src\\resources\\assets\\icon.png");
		System.out.println(Uploader.upload(f));
		JSONObject myJson = new JSONObject(Uploader.upload(f));
		JSONObject myJson2 = new JSONObject(myJson.get("data").toString());
		System.out.println(myJson2.get("link"));

	}
}
 