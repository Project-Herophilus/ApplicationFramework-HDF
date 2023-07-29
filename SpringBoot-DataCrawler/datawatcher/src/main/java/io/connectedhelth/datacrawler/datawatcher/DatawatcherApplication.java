package io.connectedhelth.datacrawler.datawatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Import
import io.connectedhelth.datacrawler.datawatcher.repository.PlatformSettingsRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/*
 *  Repository with Persistence - https://www.javaguides.net/2020/02/spring-boot-commandlinerunner-example.html
 *  Startup Bean - https://howtodoinjava.com/spring-boot/command-line-runner-interface-example/
 *  Persistence - https://zetcode.com/springboot/commandlinerunner/
 *
 */

@SpringBootApplication
public class DatawatcherApplication implements CommandLineRunner {

    public static void main(String[] args)
    {
        SpringApplication.run(DatawatcherApplication.class, args);
    }

    // Instantiate Logger
    private static final Logger logger = LoggerFactory.getLogger(DatawatcherApplication.class);

    //Repository Loader
    @Autowired
    private PlatformSettingsRepository myRepository;

    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("Started Directory Watcher on: "+java.time.LocalDate.now()+ " at: "+java.time.LocalTime.now());

    }

}
