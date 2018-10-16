package co.sistemausuarios.dao;

import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import co.sistemausuarios.dto.UsuarioDTO;

public class UsuariosDAO extends BaseDAO{

	private Logger logger = Logger.getLogger(UsuariosDAO.class);
	
	/**
	 * Constructor.
	 * @param ds
	 * @author DEVELOP
	 */
	public UsuariosDAO(DataSource ds) {
		super(ds);
	}
	
	/**
	 * Metodo de registro de usuarios nuevos en la base de datos.
	 * @param usuario
	 * @return
	 * @throws Exception
	 * @author DEVELOP
	 */
	public Integer createUser(UsuarioDTO usuario) throws Exception{
		Integer resultado = 0;
		StringBuffer sql = new StringBuffer();
		int c=1;
		
		try{
			sql.append("INSERT INTO USUARIOS");
			sql.append(" (");
			sql.append(" nombre, apellidos, nacionalidad, idtipoidentificacion, identificacion,");
			sql.append(" email, telefono, observacion, fechacreacion, idusuariocrea, estado");
			sql.append(" )");
			sql.append(" VALUES");
			sql.append(" (");
			sql.append(" ?, ?, ?, ?, ?,");
			sql.append(" ?, ?, ?, now(), ?, ?");
			sql.append(" )");
			
			con = ds.getConnection();
			ps = con.prepareStatement(sql.toString(), Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(c++, usuario.getNombre());
			ps.setString(c++, usuario.getApellidos());
			ps.setString(c++, usuario.getNacionalidad());
			ps.setInt(c++, usuario.getIdtipoidentificacion());
			ps.setString(c++, usuario.getIdentificacion());
			ps.setString(c++, usuario.getEmail());
			ps.setString(c++, usuario.getTelefono());
			ps.setString(c++, usuario.getObservacion());
			ps.setInt(c++, usuario.getUsuariocreacion());
			ps.setInt(c++, usuario.getEstado());
			
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			
			if(rs.next()){
				resultado = rs.getInt(1);
			} else {
				throw new SQLException("No se pudo registrar nuevo usuario en la Base de Datos.");
			}
			
			logger.info("Clase: UsuariosDAO Función: createUser Consulta: [" + sql.toString() + "]");
		} catch (SQLException e) {
			logger.error("Error SQL consultando tipo de dato Clase: UsuariosDAO Función: createUser " + "["+sql.toString()+"]", e);
			throw new SQLException("Error SQL consultando tipo de dato Clase: UsuariosDAO Función: createUser " + "["+sql.toString()+"]", e);
		} catch (Exception e) {
			logger.error("Error consultando tipo de dato Clase: UsuariosDAO Función: createUser", e);
			throw new Exception(e.toString(), e.getCause());
		} finally {
			closeConexion();
			logger.info("FIN Clase: UsuariosDAO Función: createUser");
		}
		return resultado;
	}
}