package patentapp.common.api.services.util;

import java.util.Arrays;
import java.util.stream.Stream;

public class AppInitiUtil {

	public static String[] buildApiServicesAddlProfiles(String[] inputProfiles) {

		String[] finalProfiles = { "api-default-db" };

		String[] both = Stream.concat(Arrays.stream(inputProfiles), Arrays.stream(finalProfiles))
				.toArray(String[]::new);

		return both;
	}

}
