package patentapp.common.dto;

import java.util.List;

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
public class AppCrudResponse<T> extends AppResponse {

	private Long pk;

	private T model;
	private List<T> models;
	private Iterable<T> modelsItr;

}
