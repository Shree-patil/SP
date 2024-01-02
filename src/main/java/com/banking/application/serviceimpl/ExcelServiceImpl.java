/**
 * 
 */
package com.banking.application.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.application.model.BankDetails;
import com.banking.application.repository.BankRepository;
import com.banking.application.service.ExcelService;

/**
 * 
 */
@Service
public class ExcelServiceImpl implements ExcelService {
	@Autowired
	BankRepository bankRepository;

	@Override
	public void readExcel(String sheetName, String fileName, String path) throws IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		File file = new File(path.concat("\\").concat(fileName));
		FileInputStream fileInputStream = new FileInputStream(file);
		String extention = fileName.substring(fileName.indexOf("."));
		if (extention.equalsIgnoreCase(".xls") || extention.equalsIgnoreCase(".xlsx")) {
			Workbook workbook = new XSSFWorkbook(file);
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
			if (sheet == null) {
				System.out.println("provided file is not have sheet : " + sheetName);
			}
			List<BankDetails> bankDetails = new ArrayList();
			DataFormatter dataFormatter = new DataFormatter();
			for (int n = 1; n < ((org.apache.poi.ss.usermodel.Sheet) sheet).getPhysicalNumberOfRows(); n++) {
		        Row row = ((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(n);
		        BankDetails bankDet = new BankDetails();
		        int i = row.getFirstCellNum();
		        bankDet.setBankName(dataFormatter.formatCellValue(row.getCell(++i)));
		        bankDet.setBranch(dataFormatter.formatCellValue(row.getCell(++i)));
		        bankDet.setIfsc(dataFormatter.formatCellValue(row.getCell(++i)));
		        bankDetails.add(bankDet);
			}
			System.out.println("bankDetails size : "+bankDetails.size());
			bankRepository.saveAll(bankDetails);

		} else {
			System.out.println("provided file is not an Excel");
		}

	}

	@Override
	public void writeExcel(String sheetName, String fileName, String path, List<String> data) {
		// TODO Auto-generated method stub

	}

}
