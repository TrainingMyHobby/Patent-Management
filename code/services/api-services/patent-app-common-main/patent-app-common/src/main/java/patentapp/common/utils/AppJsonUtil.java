package patentapp.common.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AppJsonUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppJsonUtil.class);

	public static <T> List<T> convertModelJsonDataToModelObj(String jsonFilePath, Class<T> classObj) {
		LOGGER.info("Enter jsonFilePath " + jsonFilePath);

		List<T> modelObjs = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			TypeFactory t = TypeFactory.defaultInstance();
			modelObjs = mapper.readValue(new File(jsonFilePath), t.constructCollectionType(ArrayList.class, classObj));

//			ObjectReader objectReader = objectMapper.reader().forType(new TypeReference<List<T>>() {
//			});
			// modelObjs = objectReader.readValue(new File(jsonFilePath));

//			modelObjs = objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<T>>() {
//			});

//			modelObjs = mapper.readValue(new File(jsonFilePath), new TypeReference<List<T>>() {
//			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.debug("Exit jsonFilePath " + jsonFilePath);
		return modelObjs;
	}

}
