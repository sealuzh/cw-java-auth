package cloudmore.cw.dto;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=true)
public class ProfileDTO extends MinProfileDTO{
	public String title;
	public String firstName;
	public String lastName;
	public String email;
	public String phone;
	public String mobile;
	public String company;

	public ProfileDTO(String nid){
		super(nid);
	}
}
