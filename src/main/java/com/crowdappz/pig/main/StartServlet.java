package com.crowdappz.pig.main;

import com.crowdappz.pig.handler.QueryHandler;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartServlet implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        QueryHandler.registerClazzez();
    }

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {

    }
}