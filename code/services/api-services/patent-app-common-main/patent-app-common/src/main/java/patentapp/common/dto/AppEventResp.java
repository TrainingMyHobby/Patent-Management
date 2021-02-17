package patentapp.common.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true, includeFieldNames = true, doNotUseGetters = true)
public class AppEventResp extends AppCtxData {

	private String eventType;
	private String responseResult;
	private Long pk;
	private Map<String, Object> eventResult;

}
