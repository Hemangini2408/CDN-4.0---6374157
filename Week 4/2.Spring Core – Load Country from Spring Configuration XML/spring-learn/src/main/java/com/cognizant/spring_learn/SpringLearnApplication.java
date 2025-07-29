package com.cognizant.spring_learn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        displayCountry();
    }
    public static void displayCountry() {
        System.out.println("Loading context...");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        System.out.println("Getting bean...");
        Country country = (Country) context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
        System.out.println("Country loaded: " + country);
    }
}