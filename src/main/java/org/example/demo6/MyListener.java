package org.example.demo6;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

public static EntityManagerFactory EMF;

    @Override
    public void contextInitialized(ServletContextEvent event) {
         EMF = Persistence.createEntityManagerFactory("MyListener");
    }
}
