package patentapp.common.utils;

import java.io.File;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AppJsonUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppJsonUtil.class);

	public static <T> List<T> convertModelJsonDataToModelObj(String jsonFilePath) {
		LOGGER.info("Enter jsonFilePath " + jsonFilePath);

		ObjectMapper mapper = new ObjectMapper();
		List<T> modelObjs = null;
		try {
			modelObjs = mapper.readValue(new File(jsonFilePath), new TypeReference<List<T>>() {
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.debug("Exit jsonFilePath " + jsonFilePath);
		return modelObjs;
	}

}
