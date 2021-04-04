/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tharaka
 */
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "book")
public class Staff {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staffId")
	private Long staffId;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "lname")
	private String lname;
	
	@OneToMany(mappedBy = "staff")
	private Set<Reference> reference;
	
	@OneToMany(mappedBy = "staff")
	private Set<Lending> lending;

}
