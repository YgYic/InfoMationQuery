package entity;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

public class ItemPropEntity implements Serializable{
	/** 
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */
	private static final long serialVersionUID = -5571511556366573020L;
	@Expose
	private String cat_id;
	@Expose
	private String props_id;
	@Expose
	private String props_priority;
	@Expose
	private String props_status;
	@Expose
	private String cat_name;
	@Expose
	private String props_name;
	@Expose
	private String props_showname;
	public String getCat_id() {
		return cat_id;
	}
	public void setCat_id(String cat_id) {
		this.cat_id = cat_id;
	}
	public String getProps_id() {
		return props_id;
	}
	public void setProps_id(String props_id) {
		this.props_id = props_id;
	}
	public String getProps_priority() {
		return props_priority;
	}
	public void setProps_priority(String props_priority) {
		this.props_priority = props_priority;
	}
	public String getProps_status() {
		return props_status;
	}
	public void setProps_status(String props_status) {
		this.props_status = props_status;
	}
	public String getCat_name() {
		return cat_name;
	}
	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}
	public String getProps_name() {
		return props_name;
	}
	public void setProps_name(String props_name) {
		this.props_name = props_name;
	}
	public String getProps_showname() {
		return props_showname;
	}
	public void setProps_showname(String props_showname) {
		this.props_showname = props_showname;
	}
	

}
