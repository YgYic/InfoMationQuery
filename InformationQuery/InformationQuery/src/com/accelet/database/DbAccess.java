package com.accelet.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Service;


@Service("dbAccess")
public class DbAccess implements IDbAccess{
	@Resource(name="dataSource")
	private DataSource dataSource;
	
	public ResultSet queryAdminUser(){
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			String sql = "SELECT circle_id, admin_id, admin_pwd, admin_name, duty, sex, status, menu, " +
					"email, office_phone, mobile_phone, home_phone, section, join_date, end_date, type, " +
					"rank, position, cell_code, flag, limit_type, limit_num, bind_type, cell_group, locked, " +
					"fee_type, id_card, soft_key, industry, corporation, linkman_name, linkman_duty, linkman_phone, " +
					"card_name, card_num, cm_num, manage_name, imprest_statu FROM admin_user";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.close();
			return rs;
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (Exception e) {}
		}
		return null;
	}
	
	public ResultSet queryCircleAdmin2(){
		Connection conn = null;
		try{
			conn = dataSource.getConnection();
			String sql = "SELECT circle_id, admin_id, admin_pwd, admin_name, mobile_phone, cell_code, limit_type, " +
					"limit_num, active_count, multi_active, create_date, update_date, sub_circle_id, use_cell_param, " +
					"cm_number, un_number, cn_number, cm_price, un_price, cn_price, cm_mode, un_mode, cn_mode, " +
					"retry_type, priority, cell_flag, vip_status, phone, phone_num, fax, locked, checked, fee_type, " +
					"free_submit_limit, fail_amount, dyn_filter, trans_ratio, user_sign, corp_name, corp_addr, " +
					"n_cell_code, bind_cell, bmcc_flag, bmcc_number, c01008_flag, exqf_flag, mms_fee_type, " +
					"limit_max, adc_flag, adc_number, fax_fee_type, fax_rise_ratio, full_submit FROM circle_admin2";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.close();
			return rs;
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}catch (Exception e) {}
		}
		return null;
	}
}
