package com.accelet.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;
import static util.Util.iso2gbk;
import org.springframework.stereotype.Service;

import entity.AdminUserEntity;
import entity.AdminUserEntityPK;
import entity.CircleAdmin2Entity;
import entity.CircleAdmin2EntityPK;


@Service("dbAccess")
public class DbAccess implements IDbAccess{
	@Resource(name="dataSource")
	private DataSource dataSource;
	
	public List<AdminUserEntity> queryAdminUser() throws SQLException{
		Connection conn = null;
		ResultSet rs = null;
		try{
			conn = dataSource.getConnection();
			String sql = "SELECT circle_id, admin_id, admin_pwd, admin_name, duty, sex, status, menu, " +
					"email, office_phone, mobile_phone, home_phone, section, join_date, end_date, type, " +
					"rank, position, cell_code, flag, limit_type, limit_num, bind_type, cell_group, locked, " +
					"fee_type, id_card, soft_key, industry, corporation, linkman_name, linkman_duty, linkman_phone, " +
					"card_name, card_num, cm_num, manage_name, imprest_status FROM admin_user limit ?,?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 0);
			stmt.setInt(2, 10);
			rs = stmt.executeQuery();
			List<AdminUserEntity> adminUserList = new ArrayList<AdminUserEntity>(); 
			while (rs.next()) {
				AdminUserEntity entity = new AdminUserEntity();
				AdminUserEntityPK id = new AdminUserEntityPK();
				id.setAdminId(iso2gbk(rs.getString("admin_id")));
				id.setCircleId(iso2gbk(rs.getString("circle_id")));
				entity.setId(id);
				entity.setAdminName(iso2gbk(rs.getString("admin_name")));
				adminUserList.add(entity);
			}
			return adminUserList;
		}catch (Exception e) {
			e.printStackTrace();
			throw new SQLException();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {}	
			try{
				conn.close();
			}catch (Exception e) {}
		}
	}
	
	public List<CircleAdmin2Entity> queryCircleAdmin2() throws SQLException{
		Connection conn = null;
		ResultSet rs = null;
		try{
			conn = dataSource.getConnection();
			String sql = "SELECT circle_id, admin_id, admin_pwd, admin_name, mobile_phone, cell_code, limit_type, " +
					"limit_num, active_count, multi_active, create_date, update_date, sub_circle_id, use_cell_param, " +
					"cm_number, un_number, cn_number, cm_price, un_price, cn_price, cm_mode, un_mode, cn_mode, " +
					"retry_type, priority, cell_flag, vip_status, phone, phone_num, fax, locked, checked, fee_type, " +
					"free_submit_limit, fail_amount, dyn_filter, trans_ratio, user_sign, corp_name, corp_addr, " +
					"n_cell_code, bind_cell, bmcc_flag, bmcc_number, c01008_flag, exqf_flag, mms_fee_type, " +
					"limit_max, adc_flag, adc_number, fax_fee_type, fax_rise_ratio, full_submit " +
					"FROM circle_admin2  limit ?,?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 0);
			stmt.setInt(2, 10);
			rs = stmt.executeQuery();
			List<CircleAdmin2Entity> list = new ArrayList<CircleAdmin2Entity>();
			while (rs.next()) {
				CircleAdmin2Entity entity = new CircleAdmin2Entity();
				CircleAdmin2EntityPK id = new CircleAdmin2EntityPK();
				id.setAdminId(iso2gbk(rs.getString("admin_id")));
				id.setCircleId(iso2gbk(rs.getString("circle_id")));
				entity.setId(id);
				entity.setAdminName(iso2gbk(rs.getString("admin_name")));
				list.add(entity);
			}
			return list;
		}catch (Exception e) {
			e.printStackTrace();
			throw new SQLException();
		}finally{
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
			try{
				conn.close();
			}catch (Exception e) {}
		}
	}
}
