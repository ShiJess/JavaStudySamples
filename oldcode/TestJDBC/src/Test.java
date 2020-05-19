	
import java.sql.*;

public class Test {
	    public static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";//characterEncoding=GBK
	    public static String username = "root";
	    public static String password = "283611";
	    public static Connection con;
	    public static Statement stmt;
	    public static ResultSet rs;
	    
	    public static void main(String[] args) throws SQLException {
	        connect();
	        test();
	        stmt.close();
	        con.close();
	    }
	    public static void test() {
	        String sql_select = "select * from testtable";
	        String sql_insert = "insert into testtable (name) values('����')";
	        //sql_insert = new String(sql_insert.getBytes("ISO-8859-1"),"UTF-8"); //����ת��ΪUTF-8
	        String sql_update = "update tablename set colname='update' where id=1";
	        insert(sql_insert);
	        select(sql_select);
	        //update(sql_update);
	    }
	    public static void connect() {
	        // ��λ����
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("���������ɹ�!"); 
	        } catch (ClassNotFoundException e) {
	            System.out.println("��������ʧ��!");
	            e.printStackTrace();
	        }
	        // ��������
	        try {
	            con = DriverManager.getConnection(url, username, password);
	            stmt = con.createStatement();
	            System.out.println("���ݿ����ӳɹ�!"); 
	        } catch(SQLException e) {
	            System.out.println("���ݿ�����ʧ��!"); 
	        }
	    }
	    public static void select(String sql) {
	        try {
	            rs = stmt.executeQuery(sql);
	            ResultSetMetaData meta_data = rs.getMetaData();//����
	            for (int i_col = 1; i_col <= meta_data.getColumnCount(); i_col++) {
	                System.out.print(meta_data.getColumnLabel(i_col) + "   ");
	            }
	            System.out.println();
	            while (rs.next()) {
	                for (int i_col = 1; i_col <= meta_data.getColumnCount(); i_col++) {
	                    System.out.print(rs.getString(i_col) + "  ");
	                }
	                System.out.println();
	            }
	            rs.close();
	        }catch (Exception e) {
	            System.out.println("���ݲ�ѯʧ��!");
	        }
	    }
	    public static void insert(String sql) {
	        try {
	            stmt.clearBatch();
	            stmt.addBatch(sql);
	            stmt.executeBatch();
	            System.out.println("���ݲ���ɹ�!");
	        }catch (Exception e) {
	            System.out.println("���ݲ���ʧ��!");
	        }
	        
	    }
	    public static void update(String sql) {
	        try {
	            stmt.executeUpdate(sql);
	            System.out.println("���ݸ��³ɹ�!");
	        }catch (Exception e) {
	            System.out.println("���ݸ���ʧ��!");
	        }
	    }

}
