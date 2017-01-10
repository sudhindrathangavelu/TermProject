package edu.sjsu.cmpe275.entities;

// Generated Nov 22, 2015 8:22:29 PM by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "PROJECT", catalog = "CMPE275_PROJECT_MGMT_DB")
public class Project implements java.io.Serializable {

	private int projectId;

	
	
	private Person owner;

	@Transient
	private List<Person> members;
	
	@Transient
	public List<Person> getMembers() {
		return members;
	}
	public void setMembers(List<Person> members) {
		this.members = members;
	}

	@Transient
	private String validstate;
	@Transient
	public String getValidstate() {
		return validstate;
	}
	public void setValidstate(String validstate) {
		this.validstate = validstate;
	}
	
	@Embedded
	private EntityDetail projectDetail;

	public Project() {
	}

	public Project(Person owner, EntityDetail projectDetail) {
		this.owner = owner;
		this.projectDetail = projectDetail;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PROJECT_ID", unique = true, nullable = false)
	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}


	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name ="OWNER_ID")
	public Person getOwner() {
		return this.owner;
	}

	
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public EntityDetail getProjectDetail() {
		return this.projectDetail;
	}

	public void setProjectDetail(EntityDetail projectDetail) {
		this.projectDetail = projectDetail;
	}

	
	@Transient
	private int finsished_tasks;
	@Transient
	public int getFinsished_tasks() {
		return finsished_tasks;
	}
	public void setFinsished_tasks(int finsished_tasks) {
		this.finsished_tasks = finsished_tasks;
	}
	
	private int unfinsished_tasks;
	@Transient
	public int getUnfinsished_tasks() {
		return unfinsished_tasks;
	}
	public void setUnfinsished_tasks(int unfinsished_tasks) {
		this.unfinsished_tasks = unfinsished_tasks;
	}
	
	@Transient
	private int total_planned_tasks;
	@Transient
	public int getTotal_planned_tasks() {
		return total_planned_tasks;
	}
	public void setTotal_planned_tasks(int total_planned_tasks) {
		this.total_planned_tasks = total_planned_tasks;
	}
	
	@Transient
	private int total_cancelled_tasks;
	@Transient
	public int getTotal_cancelled_tasks() {
		return total_cancelled_tasks;
	}
	public void setTotal_cancelled_tasks(int total_cancelled_tasks) {
		this.total_cancelled_tasks = total_cancelled_tasks;
	}

}
