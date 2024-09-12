package com.example.livedemo;

import com.example.livedemo.models.Customer;
import com.example.livedemo.models.Membership;
import com.example.livedemo.repos.CustomerRepo;
import com.example.livedemo.repos.MembershipRepo;
import com.example.livedemo.repos.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LiveDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveDemoApplication.class, args);
    }

    /*
    @Bean
    public CommandLineRunner run(CustomerRepo cr, ProductRepo pr, MembershipRepo mr){
        return args -> {
            Customer k1 = new Customer("Dorian");
            Customer k2 = new Customer("Efraim");
            Customer k3 = new Customer("Frida");


            Membership m1 = new Membership(12, k1);
            Membership m2 = new Membership(13, k2);
            Membership m3 = new Membership(14, k3);

            mr.save(m1);
            mr.save(m2);
            mr.save(m3);
        };
    }
*/

}
