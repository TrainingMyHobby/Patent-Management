package patentapp.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class AppResponse extends AppCtxData {

	private String result;

}
