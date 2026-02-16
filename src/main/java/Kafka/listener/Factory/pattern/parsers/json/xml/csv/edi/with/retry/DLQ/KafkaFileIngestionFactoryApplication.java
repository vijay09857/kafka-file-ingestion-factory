package Kafka.listener.Factory.pattern.parsers.json.xml.csv.edi.with.retry.DLQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaFileIngestionFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaFileIngestionFactoryApplication.class, args);
	}

}
