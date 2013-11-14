package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the circle_admin2 database table.
 * 
 */
@Entity
@Table(name="circle_admin2")
public class CircleAdmin2Entity implements Serializable {
	private static final long serialVersionUID = 1L;
	private CircleAdmin2EntityPK id;
	private int activeCount;
	private byte adcFlag;
	private String adcNumber;
	private String adminName;
	private String adminPwd;
	private String bindCell;
	private byte bmccFlag;
	private String bmccNumber;
	private byte c01008Flag;
	private String cellCode;
	private byte cellFlag;
	private byte checked;
	private byte cmMode;
	private String cmNumber;
	private short cmPrice;
	private byte cnMode;
	private String cnNumber;
	private short cnPrice;
	private String corpAddr;
	private String corpName;
	private Date createDate;
	private byte dynFilter;
	private byte exqfFlag;
	private int failAmount;
	private String fax;
	private byte faxFeeType;
	private byte faxRiseRatio;
	private byte feeType;
	private int freeSubmitLimit;
	private byte fullSubmit;
	private int limitMax;
	private int limitNum;
	private int limitType;
	private short locked;
	private byte mmsFeeType;
	private String mobilePhone;
	private int multiActive;
	private String nCellCode;
	private String phone;
	private String phoneNum;
	private byte priority;
	private byte retryType;
	private String subCircleId;
	private short transRatio;
	private byte unMode;
	private String unNumber;
	private short unPrice;
	private Date updateDate;
	private byte useCellParam;
	private String userSign;
	private short vipStatus;

    public CircleAdmin2Entity() {
    }


	@EmbeddedId
	public CircleAdmin2EntityPK getId() {
		return this.id;
	}

	public void setId(CircleAdmin2EntityPK id) {
		this.id = id;
	}
	

	@Column(name="active_count")
	public int getActiveCount() {
		return this.activeCount;
	}

	public void setActiveCount(int activeCount) {
		this.activeCount = activeCount;
	}


	@Column(name="adc_flag")
	public byte getAdcFlag() {
		return this.adcFlag;
	}

	public void setAdcFlag(byte adcFlag) {
		this.adcFlag = adcFlag;
	}


	@Column(name="adc_number")
	public String getAdcNumber() {
		return this.adcNumber;
	}

	public void setAdcNumber(String adcNumber) {
		this.adcNumber = adcNumber;
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


	@Column(name="bind_cell")
	public String getBindCell() {
		return this.bindCell;
	}

	public void setBindCell(String bindCell) {
		this.bindCell = bindCell;
	}


	@Column(name="bmcc_flag")
	public byte getBmccFlag() {
		return this.bmccFlag;
	}

	public void setBmccFlag(byte bmccFlag) {
		this.bmccFlag = bmccFlag;
	}


	@Column(name="bmcc_number")
	public String getBmccNumber() {
		return this.bmccNumber;
	}

	public void setBmccNumber(String bmccNumber) {
		this.bmccNumber = bmccNumber;
	}


	@Column(name="c01008_flag")
	public byte getC01008Flag() {
		return this.c01008Flag;
	}

	public void setC01008Flag(byte c01008Flag) {
		this.c01008Flag = c01008Flag;
	}


	@Column(name="cell_code")
	public String getCellCode() {
		return this.cellCode;
	}

	public void setCellCode(String cellCode) {
		this.cellCode = cellCode;
	}


	@Column(name="cell_flag")
	public byte getCellFlag() {
		return this.cellFlag;
	}

	public void setCellFlag(byte cellFlag) {
		this.cellFlag = cellFlag;
	}


	public byte getChecked() {
		return this.checked;
	}

	public void setChecked(byte checked) {
		this.checked = checked;
	}


	@Column(name="cm_mode")
	public byte getCmMode() {
		return this.cmMode;
	}

	public void setCmMode(byte cmMode) {
		this.cmMode = cmMode;
	}


	@Column(name="cm_number")
	public String getCmNumber() {
		return this.cmNumber;
	}

	public void setCmNumber(String cmNumber) {
		this.cmNumber = cmNumber;
	}


	@Column(name="cm_price")
	public short getCmPrice() {
		return this.cmPrice;
	}

	public void setCmPrice(short cmPrice) {
		this.cmPrice = cmPrice;
	}


	@Column(name="cn_mode")
	public byte getCnMode() {
		return this.cnMode;
	}

	public void setCnMode(byte cnMode) {
		this.cnMode = cnMode;
	}


	@Column(name="cn_number")
	public String getCnNumber() {
		return this.cnNumber;
	}

	public void setCnNumber(String cnNumber) {
		this.cnNumber = cnNumber;
	}


	@Column(name="cn_price")
	public short getCnPrice() {
		return this.cnPrice;
	}

	public void setCnPrice(short cnPrice) {
		this.cnPrice = cnPrice;
	}


	@Column(name="corp_addr")
	public String getCorpAddr() {
		return this.corpAddr;
	}

	public void setCorpAddr(String corpAddr) {
		this.corpAddr = corpAddr;
	}


	@Column(name="corp_name")
	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="create_date")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Column(name="dyn_filter")
	public byte getDynFilter() {
		return this.dynFilter;
	}

