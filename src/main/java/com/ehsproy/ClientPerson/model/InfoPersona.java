package com.ehsproy.ClientPerson.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("infoDataPersonal")
public class InfoPersona {

	@Id
	private String id;
	@Indexed
	private String docNumber;
	private String firstName;
	private String lastName;
	private String telephoneNumber;
	private String direction;
	private String codeTypeDoc;
}
