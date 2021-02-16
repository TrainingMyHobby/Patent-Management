package patentapp.common.model.masterdata;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Entity
@Table(name = "bus_proc")
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class BusProc extends BaseNameDescModel {
}