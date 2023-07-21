package com.trantanphong.controller;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.trantanphong.dto.ProductDTO;
import com.trantanphong.service.ProductService;

@RestController
@CrossOrigin(
	    origins = "http://localhost:3000",
	    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
	    allowedHeaders = "*",
	    allowCredentials = "true")
@RequestMapping("/admin")
public class AdminProductController {
	@Autowired
	private ProductService productService;
	private org.slf4j.Logger logger = LoggerFactory.getLogger(AdminProductController.class);

	// Sản phẩm
	@GetMapping("/admin/product")
	public List<ProductDTO> getAllProductAdmin() {
		return productService.getAllProduct();
	}
	
	@CrossOrigin(
		    origins = "http://localhost:3000",
		    methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE},
		    allowedHeaders = "*",
		    allowCredentials = "true")
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Access-Control-Allow-Origin", 
	      "*");
	    responseHeaders.set("Access-Control-Allow-Headers", 
	  	      "Origin, X-Requested-With, Content-Type, Accept");
		return ResponseEntity.ok().headers(responseHeaders).body("OK");
	}
	
	@PostMapping("/admin/product")
	public ProductDTO addProduct(@RequestBody ProductDTO model) {
		return productService.save(model);
	}
	
	@PutMapping("/admin/product/{id}")
	public ProductDTO updateProduct(@RequestBody ProductDTO model, @PathVariable("id") long id) {
		return productService.save(model);
	}
	
	@DeleteMapping("/admin/product/{id}")
	public void deteleProduct(@PathVariable("id") long id) {
		productService.delete(id);
	}
	
	
}
