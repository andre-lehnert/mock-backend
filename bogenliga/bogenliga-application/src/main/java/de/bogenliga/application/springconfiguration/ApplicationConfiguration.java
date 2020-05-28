package de.bogenliga.application.springconfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * I configure the spring boot application
 *
 * <ul>
 * <li>Configure the package with spring boot application context</li>
 * </ul>
 *
 * @author Andre Lehnert, eXXcellent solutions consulting & software gmbh
 */
@Configuration
@ComponentScan("de.bogenliga.application")
public class ApplicationConfiguration {
}
