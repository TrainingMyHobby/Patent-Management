package patentapp.common.model.casemgmt;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
import patentapp.common.model.common.BaseNameDescModel;

@Entity
@Table(name = "case_audio_text_summary")
@ToString(includeFieldNames = true, callSuper = true, doNotUseGetters = true)
public class CaseAudioTextSummary extends BaseNameDescModel {

}