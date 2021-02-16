package patentapp.common.model.masterdata;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Entity
@Table(name = "bus_proc_resource")
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BusProcResource extends BaseNameDescModel {

}
