package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInCollection {

	private String userName;
	private String userRole;

	public PredicateInCollection(String userName, String userRole) {
		super();
		this.userName = userName;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "PredicateInCollection [userName=" + userName + ", userRole=" + userRole + "]";
	}

	public static void main(String[] args) {

		List<PredicateInCollection> userList = new ArrayList<PredicateInCollection>();
		userList.add(new PredicateInCollection("edf", "admin"));
		userList.add(new PredicateInCollection("abc", "superUser"));
		userList.add(new PredicateInCollection("kgf", "normalUser"));
		userList.add(new PredicateInCollection("xyz", "permittedUser"));
		userList.add(new PredicateInCollection("prakhar", "admin"));
		System.out.println("UnFilter Result = "+ userList);
		List list = filterUserandRole(userList,(PredicateInCollection p) -> p.getUserRole().equalsIgnoreCase("admin"));
		System.out.println("Final Result = "+ list);
		// Same () is achieved by Stream
		List admins = userList.stream() 
			    .filter((user) -> user.getUserRole().equalsIgnoreCase("admin")) 
			    .collect(Collectors.toList()); 
			          
		System.out.println("Using Fileter () "+admins); 
		
	}
	
	public static List<PredicateInCollection> filterUserandRole(List<PredicateInCollection> list,Predicate<PredicateInCollection> predicate) {
		List<PredicateInCollection> result = new ArrayList<PredicateInCollection>();
		for(PredicateInCollection a : list ) {
			if(predicate.test(a))
				result.add(a);
		}
		return result;
	}
}
