package cloudmore.cw.dto;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=true)
public class MinProfileDTO extends BaseDTO{
	public String loginName;
	public String displayName;

	public MinProfileDTO(String nid){
		super(nid);
	}
}
