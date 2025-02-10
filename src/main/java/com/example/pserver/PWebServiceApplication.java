package com.example.pserver;

import com.example.pserver.entity.BuildingEntity;
import com.example.pserver.entity.PersonEntity;
import com.example.pserver.persistence.ManagerPersistence;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

@SpringBootApplication
public class PWebServiceApplication implements CommandLineRunner {

	private ManagerPersistence managerPersistence;
	private ObjectMapper objectMapper;

	public PWebServiceApplication(ManagerPersistence managerPersistence, ObjectMapper objectMapper) {
		this.managerPersistence = managerPersistence;
		this.objectMapper = objectMapper;
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(PWebServiceApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello world");
		InputStream personEntityInputStream = getJsonInputStream(args[0]);
		InputStream buildingEntityInputStream = getJsonInputStream(args[1]);
		// convert JSON string to Java Object
		PersonEntity person = this.objectMapper.readValue(personEntityInputStream, PersonEntity.class);
		managerPersistence.save(person);
		BuildingEntity building = this.objectMapper.readValue(buildingEntityInputStream, BuildingEntity.class);
		managerPersistence.save(building);
	}

	private static InputStream getJsonInputStream(String jsonInternal) throws URISyntaxException, IOException {
		var fileName=jsonInternal.trim();
		Path filePath = Path.of(fileName);
		InputStream inputStream = Files.newInputStream(filePath);
		return inputStream;
	}
}
