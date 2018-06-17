/*
@project: Fresher41DN_BTJB_NuongNTK
@author: NuongNTK
@user: HCD-Fresher162
@date: Jun 18, 2018
@version: 
*/
package com.nuongntk.qluv;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate>{

	@Override
	public int compare(Candidate obj1, Candidate obj2) {
		int compare = Integer.valueOf(obj1.getCandidate_type()).compareTo(Integer.valueOf(obj2.getCandidate_type()));
		if (compare == 0) {
			int year1 =  Integer.parseInt(obj1.getBirthDay().substring(0,4));
			int year2 =  Integer.parseInt(obj2.getBirthDay().substring(0,4));
			return Integer.valueOf(year2).compareTo(Integer.valueOf(year1));
		}else {
			return compare;
		}
	}

}
