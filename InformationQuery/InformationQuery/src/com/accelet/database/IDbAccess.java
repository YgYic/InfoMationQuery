package com.accelet.database;

import java.sql.SQLException;
import java.util.List;

import entity.AdminUserEntity;
import entity.CircleAdmin2Entity;

public interface IDbAccess {
	public List<AdminUserEntity> queryAdminUser() throws SQLException;
	public List<CircleAdmin2Entity> queryCircleAdmin2() throws SQLException;
}
