package org.cap.apps.customer.util;

import org.cap.apps.customer.exceptions.*;

public class ValidationUtil {

	public static void checkIdNotNull(Object id) {
		if (id == null) {
			throw new InvalidIdException("Id cannot be null");
		}
	}
	

	public static void checkName(String name) {
		if (name == null || name.isEmpty()) {
			throw new InvalidNameException("name is not valid");
		}

	}
	

	
	}


