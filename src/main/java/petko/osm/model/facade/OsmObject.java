/**************************************************************************
 OSMemory library for OSM data processing.

 Copyright (C) 2014 Aleś Bułojčyk <alex73mail@gmail.com>

 This is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This software is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package petko.osm.model.facade;

import java.util.Date;
import java.util.List;

/**
 * Base interface for all OSM object.
 * 
 * Tag keys stored and processed as index instead string value.
 */
public interface OsmObject {
	/**
	 * Object ID.
	 */
	Long getId();

	Long getUid();

	String getUser();

	Boolean isVisible();

	Long getVersion();

	Long getChangeset();

	List<OsmTag> getTags();

	Date getTimestamp();

	/**
	 * Get tag value. This operation is much slower than
	 * {@link #getTagValue(short)}.
	 */
	String getTagValue(String tagName);

	OSMObjectType getType();
}