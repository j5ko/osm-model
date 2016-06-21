package petko.osm.model.facade;

/**
 * OSM tag
 * 
 * @author 5ko
 *
 */
public interface OsmTag {
	/**
	 * Tag key
	 * 
	 * @return
	 */
	public String getKey();

	/**
	 * Tag value
	 * 
	 * @return
	 */
	public String getValue();
}