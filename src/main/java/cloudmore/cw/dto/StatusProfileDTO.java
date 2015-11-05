package cloudmore.cw.dto;

import org.jose4j.jwt.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper=true)
public class StatusProfileDTO extends BaseDTO{
	private String status;
	private boolean isBlocked;
	private boolean isLimited;
	private NumericDate validFrom; // UNIX time

	public StatusProfileDTO(String nid){
		super(nid);
	}
}
