package org.mycompany;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class FileRouter implements Processor {

	@Override
	public void process(Exchange inputPayload) throws Exception {
		Object payload = inputPayload.getMessage().getBody();
		System.out.println( "Input payload is: " + payload );
	}	
}
