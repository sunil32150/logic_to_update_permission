package com.lauramac.biz.config.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> existingModuleIds = new ArrayList<Integer>();
		existingModuleIds.add(1);
		existingModuleIds.add(3);
		existingModuleIds.add(5);
		existingModuleIds.add(7);
		existingModuleIds.add(10);
		existingModuleIds.add(11);
		existingModuleIds.add(12);
		existingModuleIds.add(13);
		List<Integer> permissbleModuleIds = new ArrayList<Integer>();
		permissbleModuleIds.add(1);
		permissbleModuleIds.add(3);
		permissbleModuleIds.add(5);
		permissbleModuleIds.add(7);
		permissbleModuleIds.add(8);
		permissbleModuleIds.add(9);
		permissbleModuleIds.add(12);
		permissbleModuleIds.add(13);
		List<Integer> toBeDeletedPermission = existingModuleIds.stream().filter(data-> !permissbleModuleIds.contains(data)).collect(Collectors.toList());			
		List<Integer> toBeAddedPermission = permissbleModuleIds.stream().filter(data-> !existingModuleIds.contains(data)).collect(Collectors.toList());			
		System.out.println("toBeDeletedPermission  "+ toBeDeletedPermission.toString());
		System.out.println("toBeAddedPermission   "+ toBeAddedPermission.toString());
	}
}
//output
// toBeDeletedPermission  [10, 11] - now you can delete this reocrd from system
// toBeAddedPermission   [8, 9] - now you can add this new reocrds


