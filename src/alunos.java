import java.sql.ResultSet;

public class alunos {

	public static void main(String[] args) {
		conexao con = new conexao();	
		String sql = "select * from alunos ";
		ResultSet rs = con.executaBusca(sql);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String disciplina = rs.getString("disciplina");
				String curso = rs.getString("curso");
			System.out.println(+id + "/" + " Nome-" + nome+ "/" +"disciplina- " + disciplina + "/" +"Curso- "+ curso);
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
}
	
}

