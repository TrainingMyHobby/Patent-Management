package patentapp.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppConfigUtil {

	@Autowired
	private Environment env;

	public String getProperty(String key) {
		return this.env.getProperty(key);
	}

	public String getProperty(String key, String defaultVal) {
		return this.env.getProperty(key, defaultVal);
	}

	public String getModelInitialDataJSsonFilePath(String modelName) {
		return this.getProperty("initial_data_json_file_path_" + modelName, null);
	}

}
