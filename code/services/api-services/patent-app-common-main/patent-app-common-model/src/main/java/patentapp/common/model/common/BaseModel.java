package patentapp.common.model.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(includeFieldNames = true, callSuper = false, doNotUseGetters = true)
@MappedSuperclass
public class BaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pk;

	@Column(name = "created_dt", nullable = true)
	private Date createdDt;

	@Column(name = "updated_dt", nullable = true)
	private Date updatedDt;

	@Column(name = "status", length = 25, nullable = true)
	private String status;

	@Version
	private Long version;

}
