package com.trantanphong.service.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trantanphong.convert.StaffConvert;
import com.trantanphong.dto.StaffDTO;
import com.trantanphong.entity.Staff;
import com.trantanphong.repository.StaffRepository;
import com.trantanphong.service.StaffService;

@Service
public class StaffServiceImplement implements StaffService{

	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private StaffConvert staffConvert;
	
	@Override
	public List<StaffDTO> getAllSatff() {
		// TODO Auto-generated method stub
		List<StaffDTO> staffDTOs = new ArrayList<StaffDTO>();
		List<Staff> staffs = staffRepository.findAll();
		for (Staff staff : staffs) {
			staffDTOs.add(staffConvert.toDTO(staff));
		}
		return staffDTOs;
	}

	@Override
	public StaffDTO save(StaffDTO newDto) {
		// TODO Auto-generated method stub
		Staff newEntity = new Staff();
		if(newDto.getId() != null)
		{
			Staff oldEntity = staffRepository.findById(newDto.getId()).orElse(null);
			newEntity = staffConvert.toEntity(newDto, oldEntity);
		}
		else
		{
			newEntity = staffConvert.toEntity(newDto);
		}
		return staffConvert.toDTO(staffRepository.save(newEntity));
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		staffRepository.deleteById(id);
	}

}
