package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.CustomerConvert;
import com.trantanphong.convert.CustomerTypeConvert;
import com.trantanphong.dto.CustomerTypeDTO;
import com.trantanphong.entity.CustomerType;
import com.trantanphong.repository.CustomerTypeRepository;
import com.trantanphong.service.CustomerTypeService;

@Service
public class CustomerTypeServiceImplement implements CustomerTypeService{

	@Autowired
	private CustomerTypeRepository customerTypeRepository;
	
	@Autowired
	private CustomerTypeConvert customerTypeConvert;
	
	@Override
	public List<CustomerTypeDTO> getAllTypeCustomer() {
		List<CustomerTypeDTO> customerTypeDTOs = new ArrayList<CustomerTypeDTO>();
		List<CustomerType> customerTypes = customerTypeRepository.findAll();
		for (CustomerType customerType : customerTypes) {
			customerTypeDTOs.add(customerTypeConvert.toDTO(customerType));
		}
 		return customerTypeDTOs;
	}

	@Override
	public CustomerTypeDTO save(CustomerTypeDTO newDTO) {
		// TODO Auto-generated method stub
		CustomerType newEntity = customerTypeConvert.toEntity(newDTO);
		return customerTypeConvert.toDTO(customerTypeRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		customerTypeRepository.deleteById(id);
		
	}

}
