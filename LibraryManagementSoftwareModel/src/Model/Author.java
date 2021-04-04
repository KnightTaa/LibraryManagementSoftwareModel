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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "author")
public class Author {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aId")
	private Long aId;
	
	@Column(name = "authorName")
	private String authorName;
	
	@ManyToMany
	private Set<Book> books;
}
