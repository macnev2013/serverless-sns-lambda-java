package com.serverless;

import java.util.Collections;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.events.SNSEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;



public class Handler implements RequestHandler<SNSEvent, String> {
	private static final Logger logger = LogManager.getLogger(Handler.class);

    @Override
    public String handleRequest(SNSEvent snsEvent, Context context) {
        logger.info("Message: " + snsEvent.getRecords().get(0).getSNS().getMessage());
        logger.info("MessageId: " + snsEvent.getRecords().get(0).getSNS().getMessageId());
		return "Success";
    }
}
