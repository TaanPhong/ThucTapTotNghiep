package com.trantanphong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trantanphong.dto.StaffDTO;
import com.trantanphong.service.StaffService;

@RestController
public class AdminStaffController {
	@Autowired
	private StaffService staffService;
	
	@GetMapping("/admin/staff")
	public List<StaffDTO> getAllStaffAdmin(){
		return staffService.getAllSatff();
	}
	
	@PostMapping("/admin/staff")
	public StaffDTO addSatff(@RequestBody StaffDTO model)
	{
		return staffService.save(model);
	}
	
	@PutMapping("/admin/staff/{id}")
	public StaffDTO updateStaff(@RequestBody StaffDTO model, @PathVariable long id)
	{
		return staffService.save(model);
	}
	
	@DeleteMapping("/admin/staff/{id}")
	public void deletetaff(@PathVariable long id) {
		staffService.delete(id);
	}
}
