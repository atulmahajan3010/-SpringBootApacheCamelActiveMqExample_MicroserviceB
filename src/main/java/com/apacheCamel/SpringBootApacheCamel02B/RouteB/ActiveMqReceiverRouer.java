package com.apacheCamel.SpringBootApacheCamel02B.RouteB;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouer extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("activemq:my-activemq-queue")
		.log("${body}")
		.to("log:received-message-from-activemq");
	}

}
