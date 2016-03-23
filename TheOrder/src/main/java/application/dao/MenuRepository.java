package application.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import application.vo.Menu;

public interface MenuRepository extends CrudRepository<Menu, Integer>{
	List<Menu> findAll();
}