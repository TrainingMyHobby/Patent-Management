package patentapp.common.model.common;

import java.util.Date;

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
public class BaseModel {

	private Long pk;
	private Date createdDt;
	private Date updatedDt;
	private String status;
	private Long version;

}
