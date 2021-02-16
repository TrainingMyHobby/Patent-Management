package patentapp.common.model.common;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BaseNameDescModel extends BaseModel {

	@Column(name = "name", length = 100, nullable = true)
	protected String name;

	@Column(name = "description", length = 200, nullable = true)
	protected String description;

}
