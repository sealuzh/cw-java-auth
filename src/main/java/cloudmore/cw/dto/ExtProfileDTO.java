package cloudmore.cw.dto;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=true)
public class ExtProfileDTO extends ProfileDTO{
	public String SkypeName;
	public String TwitterName;
	public String LinkedInProfile;
	public String FacebookProfile;

	public ExtProfileDTO(String nid){
		super(nid);
	}
}
