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
 * A Polygon is defined by an outer boundary and 0 or more inner boundaries. The boundaries, in turn, are defined by LinearRings. When a Polygon is extruded, its boundaries are connected to the ground to form additional polygons, which gives the appearance of a building or a box. Extruded Polygons use {@link PolyStyle} for their color, color mode, and fill.
 * 
 * The coordinates for polygons must be specified in counterclockwise order. Polygons follow the "right-hand rule," which states that if you place the fingers of your right hand in the direction in which the coordinates are specified, your thumb points in the general direction of the geometric normal for the polygon. (In 3D graphics, the geometric normal is used for lighting and points away from the front face of the polygon.) Since Google Earth fills only the front face of polygons, you will achieve the desired effect only when the coordinates are specified in the proper order. Otherwise, the polygon will be gray.
 */
public class Polygon extends Geometry {

	/** The extrude. */
	@Element(required=false)
	private Integer extrude;

	/** The tessellate. */
	@Element(required=false)
	private Integer tessellate;

	/** The altitude mode. */
	@Element(required=false)
	private String altitudeMode;
	
	/** The outer boundary is. */
	@Element(required=true)
	private Boundary outerBoundaryIs;

	/** The inner boundary is. */
	@Element(required=false)
	private Boundary innerBoundaryIs;

	/**
	 * Gets the extrude.
	 *
	 * @return the extrude
	 */
	public Integer getExtrude() {
		return extrude;
	}

	/**
	 * Sets the extrude.
	 *
	 * @param extrude the new extrude
	 */
	public void setExtrude(Integer extrude) {
		this.extrude = extrude;
	}

	/**
	 * Gets the tessellate.
	 *
	 * @return the tessellate
	 */
	public Integer getTessellate() {
		return tessellate;
	}

	/**
	 * Sets the tessellate.
	 *
	 * @param tessellate the new tessellate
	 */
	public void setTessellate(Integer tessellate) {
		this.tessellate = tessellate;
	}

	/**
	 * Gets the altitude mode.
	 *
	 * @return the altitude mode
	 */
	public String getAltitudeMode() {
		return altitudeMode;
	}

	/**
	 * Sets the altitude mode.
	 *
	 * @param altitudeMode the new altitude mode
	 */
	public void setAltitudeMode(String altitudeMode) {
		this.altitudeMode = altitudeMode;
	}

	/**
	 * Gets the outer boundary is.
	 *
	 * @return the outer boundary is
	 */
	public Boundary getOuterBoundaryIs() {
		return outerBoundaryIs;
	}

	/**
	 * Sets the outer boundary is.
	 *
	 * @param outerBoundaryIs the new outer boundary is
	 */
	public void setOuterBoundaryIs(Boundary outerBoundaryIs) {
		this.outerBoundaryIs = outerBoundaryIs;
	}

	/**
	 * Gets the inner boundary is.
	 *
	 * @return the inner boundary is
	 */
	public Boundary getInnerBoundaryIs() {
		return innerBoundaryIs;
	}

	/**
	 * Sets the inner boundary is.
	 *
	 * @param innerBoundaryIs the new inner boundary is
	 */
	public void setInnerBoundaryIs(Boundary innerBoundaryIs) {
		this.innerBoundaryIs = innerBoundaryIs;
	}
}
