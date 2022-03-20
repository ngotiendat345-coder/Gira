package cybersoft.javabackend.java16gira.common.util;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

public class ResponseHelper {
	public static ResponseEntity<Object> getResponse(Object obj,HttpStatus status){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("content", obj);
		map.put("status", status.value());
		map.put("errors", "");
		map.put("hasErrors", false);
		map.put("timestamp", LocalDateTime.now());
		return new ResponseEntity<Object>(map, status);
	}
	public static ResponseEntity<Object> getErrorResponse(BindingResult errors,HttpStatus status){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("content", null);
		map.put("status", status.value());
		map.put("errors", ErrorHelper.getAllError(errors));
		map.put("hasErrors", true);
		map.put("timestamp", LocalDateTime.now());
		return new ResponseEntity<Object>(map, status);
	}
	public static ResponseEntity<Object> getErrorResponse(String error,HttpStatus status){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("content", null);
		map.put("status", status.value());
		map.put("errors", error);
		map.put("hasErrors", true);
		map.put("timestamp", LocalDateTime.now());
		return new ResponseEntity<Object>(map, status);
	}
}
