package com.mindtree.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Participant {

	void score(Connection con, int score, String name) throws SQLException {

		PreparedStatement stmt = con
				.prepareStatement("update participant_details set score=? where name='" + name + "'");
		stmt.setInt(1, score);
		stmt.executeUpdate();

	}

}
