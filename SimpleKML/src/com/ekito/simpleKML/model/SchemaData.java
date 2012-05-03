/**
 * Copyright 2012 Ekito - http://www.ekito.fr/
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ekito.simpleKML.model;

import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

/**
 * This element is used in conjunction with {@link Schema} to add typed custom data to a KML Feature. The Schema element (identified by the schemaUrl attribute) declares the custom data type. The actual data objects ("instances" of the custom data) are defined using the SchemaData element.
 * The schemaURL can be a full URL, a reference to a Schema ID defined in an external KML file, or a reference to a Schema ID defined in the same KML file.
 */
public class SchemaData {

	/** The schema url. */
	@Attribute(required=false)
	private String schemaUrl;

	/** The simple data list. */
	@ElementList(entry="SimpleData", inline=true, required=false)
	private List<SimpleData> simpleDataList;

	/**
	 * Gets the schema url.
	 *
	 * @return the schema url
	 */
	public String getSchemaUrl() {
		return schemaUrl;
	}

	/**
	 * Sets the schema url.
	 *
	 * @param schemaUrl the new schema url
	 */
	public void setSchemaUrl(String schemaUrl) {
		this.schemaUrl = schemaUrl;
	}

	/**
	 * Gets the simple data list.
	 *
	 * @return the simple data list
	 */
	public List<SimpleData> getSimpleDataList() {
		return simpleDataList;
	}

	/**
	 * Sets the simple data list.
	 *
	 * @param simpleDataList the new simple data list
	 */
	public void setSimpleDataList(List<SimpleData> simpleDataList) {
		this.simpleDataList = simpleDataList;
	}
}
