package patentapp.common.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true, includeFieldNames = true, doNotUseGetters = true)
public class AppEventReq extends AppCtxData {

	private String mopdelType;
	private String eventType;
	private Long pk;
	private Map<String, Object> eventPayLoad;

	public void addPayLoadData(String key, Object val) {
		if (this.eventPayLoad == null) {
			this.eventPayLoad = new HashMap<String, Object>();
		}
		this.eventPayLoad.put(key, val);
	}

}
