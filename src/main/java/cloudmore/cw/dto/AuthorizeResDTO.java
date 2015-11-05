package cloudmore.cw.dto;

import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class AuthorizeResDTO extends AuthorizeReqDTO{
	private long expire;
	private List<String> ep;
	private String token;

	public AuthorizeResDTO(String nid){
		super(nid);
	}
}
