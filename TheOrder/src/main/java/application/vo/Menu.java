package application.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="MENU")
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	int menuId;
	
	@Column(nullable=false)
	String menuNm;
	
	@Column(nullable=false)
	int menuAmt;
	
	@Column(nullable=false)
	String iceOptUseYn;
	
	@Column(nullable=false)
	String shotOptUseYn;
	
	@Column(nullable=false)
	int showNo;
	
	@Column(nullable=false)
	String menuMngCd;
}
