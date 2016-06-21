package petko.osm.model.impl.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import petko.osm.model.facade.OSMObjectType;
import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmObject;
import petko.osm.model.facade.OsmRelation;
import petko.osm.model.facade.OsmWay;

public class OsmDataFilter {

	public static List<OsmNode> nodes(Collection<? extends OsmObject> osmData) {
		if (osmData != null) {
			List<OsmNode> res = new ArrayList<>();
			for (OsmObject iOsmObject : osmData) {
				if (iOsmObject.getType().equals(OSMObjectType.NODE)) {
					res.add((OsmNode) iOsmObject);
				}
			}
			return res;
		}
		return null;
	}

	public static List<OsmWay> ways(Collection<? extends OsmObject> osmData) {
		if (osmData != null) {
			List<OsmWay> res = new ArrayList<>();
			for (OsmObject iOsmObject : osmData) {
				if (iOsmObject.getType().equals(OSMObjectType.WAY)) {
					res.add((OsmWay) iOsmObject);
				}
			}
			return res;
		}
		return null;
	}

	public static List<OsmRelation> relations(Collection<? extends OsmObject> osmData) {
		if (osmData != null) {
			List<OsmRelation> res = new ArrayList<>();
			for (OsmObject iOsmObject : osmData) {
				if (iOsmObject.getType().equals(OSMObjectType.RELATION)) {
					res.add((OsmRelation) iOsmObject);
				}
			}
			return res;
		}
		return null;
	}
}