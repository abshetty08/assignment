package com.example.assignment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@Slf4j
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);

		try {
			var solution = new Solution();
			int nextHighestNumber = solution.nextHighestNumber(args[0]);
			System.out.println("Next highest number = " + nextHighestNumber);
		} catch (Exception e) {
			log.error(String.valueOf(e));
		}
	}

}
