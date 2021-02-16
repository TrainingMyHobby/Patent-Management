package patentapp.common.model.common;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.ToString;

@MappedSuperclass
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BaseNameDescModel extends BaseModel {

	@Column(name = "name", length = 100, nullable = true)
	private String name;

	@Column(name = "description", length = 200, nullable = true)
	private String description;

}
