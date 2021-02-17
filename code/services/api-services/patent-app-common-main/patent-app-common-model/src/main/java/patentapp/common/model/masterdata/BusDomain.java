package patentapp.common.model.masterdata;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Table(name = "bus_domain")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BusDomain extends BaseNameDescModel {

	@Column(name = "organization_pk")
	private Long organizationPk;

	@Column(name = "parent_pk")
	private Long parentPk;

}