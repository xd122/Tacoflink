package com.tacoflink.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ****************************************************************************************
 * Programs are meant to be read by humans and only incidentally for computers to execute
 * ****************************************************************************************
 * Author : tacoxiang
 * Time : 2020/6/2
 * Package : com.tacoflink.logging
 * ProjectName: tacoflink
 * Describe :
 * ============================================================
 */
public class Logging {
    private final static Logger logger = LoggerFactory.getLogger(Logging.class);

    public static void main(String[] args) {
        logger.info("Test logging ");
        logger.debug("Test logging ");
        logger.warn("Test logging ");
        logger.error("Test logging ");
    }
}
