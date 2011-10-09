package com.stripe.model;

import java.lang.reflect.Field;

public abstract class StripeObject {
	
	// only for debugging
	@Override public String toString() {
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		
		result.append( this.getClass().getName() );
		result.append( " Object {" );
		result.append(newLine);

		//determine fields declared in this class only (no fields of superclass)
		Field[] fields = this.getClass().getDeclaredFields();

		for ( Field field : fields) {
			result.append("  ");
			try {
				result.append(field.getName());
				result.append(": ");
				//requires access to private field:
				result.append(field.get(this));
			}
			catch (IllegalAccessException ex) {
				System.out.println(ex);
			}
			result.append(newLine);
		}
		result.append("}");
		return result.toString();
	}
}