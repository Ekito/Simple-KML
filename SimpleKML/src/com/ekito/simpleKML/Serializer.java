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
package com.ekito.simpleKML;

import java.io.InputStream;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.Matcher;
import org.simpleframework.xml.transform.Transform;

import com.ekito.simpleKML.model.Coordinate;
import com.ekito.simpleKML.model.Coordinates;
import com.ekito.simpleKML.model.Kml;

/**
 * The Serializer interface is used to represent objects that can serialize objects from KML. This exposes one read method that can read from one source (more features are coming).
 */
public class Serializer {

	/**
	 * This read method will read the contents of the XML document from the provided source and populate the object with the values deserialized.
	 *
	 * @param is the is
	 * @return the kml
	 * @throws Exception the exception
	 */
	public Kml read(InputStream is) throws Exception {
		org.simpleframework.xml.Serializer serializer = new Persister(new KMLMatcher());
		
		Kml kml = serializer.read(Kml.class, is, false);
		return kml;
	}

	/**
	 * The Class KMLMatcher.
	 */
	private class KMLMatcher implements Matcher {

		/* (non-Javadoc)
		 * @see org.simpleframework.xml.transform.Matcher#match(java.lang.Class)
		 */
		@SuppressWarnings("rawtypes")
		@Override
		public Transform<?> match(Class type) throws Exception {
			if (type.equals(Coordinate.class))			return new CoordinateTransformer();
			else if (type.equals(Coordinates.class))	return new CoordinatesTransformer();
			return null;
		}
		
		/**
		 * The Class CoordinateTransformer.
		 */
		public class CoordinateTransformer implements Transform<Coordinate> {
			
			/* (non-Javadoc)
			 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
			 */
			@Override
			public Coordinate read(String value) throws Exception {
				return new Coordinate(value);
			}
			
			/* (non-Javadoc)
			 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
			 */
			@Override
			public String write(Coordinate value) throws Exception {
				return value.toString();
			}
		}

		/**
		 * The Class CoordinatesTransformer.
		 */
		public class CoordinatesTransformer implements Transform<Coordinates> {
			
			/* (non-Javadoc)
			 * @see org.simpleframework.xml.transform.Transform#read(java.lang.String)
			 */
			@Override
			public Coordinates read(String value) throws Exception {
				return new Coordinates(value);
			}
			
			/* (non-Javadoc)
			 * @see org.simpleframework.xml.transform.Transform#write(java.lang.Object)
			 */
			@Override
			public String write(Coordinates value) throws Exception {
				return value.toString();
			}
		}
	}
}
