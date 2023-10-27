package org.learning;

import org.learning.algos.MooreVotingAlgoForMajorityElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    private MooreVotingAlgoForMajorityElement mooreVotingAlgoForMajorityElement;

    @Autowired
    public Main(MooreVotingAlgoForMajorityElement mooreVotingAlgoForMajorityElement) {
        this.mooreVotingAlgoForMajorityElement = mooreVotingAlgoForMajorityElement;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        mooreVotingAlgoForMajorityElement.execute(new int[]{1, 1, 1, 5, 8, 1, 4, 8, 1, 1});
    }
}