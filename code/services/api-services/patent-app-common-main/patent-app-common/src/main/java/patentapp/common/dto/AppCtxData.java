package patentapp.common.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = false, doNotUseGetters = true)
public class AppCtxData {

	private Map<String, Object> ctxData;

	public void addCtxData(String key, Object val) {
		this.ctxData.put(key, val);
	}

	public boolean containsKey(String key) {
		return this.ctxData.containsKey(key);
	}

	public Object getValue(String key) {
		return this.ctxData.get(key);
	}

	public String getValueAsStr(String key) {
		return (String) this.ctxData.get(key);
	}

	public String getInitialDataJsonFilePath(String modelClassName) {
		return this.getValueAsStr("initial_data_json_file_path_" + modelClassName);
	}

	public void setInitialDataJsonFilePath(String modelClassName, String value) {
		this.ctxData.put("initial_data_json_file_path_" + modelClassName, value);
	}

}
