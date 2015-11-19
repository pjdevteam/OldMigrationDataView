package com.accenture.oldmigrationdataview.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.oldmigrationdataview.domain.MigrationHistory;
import com.accenture.oldmigrationdataview.service.MigrationHistoryService;

@RestController
@RequestMapping("api/SearchMigrationHistory")
public class SearchMigrationHistoryRestController {

	@Autowired
	MigrationHistoryService service;
	
//	
//	//全件取得不可
//	@RequestMapping(method = RequestMethod.GET)
//	List<MigrationHistory> getAllMigrations() {
//			return null;
//	}
	
//	@RequestMapping(value = "{resourceNumber}", method = RequestMethod.GET)
//	List<MigrationHistory> getMigrationByResourceNumber(@PathVariable("resourceNumber") Long resourceNumber) {
//		return service.findByResourceNumber(resourceNumber);
//	}
	
	@RequestMapping(method = RequestMethod.GET)
	List<MigrationHistory> getMigrationHistory(@RequestParam Map<String, String> queryParameters) {
		//デバッグ用
		System.out.println(queryParameters);
		//移管申請#
		//使用例:http://localhost:8080/api/SearchMigrationHistory/?applyNumber=13778
		if (queryParameters.containsKey("applyNumber") && 
				!queryParameters.get("applyNumber").isEmpty()){
			return service.findByApplyNumber(Long.valueOf(queryParameters.get("applyNumber")));
		}
		//リソース#
		//使用例:http://localhost:8080/api/SearchMigrationHistory/?resourceNumber=140901
		//※より検索優先度の高い検索項目(例:applyNumber)をクエリパラメータ内で先に記載してはならない
		else if (queryParameters.containsKey("resourceNumber") &&
				!queryParameters.get("resourceNumber").isEmpty()){
			return service.findByResourceNumber(Long.valueOf(queryParameters.get("resourceNumber")));
		}
		//移管申請者
		else if (queryParameters.containsKey("applyPerson") &&
				!queryParameters.get("applyPerson").isEmpty()){
			return service.findByApplyPerson(queryParameters.get("applyPerson"));
		}
		else {
			return null;
		}
	}
}
