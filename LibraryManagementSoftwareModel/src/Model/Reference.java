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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Reference {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rId")
	private Long rId; 
	
	@Column(name = "startDateReference")
	private String startDateReference;
	
	@Column(name = "endDateReference")
	private String endDateReference;
	
	@Column(name = "bookCountReference")
	private int bookCountReference;

	@OneToMany(mappedBy = "reference")
	private Set<Book> books;
	
	@ManyToOne
	@JoinColumn(name = "staffId", nullable=false )
	private Staff staff;
	
	@ManyToOne
	@JoinColumn(name = "stuId", nullable=false )
	private Student student;
}
