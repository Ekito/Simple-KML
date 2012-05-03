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

import org.simpleframework.xml.Element;

/**
 * Specifies the drawing style for all polygons, including polygon extrusions (which look like the walls of buildings) and line extrusions (which look like solid fences).
 */
public class PolyStyle extends ColorStyle {

	/** The fill. */
	@Element(required=false)
	private Integer fill;

	/** The outline. */
	@Element(required=false)
	private Integer outline;

	/**
	 * Gets the fill.
	 *
	 * @return the fill
	 */
	public Integer getFill() {
		return fill;
	}

	/**
	 * Sets the fill.
	 *
	 * @param fill the new fill
	 */
	public void setFill(Integer fill) {
		this.fill = fill;
	}

	/**
	 * Gets the outline.
	 *
	 * @return the outline
	 */
	public Integer getOutline() {
		return outline;
	}

	/**
	 * Sets the outline.
	 *
	 * @param outline the new outline
	 */
	public void setOutline(Integer outline) {
		this.outline = outline;
	}
}
