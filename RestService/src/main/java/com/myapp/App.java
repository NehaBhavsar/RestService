package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * @author neha
 * 
 * Created on 09/08/2015
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.myapp")
@EnableSwagger
public class App 
{
    public static void main( String[] args )
    {
       SpringApplication.run(App.class, args);
    }
}
