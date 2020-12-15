package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	//declara uma dependencia DepartmentDao, ja injetando a dependencia usando o padrao Factory
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate(Department obj) {
		//se o id for igual a null, indica que é um novo departamento para  ser inserido no banco
		//caso já exista será atualizado o departamento com o mesmo id
		if (obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
}