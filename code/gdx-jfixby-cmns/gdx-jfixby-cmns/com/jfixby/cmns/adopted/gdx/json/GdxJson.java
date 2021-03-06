package com.jfixby.cmns.adopted.gdx.json;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonWriter.OutputType;
import com.jfixby.cmns.api.json.JsonComponent;
import com.jfixby.cmns.api.log.L;

public class GdxJson implements JsonComponent {

	@Override
	public String serializeToString(Object object) {
		Json json = new Json();
		json.setOutputType(OutputType.json);
		String data = json.toJson(object);
		return data;
	}

	@Override
	public <T> T deserializeFromString(Class<T> type, String input_data) {
		Json json = new Json();
		json.setOutputType(OutputType.json);
		try {
			T object = json.fromJson(type, input_data);
			return object;
		} catch (Exception e) {
			L.d(e);
			L.e("input string", input_data);
			e.printStackTrace();
			return null;
		}
	}

}
