package com.org.ScheduleDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component

@Slf4j
public class Utility {

	@Scheduled(fixedRate = 30000)
	public void fixedRateSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		log.debug("Fixed Rate scheduler:: " + strDate);
	}

	@Scheduled(fixedRate = 30000, initialDelay = 1000)
	public void fixedRateSchInterval() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		log.debug("fixedRateSchInterval Fixed Rate scheduler:: " + strDate);
	}

//
//	@Scheduled(cron = "0 0 * * * ?")
//	public void fixedRateSchIntervalexp() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		Date now = new Date();
//		String strDate = sdf.format(now);
//		log.debug("fixedRateSchIntervalexp Fixed Rate scheduler:: " + strDate);
//	}

//	@Scheduled(cron = "*/5 */5 * * * *")
	@Scheduled(cron = "@hourly")
	public void fixedRateSchIntervalexp2() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		log.debug("fixedRateSchIntervalexp Fixed Rate scheduler:: " + strDate);
	}

}
