import java.sql.ResultSet;

public class situacaoMatricula {
	public static void main(String[] args) {
		conexao con = new conexao();	
		String sql = "select * from situa��omatricula ";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				String situa��o = rs.getString("situa��o");
				String codaluno = rs.getString("codaluno");
			System.out.println("Situa��o Matricula-" + situa��o+ "/" +"Codigo do aluno- " + codaluno);
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
}
}

