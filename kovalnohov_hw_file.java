package com.company.lesson6;

import org.apache.log4j.Logger;

public class Main {
    public static void main( String[] args ) {
        Logger logger = Logger.getLogger("Main");
        logger.info( "info text" );
        logger.debug( "debug text" );
        logger.error( "error text" );
        System.out.println("hi");
    }


}
