package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.CustomerConvert;
import com.trantanphong.dto.CustomerDTO;
import com.trantanphong.entity.Customer;
import com.trantanphong.repository.CustomerRepository;
import com.trantanphong.repository.CustomerTypeRepository;
import com.trantanphong.service.CustomerService;

@Service
public class CustomerServiceImplement implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerConvert customerConvert;
	
	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> customers = customerRepository.findAll();
		List<CustomerDTO> customerDTOs = new ArrayList<CustomerDTO>();
		for (Customer customer : customers) {
			customerDTOs.add(customerConvert.toDTO(customer));
		}
		return customerDTOs;
	}

	@Override
	public CustomerDTO save(CustomerDTO customerDTO) {
		Customer newEntity = customerConvert.toEnity(customerDTO);
		return customerConvert.toDTO(customerRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}
	
}
