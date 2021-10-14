package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the Diagnostics module 
 * and the specimen context of FHIR. It has been augmented to support additional needed attributes. 
 * It can also be further augmented to support additional needs.
 *
 *
 */
public class Specimen {

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
