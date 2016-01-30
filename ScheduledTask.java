package com.poc.dao.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {

	@Override
	public void run() {
		File folder = new File("/Users/MAVJAY/DocumentsMavJay/Current/Bezz");
		File[] listOfFiles = folder.listFiles();
		HashMap<Long, Object> fileslist=new HashMap<Long ,Object>();
		int k=1;
		ArrayList<Long> date=new ArrayList<>();
		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	  String filename = listOfFiles[i].getName();
		    	  String extension = filename.substring(filename.lastIndexOf(".") + 1, filename.length());
		    	  if(extension.equals("txt")){
		    		  fileslist.put(listOfFiles[i].lastModified(),listOfFiles[i].getName()+" size "+listOfFiles[i].getTotalSpace());
		    		  date.add(listOfFiles[i].lastModified());
		    	  }
		      } 
		    }
		    Collections.sort(date);
		    for (Long long1 : date) {
		    	if(k==5)
		    		break;
				System.out.println(fileslist.get(long1));
		    	k++;
			}
	}

}
