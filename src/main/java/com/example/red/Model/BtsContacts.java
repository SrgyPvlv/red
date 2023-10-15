package com.example.red.Model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bts_contacts")
public class BtsContacts {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private LocalDate act_date;
	private String theme;
	private String name;
	private String doljnost;
	private String phone;
	private String mail;
	private String comment;
}
