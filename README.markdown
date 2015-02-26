# WARNING : THIS PROJECT IS NO LONGER MAINTAINED

Feel free to fork it :-)

# Simple KML - A KML serializer for Android

Simple KML is a library based on [Simple XML framework](http://simple.sourceforge.net/) designed to serialize [KML](https://developers.google.com/kml/) files.

Current version of Simple KML is based on [KML 2.2 Standard](https://developers.google.com/kml/documentation/kmlreference).

## What is KML?

Following [Google introduction page](https://developers.google.com/kml/):

> KML is a file format used to display geographic data in an Earth browser, such as Google Earth, Google Maps, and Google Maps for mobile. You can create KML files to pinpoint locations, add image overlays, and expose rich data in new ways. KML is an international standard maintained by the [Open Geospatial Consortium, Inc. (OGC)](http://www.opengeospatial.org/standards/kml/).

## Why another parser?

As it is strongly supported by Google, we believe that KML will be widely implemented in the future on Android platform. Android developers should have a comfortable way to integrate KML data in their apps, that's why we built Simple KML.

Simple KML is not the first Java parser for KML. There are a few of them out there but none of them have these capacities:
- The libary is fully functional on Android
- It is based on latest version of KML reference (2.2)
- The parser is really easy to use

## How to use it?

Using Simple KML is straightforward. It is based on an Android library project. Import the library project in your eclipse workspace and reference it following [these steps](http://developer.android.com/guide/developing/projects/projects-eclipse.html#ReferencingLibraryProject).

To serialize a KML file, you will need to build either a File, an InputNode, an InputStream, a Reader or a String from it and use this method:

```kml = kmlSerializer.read(source);```

To deserialize an existing Kml Object to an KML output, you'll need to build either a File, an OutputNode, an OutputStream or a Writer and use this method:

```kml = kmlSerializer.read(kml, output);```

## What's next?

- We know Simple KML is currently at a very early stage and you might find a few issues parsing your KML files. Please post your issues on GitHub to make the project live.
- Serialization is currently not optimized and might take long time for some cases. We need to improve efficiency.
- We will work on a solution to easily build UI elements from a KML file.

## License

Copyright 2012 Ekito - http://www.ekito.fr/
 
Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
