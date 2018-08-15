package com.sgglabs.retail;

import com.sgglabs.retail.model.SellerProductData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;

/**
 * @Author: Sankarganesh Gandhi (sgandhi@sgglabs.com)
 */
@SpringBootApplication
public class DataStoreApplication implements CommandLineRunner {
    /*@Autowired
    SearchResultJMSService listener;*/

    private static final Logger LOG = LoggerFactory.getLogger(DataStoreApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DataStoreApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    @Override
    public void run(String... args) {
    }
}