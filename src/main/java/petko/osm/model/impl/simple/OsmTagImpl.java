package petko.osm.model.impl.simple;

import petko.osm.model.facade.OsmTag;

public class OsmTagImpl implements OsmTag {
	private String key;
	private String value;

	public OsmTagImpl(String k, String v) {
		this.key = k;
		this.value = v;
	}

	@Override
	public String getKey() {
		return this.key;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}