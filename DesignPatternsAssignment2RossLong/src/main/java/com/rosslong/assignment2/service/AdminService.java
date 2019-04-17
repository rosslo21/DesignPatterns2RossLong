package com.rosslong.assignment2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosslong.assignment2.model.Admin;
import com.rosslong.assignment2.model.Customer;
import com.rosslong.assignment2.repository.AdminRepository;
import com.rosslong.assignment2.repository.CustomerRepository;


	@Service
	public class AdminService {
		
		@Autowired
		private AdminRepository adminRepository;

		public List<Admin> getAllAdmins(){
			List<Admin> admins = new ArrayList<>();
			adminRepository.findAll()
			.forEach(admins::add);
			return admins;
			
		}

		public Admin addAdmin(Admin admin) {
			return adminRepository.save(admin);
		}

		public Admin getAdmin(Admin admin) {
			List<Admin> admins = getAllAdmins();
			for(Admin c : admins) {
				
				if(c.getEmail().equals(admin.getEmail()) && c.getPassword().equals(admin.getPassword())){
					return c;
					
				}
			}
			
			return new Admin();
		}
	}
	
