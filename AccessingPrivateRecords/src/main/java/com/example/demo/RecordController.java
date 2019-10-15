package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordController {
	Record Ref = new Record();
	
	
	@RequestMapping(method=RequestMethod.GET, value="/ShowRecord")
	public Record ShowRecord() {
		//Record Ref = new Record(2, "Peter", 75);
		return Ref;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/myRecord/{R}/{N}/{M}")
	public Record ShowMyRecord(@PathVariable int R, @PathVariable String N, @PathVariable int M) {
	
	Ref.setRegno(R);
	Ref.setName(N);
	Ref.setMarks(M);
	return Ref;
}
}
