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
 * Describe : logback日志工具类
 * ============================================================
 */
public class Logging {
    private final static Logger logger = LoggerFactory.getLogger(Logging.class);

    public static void logInfo(String msg) {
        if (logger.isInfoEnabled()) {
            logger.info(msg);
        }
    }

    public static void logInfo(String msg, Throwable cause) {
        if (logger.isInfoEnabled()) {
            logger.info(msg, cause);
        }
    }

    public static void logDebug(String msg) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg);
        }
    }

    public static void logDebug(String msg, Throwable cause) {
        if (logger.isDebugEnabled()) {
            logger.debug(msg, cause);
        }
    }

    public static void logWarning(String msg) {
        if (logger.isWarnEnabled()) {
            logger.warn(msg);
        }
    }

    public static void logWarning(String msg, Throwable cause) {
        if (logger.isWarnEnabled()) {
            logger.warn(msg, cause);
        }
    }

    public static void logError(String msg) {
        if (logger.isErrorEnabled()) {
            logger.error(msg);
        }
    }

    public static void logError(String msg, Throwable cause) {
        if (logger.isErrorEnabled()) {
            logger.error(msg, cause);
        }
    }

    public static void main(String[] args) {
        Logging.logDebug("Tacoxiang");
        Logging.logWarning("Tacoxiang");
        Logging.logInfo("Tacoxiang");
        Logging.logError("Tacoxiang");
    }
}