	public void setDynFilter(byte dynFilter) {
		this.dynFilter = dynFilter;
	}


	@Column(name="exqf_flag")
	public byte getExqfFlag() {
		return this.exqfFlag;
	}

	public void setExqfFlag(byte exqfFlag) {
		this.exqfFlag = exqfFlag;
	}


	@Column(name="fail_amount")
	public int getFailAmount() {
		return this.failAmount;
	}

	public void setFailAmount(int failAmount) {
		this.failAmount = failAmount;
	}


	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	@Column(name="fax_fee_type")
	public byte getFaxFeeType() {
		return this.faxFeeType;
	}

	public void setFaxFeeType(byte faxFeeType) {
		this.faxFeeType = faxFeeType;
	}


	@Column(name="fax_rise_ratio")
	public byte getFaxRiseRatio() {
		return this.faxRiseRatio;
	}

	public void setFaxRiseRatio(byte faxRiseRatio) {
		this.faxRiseRatio = faxRiseRatio;
	}


	@Column(name="fee_type")
	public byte getFeeType() {
		return this.feeType;
	}

	public void setFeeType(byte feeType) {
		this.feeType = feeType;
	}


	@Column(name="free_submit_limit")
	public int getFreeSubmitLimit() {
		return this.freeSubmitLimit;
	}

	public void setFreeSubmitLimit(int freeSubmitLimit) {
		this.freeSubmitLimit = freeSubmitLimit;
	}


	@Column(name="full_submit")
	public byte getFullSubmit() {
		return this.fullSubmit;
	}

	public void setFullSubmit(byte fullSubmit) {
		this.fullSubmit = fullSubmit;
	}


	@Column(name="limit_max")
	public int getLimitMax() {
		return this.limitMax;
	}

	public void setLimitMax(int limitMax) {
		this.limitMax = limitMax;
	}


	@Column(name="limit_num")
	public int getLimitNum() {
		return this.limitNum;
	}

	public void setLimitNum(int limitNum) {
		this.limitNum = limitNum;
	}


	@Column(name="limit_type")
	public int getLimitType() {
		return this.limitType;
	}

	public void setLimitType(int limitType) {
		this.limitType = limitType;
	}


	public short getLocked() {
		return this.locked;
	}

	public void setLocked(short locked) {
		this.locked = locked;
	}


	@Column(name="mms_fee_type")
	public byte getMmsFeeType() {
		return this.mmsFeeType;
	}

	public void setMmsFeeType(byte mmsFeeType) {
		this.mmsFeeType = mmsFeeType;
	}


	@Column(name="mobile_phone")
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}


	@Column(name="multi_active")
	public int getMultiActive() {
		return this.multiActive;
	}

	public void setMultiActive(int multiActive) {
		this.multiActive = multiActive;
	}


	@Column(name="n_cell_code")
	public String getNCellCode() {
		return this.nCellCode;
	}

	public void setNCellCode(String nCellCode) {
		this.nCellCode = nCellCode;
	}


	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Column(name="phone_num")
	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public byte getPriority() {
		return this.priority;
	}

	public void setPriority(byte priority) {
		this.priority = priority;
	}


	@Column(name="retry_type")
	public byte getRetryType() {
		return this.retryType;
	}

	public void setRetryType(byte retryType) {
		this.retryType = retryType;
	}


	@Column(name="sub_circle_id")
	public String getSubCircleId() {
		return this.subCircleId;
	}

	public void setSubCircleId(String subCircleId) {
		this.subCircleId = subCircleId;
	}


	@Column(name="trans_ratio")
	public short getTransRatio() {
		return this.transRatio;
	}

	public void setTransRatio(short transRatio) {
		this.transRatio = transRatio;
	}


	@Column(name="un_mode")
	public byte getUnMode() {
		return this.unMode;
	}

	public void setUnMode(byte unMode) {
		this.unMode = unMode;
	}


	@Column(name="un_number")
	public String getUnNumber() {
		return this.unNumber;
	}

	public void setUnNumber(String unNumber) {
		this.unNumber = unNumber;
	}


	@Column(name="un_price")
	public short getUnPrice() {
		return this.unPrice;
	}

	public void setUnPrice(short unPrice) {
		this.unPrice = unPrice;
	}


    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="update_date")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	@Column(name="use_cell_param")
	public byte getUseCellParam() {
		return this.useCellParam;
	}

	public void setUseCellParam(byte useCellParam) {
		this.useCellParam = useCellParam;
	}


	@Column(name="user_sign")
	public String getUserSign() {
		return this.userSign;
	}

	public void setUserSign(String userSign) {
		this.userSign = userSign;
	}


	@Column(name="vip_status")
	public short getVipStatus() {
		return this.vipStatus;
	}

	public void setVipStatus(short vipStatus) {
		this.vipStatus = vipStatus;
	}

}