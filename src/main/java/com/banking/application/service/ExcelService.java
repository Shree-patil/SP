/**
 * 
 */
package com.banking.application.service;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/**
 * 
 */
@Component
public interface ExcelService {
	
	void readExcel(String sheetName,String fileName,String path) throws IOException,InvalidFormatException;
	void writeExcel(String sheetName,String fileName,String path,List<String> data);

}
