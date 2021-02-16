package patentapp.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class AppRequest extends AppCtxData {

}
