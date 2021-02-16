package patentapp.common.model.masterdata;

import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Table(name = "bus_domain")
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BusDomain extends BaseNameDescModel {

}