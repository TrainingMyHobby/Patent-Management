package patentapp.common.model.ops;

import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class DataMigration extends BaseNameDescModel {

	private String scriptName;
	private String modelName;
	private String scriptVersion;

}
