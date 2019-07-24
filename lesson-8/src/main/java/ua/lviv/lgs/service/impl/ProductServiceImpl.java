package ua.lviv.lgs.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import ua.lviv.lgs.dao.ProductDao;
import ua.lviv.lgs.dao.impl.ProductDaoImpl;
import ua.lviv.lgs.dao.service.ProductService;
import ua.lviv.lgs.domain.Product;

public class ProductServiceImpl implements ProductService {

	private static  ProductServiceImpl productServiceImpl;
	private ProductDao productDao;
	private static Logger LOGGER = Logger.getLogger(ProductServiceImpl.class);

	private ProductServiceImpl() {
		try {
			productDao = new ProductDaoImpl();
		} catch (InstantiationException e) {
			LOGGER.error(e);
		} catch (IllegalAccessException e) {
			LOGGER.error(e);
		} catch (ClassNotFoundException e) {
			LOGGER.error(e);
		} catch (SQLException e) {
			LOGGER.error(e);
		}
	}
	
	public static ProductService getProductService() {
		if(productServiceImpl == null) {
			productServiceImpl = new ProductServiceImpl();
		}
		return productServiceImpl;
	}

	@Override
	public Product create(Product t) {
		return productDao.create(t);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		return productDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}
}
