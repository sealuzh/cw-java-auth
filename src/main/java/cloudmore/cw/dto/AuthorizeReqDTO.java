package cloudmore.cw.dto;

import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class AuthorizeReqDTO extends BaseDTO{
	private String scope;
	private String grantType;
	private List<String> ep;

	public AuthorizeReqDTO(String nid){
		super(nid);
	}
}
