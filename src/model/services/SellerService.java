package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	//declara uma dependencia SellerDao, ja injetando a dependencia usando o padrao Factory
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate(Seller obj) {
		//se o id for igual a null, indica que é um novo departamento para  ser inserido no banco
		//caso já exista será atualizado o departamento com o mesmo id
		if (obj.getId() == null) {
			dao.insert(obj);
		}else {
			dao.update(obj);
		}
	}
	
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}