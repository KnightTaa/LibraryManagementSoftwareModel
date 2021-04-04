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
@Table(name = "lending")
public class Lending {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lId")
	private Long lId;
	
	@Column(name = "startDateLending")
	private String startDateLending;
	
	@Column(name = "endDateLending")
	private String endDateLending;
	
	@Column(name = "bookCountLending")
	private int bookCountLending;
	
	@OneToMany(mappedBy = "lending")
	private Set<Book> books;
	
	@ManyToOne
	@JoinColumn(name = "staffId", nullable=false )
	private Staff staff;
	
	@ManyToOne
	@JoinColumn(name = "stuId", nullable=false )
	private Student student;
}
