package com.ehsproy.ClientPerson.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="infoDataPersonal")
public class InfoPersona {

	@Id
	private String id;
	private String docNumber;
	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String direction;
}
