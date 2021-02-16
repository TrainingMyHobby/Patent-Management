package patentapp.common.model.common;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = true, callSuper = false, doNotUseGetters = true)
@MappedSuperclass
public class BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pk;

	@Column(name = "created_dt", nullable = true)
	private Date createdDt;

	@Column(name = "updated_dt", nullable = true)
	private Date updatedDt;

	@Column(name = "status", length = 25, nullable = true)
	private String status;

	@Version
	private Long version;

	public static <T> List<T> convertModelJsonDataToModelObj(String jsonFilePath, T modelClass) {

		ObjectMapper mapper = new ObjectMapper();
		List<T> modelObjs = null;
		try {
			modelObjs = mapper.readValue(new File(jsonFilePath), new TypeReference<List<T>>() {
			});

		} catch (Exception e) {
			e.printStackTrace();
		}

		return modelObjs;
	}

}
