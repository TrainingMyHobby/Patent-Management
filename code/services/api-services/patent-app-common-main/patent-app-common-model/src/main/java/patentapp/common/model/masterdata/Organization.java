package patentapp.common.model.masterdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Entity
@Table(name = "organization")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class Organization extends BaseNameDescModel {

	@Column(name = "hierarchy", nullable = true)
	private Integer hierarchy;

	@Column(name = "parent_pk", nullable = true)
	private Long parentPk;

}
