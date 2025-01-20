package in.nareshit.ajeet.hc.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="emptab")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer Id;
	@Column(name="ename")
	private String empname;
	@Column(name="esal")
	private Double empSal;
	@Column(name="eaddr")
	private String empAddr;
	@Column(name="empdept")
	private String empDept;

}
