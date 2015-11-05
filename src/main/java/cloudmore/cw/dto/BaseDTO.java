package cloudmore.cw.dto;

import lombok.*;
import java.time.*;
import com.fasterxml.jackson.annotation.*;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class BaseDTO{
	private String id;
	private long timestamp; // UNIX time

	public BaseDTO(){
		setTimestamp(Instant.now().getEpochSecond());
	}

	public BaseDTO(String nid){
		this();
		setId(nid);
	}
}
