package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the admin_user1 database table.
 * 
 */
@Embeddable
public class AdminUser1EntityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private String circleId;
	private String adminId;

    public AdminUser1EntityPK() {
    }

	@Column(name="circle_id")
	public String getCircleId() {
		return this.circleId;
	}
	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	@Column(name="admin_id")
	public String getAdminId() {
		return this.adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AdminUser1EntityPK)) {
			return false;
		}
		AdminUser1EntityPK castOther = (AdminUser1EntityPK)other;
		return 
			this.circleId.equals(castOther.circleId)
			&& this.adminId.equals(castOther.adminId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.circleId.hashCode();
		hash = hash * prime + this.adminId.hashCode();
		
		return hash;
    }
}