package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.ProductConvert;
import com.trantanphong.dto.ProductDTO;
import com.trantanphong.entity.Product;
import com.trantanphong.entity.TypeProduct;
import com.trantanphong.repository.BrandRepository;
import com.trantanphong.repository.ProductRepository;
import com.trantanphong.repository.TypeProductRepository;
import com.trantanphong.service.ProductService;

@Service
public class ProductServiceImplement implements ProductService {
	private org.slf4j.Logger logger = LoggerFactory.getLogger(ProductServiceImplement.class);
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private TypeProductRepository typeProductRepository;
	
	
	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private ProductConvert productConvert;
	
	@Override
	public List<ProductDTO> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
		int length = products.size();
		for(int i = 0; i < length; i++)
		{
			productDTOs.add(productConvert.toDTO(products.get(i)));
			logger.info("Đây là log" + productDTOs.toString());
		}
		return productDTOs;
	}

	@Override
	public ProductDTO save(ProductDTO newDTO) {
		Product newEntity = new Product();
		if(newDTO.getId() != null)
		{
			Product oldEntity = productRepository.findById(newDTO.getId()).orElse(null);
			newEntity = productConvert.toEntity(newDTO, oldEntity);
		}
		else
		{
			newEntity = productConvert.toEntity(newDTO);
		}
		return productConvert.toDTO(productRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
		productRepository.deleteById(id);
	}

	@Override
	public ProductDTO findByID(Long id) {
		// TODO Auto-generated method stub
		Product entity = productRepository.findById(id).orElse(null);
		return productConvert.toDTO(entity);
	}

	@Override
	public List<ProductDTO> getProductByTypeCode(String name) {
		// TODO Auto-generated method stub
		TypeProduct typeProduct = typeProductRepository.findByNameType(name);
		int length = typeProduct.getLisProducts().size();
		List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
		for (Product product : typeProduct.getLisProducts()) {
			productDTOs.add(productConvert.toDTO(product));
		}
 		return productDTOs;
	}

}
