package com.accenture.oldmigrationdataview.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.oldmigrationdataview.domain.SystemVersionMaster;
import com.accenture.oldmigrationdataview.service.SystemVersionMasterService;

@RestController
@RequestMapping("api/SystemVersionMaster")
public class SystemVersionRestController {

	@Autowired
	SystemVersionMasterService service;
	
	@RequestMapping(method = RequestMethod.GET)
	List<SystemVersionMaster> getChatRooms() {
		return service.findAll();
	}

}
