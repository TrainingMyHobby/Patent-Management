package patentapp.common.model.masterdata;

import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class Organization extends BaseNameDescModel {

	private Integer hierarchy;
	private Long parentPk;

}
