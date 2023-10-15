package com.example.red.Model;

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
@Table(name="bts_contacts_rel")
public class BtsContactsRel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	private int bts_number;
	private int contact_id;
	private int arch;
}
