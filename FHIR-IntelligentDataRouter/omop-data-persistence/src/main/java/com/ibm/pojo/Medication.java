package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/*
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents medication data.
 *
 */
public class Medication {

	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
