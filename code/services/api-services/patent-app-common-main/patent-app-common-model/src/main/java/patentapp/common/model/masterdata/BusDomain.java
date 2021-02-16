package patentapp.common.model.masterdata;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Entity
@Table(name = "bus_domain")
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BusDomain extends BaseNameDescModel {

}