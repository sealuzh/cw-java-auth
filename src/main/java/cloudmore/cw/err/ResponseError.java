package cloudmore.cw.err;

import org.springframework.http.*;
import lombok.*;

@Data
public class ResponseError{
	private long timestamp;
	private int status;
	private String error;
	private String exception;
	private String message;
	private String path;

	public ResponseError(Exception ex, HttpStatus status, String path){
		setTimestamp(System.currentTimeMillis());
		setException(ex.getClass().getName());
		setStatus(status.value());
		setError(status.getReasonPhrase());
		setPath(path);
		setMessage(ex.getMessage());
	}
}
