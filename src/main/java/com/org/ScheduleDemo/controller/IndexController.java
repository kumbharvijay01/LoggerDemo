/**
 * 
 */
package com.org.ScheduleDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 */
@RestController
@Slf4j
public class IndexController {

//	public static final Logger log= LogManager.getLogger(IndexController.class);
	@RequestMapping(value = "/index")
	public String index() {
		log.info("This is INFO Message");
		log.error("This is ERRORMessage");
		log.trace("This is TRACE Message");
		log.debug("This is DEBUG Message");
//		for (int i = 1; i < 1000000; i++) {
//			log.debug("i Value is : " + i);
//		}

		return "Hello World";

	}

}
