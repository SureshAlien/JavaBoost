import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDao
{

	public static void main(String[] args)
	{
		StudentDao dao = new StudentDao();
		//Student s1 = dao. getStudent(12);
		//System.out.println("sname"+s1.name);

		
		Student s2 = new Student();
		s2.rollno = 15 ;
		s2.name ="sur";
		dao.connect();
		dao.addStudent(s2);
		//dao.removeStudent(s2)
		

	}

}

class StudentDao{
	
	Connection con = null;
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/","root","0");
		
		} catch (Exception e) {
				System.out.println("error connection "+e);		
		}
		
		
	}
	
	public Student getStudent(int rollno) {
		
		try {
			String query = "select sname from student where rollnum ="+rollno ; 
			Student s = new Student();
			s.rollno = rollno ;

			
	
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);

			String name = rs.getString(1);
			
			s.name = name ;

			
			return s;

			
			
		}catch (Exception e) {
			System.out.println("error connection "+e);		
		}
		return null;

		
	}

	public void addStudent(Student s2) {
		String query = "insert into student values(?,?)"; 
		PreparedStatement pst ;
		try {
			pst= con .prepareStatement(query);
			pst.setInt(1,s2.rollno);
			pst.setString(2,s2.name );
			pst.executeUpdate();
					
		}catch (Exception e) {
			System.out.println("error connection "+e);		
		}
		return null;
		
	}
	
}

class Student {
	int rollno;
	String name ;
	
}
