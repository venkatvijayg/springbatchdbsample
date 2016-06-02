package com.mkyong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.mkyong.model.Report;

public class ValidateLoadData {
//	public static void main(String[] args) {
//		ValidateLoadData loadData = new ValidateLoadData();
//		boolean foo = loadData.validateData();
//		System.exit(0);
//	}

	public List<Report> validateData() {
		List<String> sometxts = new ArrayList<>();
		List<String> errorlist = new ArrayList<>();
		String error = "";
		int rowCount = 0;
		String data = "";
		// ErrorList error= new ErrorList();

		
		File dir = new File("D:\\Dataload");
		File[] files = dir.listFiles();
		
		Report report;
		List<Report> listOfReports = new Vector<Report>();
		
		for (File file : files) {
			// System.out.println("file = "+file.getAbsolutePath() );
			report = new Report();
			
			try {
				BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()));
				
				while ((data = br.readLine()) != null) {					
					if (rowCount <= 5) {
						rowCount++;
						continue;
					}
					// String rowData = "||test1|test2|test3|test4|";
					// String[] rows = rowData.split("\\|");
					String[] tokenize = data.split("\\|");
					
					if (tokenize.length < 10) {
						continue;
					}
					String tempTxt0 = tokenize[0];
					String tempTxt1 = tokenize[1];
					String tempTxt2 = tokenize[2];
					String tempTxt3 = tokenize[3];
					String tempTxt4 = tokenize[4];
					String tempTxt5 = tokenize[5];
					String tempTxt6 = tokenize[6];
					String tempTxt7 = tokenize[7];
					String tempTxt8 = tokenize[8];
					String tempTxt9 = tokenize[9];

					if (tempTxt0 == "" || tempTxt0 == null || tempTxt1 == "" || tempTxt1 == null || tempTxt3 == ""
							|| tempTxt3 == null || tempTxt4 == "" || tempTxt4 == null || tempTxt5 == ""
							|| tempTxt5 == null || tempTxt6 == "" || tempTxt6 == null || tempTxt7 == ""
							|| tempTxt7 == null || tempTxt8 == "" || tempTxt8 == null || tempTxt9 == ""
							|| tempTxt9 == null) {

						error = error + data;
						errorlist.add(error);

					} else {
						System.out.println("Tmp0: " +tempTxt0);
						System.out.println("Tmp1: " +tempTxt1);
						System.out.println("Tmp2: " +tempTxt2);
						System.out.println("Tmp3: " +tempTxt3);
						System.out.println("Tmp4: " +tempTxt4);
						System.out.println("Tmp5: " +tempTxt5);
						System.out.println("Tmp6: " +tempTxt6);
						System.out.println("Tmp7: " +tempTxt7);
						System.out.println("Tmp8: " +tempTxt8);
						System.out.println("Tmp9: " +tempTxt9);
						
						tempTxt0=String.valueOf(rowCount);
						tempTxt1="1";
						sometxts.add(tempTxt0);
						sometxts.add(tempTxt1);
						sometxts.add(tempTxt2);
						//report.setCreate_dt(tempTxt2);
						sometxts.add(tempTxt3);
						sometxts.add(tempTxt4);
						sometxts.add(tempTxt5);
						sometxts.add(tempTxt6);
						sometxts.add(tempTxt7);
						sometxts.add(tempTxt8);
						sometxts.add(tempTxt9);

					}
					listOfReports.add(report);
					data = br.readLine();
					rowCount++;
				}
				br.close();

			} catch (FileNotFoundException fnf) {
				System.out.println(fnf);

			} catch (IOException ioe) {
				System.out.println("I/O error..");
			}

			for (String each : sometxts) {
				System.out.println("====================");
				System.out.println(each);
				System.out.println();
			}
		}
		return listOfReports;

	}

}
