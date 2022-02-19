import java.sql.ResultSet;

public class matricula {

	public static void main(String[] args) {
		conexao con = new conexao();	
		String sql = "select * from matricula ";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				String matricula = rs.getString("matricula");
				String codaluno = rs.getString("codaluno");
			System.out.println("Matricula-" + matricula+ "/" +"Codigo do aluno- " + codaluno);
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
}
}