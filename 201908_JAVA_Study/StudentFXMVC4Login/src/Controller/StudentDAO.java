package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.StudentVO;

public class StudentDAO {
	// ① data input
	public int getStudentregiste(StudentVO svo) throws Exception {
		// ② 데이터 처리를 위한 SQL 문
		// sysdate 오라클 현재 날짜를 리턴해줌.
		String dml = "insert into schoolchild "
				+ "(name, year, ban, gender, korean, english, math, sic, soc, music, total, avg, register, filename)" 
				+ " values " + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now(), ?)";
		Connection con = null;
		PreparedStatement pstmt = null; // ������ ���Ѱ�
		int count = 0;
		try {
			// ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
			con = DBUtil.getConnection();
			// sVo = new StudentVO();
			// ④ 입력받은 학생 정보를 처리하기 위하여 SQL문장을 생성
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, svo.getName());
			pstmt.setString(2, svo.getLevel());
			pstmt.setString(3, svo.getBan());
			pstmt.setString(4, svo.getGender());
			pstmt.setInt(5, svo.getKorean());
			pstmt.setInt(6, svo.getEnglish());
			pstmt.setInt(7, svo.getMath());
			pstmt.setInt(8, svo.getSic());
			pstmt.setInt(9, svo.getSoc());
			pstmt.setInt(10, svo.getMusic());
			pstmt.setInt(11, svo.getTotal());
			pstmt.setDouble(12, svo.getAvg());
			pstmt.setString(13, svo.getFilename());

			// ⑤ SQL문을 수행후 처리 결과를 얻어옴
			count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
		return count;
	}

	// student list
	public ArrayList<StudentVO> getStudentTotal() {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		String tml = "select * from schoolchild";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO emVo = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(tml);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emVo = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						rs.getInt(12), rs.getDouble(13),rs.getString(14),rs.getString(15));
				list.add(emVo);
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
		return list;
	}

	// student delete
	public void getStudentDelete(int no) throws Exception {
		// ② 데이터 처리를 위한 SQL 문
		String dml = "delete from schoolchild where no = ?";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
			con = DBUtil.getConnection();

			// ⑤ SQL문을 수행후 처리 결과를 얻어옴
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, no);

			// ⑤ SQL문을 수행후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();

			if (i == 1) {
				DBUtil.alertDisplay(5, "DELETE", "SUCCESE", "BYEBYE!");
			} else {
				DBUtil.alertDisplay(1, "DELETE", "ERROR", "CHECK!");
			}

		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}

	}

	// edit function update tabke Name set fieldname = edit where condition ""
	public StudentVO getStudentUpdate(StudentVO svo, int no) throws Exception {
		// ② 데이터 처리를 위한 SQL 문
		String dml = "update schoolchild set "
				+ " korean=?, english=?, math=?, sic=?, soc=?, music=?, total=?, avg=?  where no = ?";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// ③ DBUtil이라는 클래스의 getConnection( )메서드로 데이터베이스와 연결
			con = DBUtil.getConnection();

			// ④ 수정한 학생 정보를 수정하기 위하여 SQL문장을 생성
			pstmt = con.prepareStatement(dml);
			pstmt.setInt(1, svo.getKorean());
			pstmt.setInt(2, svo.getEnglish());
			pstmt.setInt(3, svo.getMath());
			pstmt.setInt(4, svo.getSic());
			pstmt.setInt(5, svo.getSoc());
			pstmt.setInt(6, svo.getMusic());
			pstmt.setInt(7, svo.getTotal());
			pstmt.setDouble(8, svo.getAvg());
			pstmt.setDouble(9, svo.getNo());

			// ⑤ SQL문을 수행후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();

			if (i == 1) {
				DBUtil.alertDisplay(1, "수정완료", svo.getNo() + "수정완료", "완료");

			} else {
				DBUtil.alertDisplay(1, "수정실패", svo.getNo() + "수정실패", "실패");

			}

		} catch (SQLException e) {
			System.out.println("e=[" + e + "]");
		} catch (Exception e) {
			System.out.println("e=[" + e + "]");
		} finally {
			try {
				// ⑥ 데이터베이스와의 연결에 사용되었던 오브젝트를 해제
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
			}
		}
		return svo;
	}

	// ⑦ 학생의 name을 입력받아 정보 조회
	public ArrayList<StudentVO> getStudentCheck(String name) throws Exception {
		String dml = "select * from schoolchild where name like ?";
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String name2 = "%" + name + "%";
		System.out.println("name2=" + name2);
		StudentVO retval = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, name2);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				retval = new StudentVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						rs.getInt(12), rs.getDouble(13),rs.getString(14),rs.getString(15));
				list.add(retval);
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
		return list;
	}

	// 데이터베이스에서 학생 테이블의 컬럼의 갯수
	public ArrayList<String> getColumnName() {
		ArrayList<String> columnName = new ArrayList<String>();

		String sql = "select * from schoolchild";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// ResultSetMetaData 객체 변수 선언
		ResultSetMetaData rsmd = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			int cols = rsmd.getColumnCount();
			for (int i = 1; i <= cols; i++) {
				columnName.add(rsmd.getColumnName(i));
			}
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException se) {
			}
		}
		return columnName;
	}
}
