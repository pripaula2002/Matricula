import java.sql.ResultSet;

public class situacaoMatricula {
	public static void main(String[] args) {
		conexao con = new conexao();	
		String sql = "select * from situaçãomatricula ";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				String situação = rs.getString("situação");
				String codaluno = rs.getString("codaluno");
			System.out.println("Situação Matricula-" + situação+ "/" +"Codigo do aluno- " + codaluno);
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
}
}

