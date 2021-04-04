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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "book")

public class Book {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bId")
	private Long bId;
	
	@Column(name = "isbmNo")
	private String isbmNo;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "clasificationNo", nullable=false )
	private Category category;
	
	@ManyToOne
	@JoinColumn(name = "pId", nullable=false )
	private Publisher publisher;
	
	@ManyToMany
	private Set<Author> authors;
	
	@ManyToOne
	@JoinColumn(name = "rId", nullable=false )
	private Reference reference;
	
	@ManyToOne
	@JoinColumn(name = "lId", nullable=false )
	private Lending lending;
}
