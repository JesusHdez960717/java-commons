package com.clean.core.app.services;

/**
 * 
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ExceptionHandler {

    private static ExceptionHandlerService exceptionHandlerService;

    private ExceptionHandler() {
    }

    public static void registerExceptionHandlerService(ExceptionHandlerService newService) {
        exceptionHandlerService = newService;
    }

    public static ExceptionHandlerService getExceptionHandlerService() {
        if (exceptionHandlerService == null) {
            throw new IllegalStateException("Bad call");
        }
        return exceptionHandlerService;
    }

    public static void handleException(Exception ex) {
        getExceptionHandlerService().handleException(ex);
    }
}
