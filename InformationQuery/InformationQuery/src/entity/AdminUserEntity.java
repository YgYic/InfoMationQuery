package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the admin_user database table.
 * 
 */
@Entity
@Table(name="admin_user")
public class AdminUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private AdminUserEntityPK id;
	private String adminName;
	private String adminPwd;
	private short bindType;
	private String cardName;
	private String cardNum;
	private String cellCode;
	private String cellGroup;
	private String cmNum;
	private String corporation;
	private String duty;
	private String email;
	private Date endDate;
	private short feeType;
	private byte flag;
	private String homePhone;
	private String idCard;
	private short imprestStatus;
	private byte industry;
	private Date joinDate;
	private int limitNum;
	private byte limitType;
	private String linkmanDuty;
	private String linkmanName;
	private String linkmanPhone;
	private short locked;
	private String manageName;
	private String menu;
	private String mobilePhone;
	private String officePhone;
	private String position;
	private int rank;
	private int section;
	private String sex;
	private String softKey;
	private int status;
	private short type;

    public AdminUserEntity() {
    }


	@EmbeddedId
	public AdminUserEntityPK getId() {
		return this.id;
	}

	public void setId(AdminUserEntityPK id) {
		this.id = id;
	}
	

	@Column(name="admin_name")
	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	@Column(name="admin_pwd")
	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}


	@Column(name="bind_type")
	public short getBindType() {
		return this.bindType;
	}

	public void setBindType(short bindType) {
		this.bindType = bindType;
	}


	@Column(name="card_name")
	public String getCardName() {
		return this.cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	@Column(name="card_num")
	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	@Column(name="cell_code")
	public String getCellCode() {
		return this.cellCode;
	}

	public void setCellCode(String cellCode) {
		this.cellCode = cellCode;
	}


	@Column(name="cell_group")
	public String getCellGroup() {
		return this.cellGroup;
	}

	public void setCellGroup(String cellGroup) {
		this.cellGroup = cellGroup;
	}


	@Column(name="cm_num")
	public String getCmNum() {
		return this.cmNum;
	}

	public void setCmNum(String cmNum) {
		this.cmNum = cmNum;
	}


	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}


	public String getDuty() {
		return this.duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="end_date")
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	@Column(name="fee_type")
	public short getFeeType() {
		return this.feeType;
	}

	public void setFeeType(short feeType) {
		this.feeType = feeType;
	}


	public byte getFlag() {
		return this.flag;
	}

	public void setFlag(byte flag) {
		this.flag = flag;
	}


	@Column(name="home_phone")
	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}


	@Column(name="id_card")
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	@Column(name="imprest_status")
	public short getImprestStatus() {
		return this.imprestStatus;
	}

	public void setImprestStatus(short imprestStatus) {
		this.imprestStatus = imprestStatus;
	}


	public byte getIndustry() {
		return this.industry;
	}

	public void setIndustry(byte industry) {
		this.industry = industry;
	}


    @Temporal( TemporalType.DATE)
	@Column(name="join_date")
	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}


	@Column(name="limit_num")
	public int getLimitNum() {
		return this.limitNum;
	}

	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}


	@Column(name="limit_type")
	public byte getLimitType() {
		return this.limitType;
	}

	public void setLimitType(byte limitType) {
		this.limitType = limitType;
	}


	@Column(name="linkman_duty")
	public String getLinkmanDuty() {
		return this.linkmanDuty;
	}

	public void setLinkmanDuty(String linkmanDuty) {
		this.linkmanDuty = linkmanDuty;
	}


	@Column(name="linkman_name")
	public String getLinkmanName() {
		return this.linkmanName;
	}

	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName;
	}


	@Column(name="linkman_phone")
	public String getLinkmanPhone() {
		return this.linkmanPhone;
	}

	public void setLinkmanPhone(String linkmanPhone) {
		this.linkmanPhone = linkmanPhone;
	}


	public short getLocked() {
		return this.locked;
	}

	public void setLocked(short locked) {
		this.locked = locked;
	}


	@Column(name="manage_name")
	public String getManageName() {
		return this.manageName;
	}

	public void setManageName(String manageName) {
		this.manageName = manageName;
	}


	public String getMenu() {
		return this.menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}


	@Column(name="mobile_phone")
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	@Column(name="office_phone")
	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}


	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}


	public int getSection() {
		return this.section;
	}

	public void setSection(int section) {
		this.section = section;
	}


	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	@Column(name="soft_key")
	public String getSoftKey() {
		return this.softKey;
	}

	public void setSoftKey(String softKey) {
		this.softKey = softKey;
	}


	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	public short getType() {
		return this.type;
	}

	public void setType(short type) {
		this.type = type;
	}

}