package petko.osm.model.impl.simple;

import java.util.List;

import petko.osm.model.facade.OsmDataStore;
import petko.osm.model.facade.OsmNode;
import petko.osm.model.facade.OsmRelation;
import petko.osm.model.facade.OsmWay;

public class OsmDataStoreImpl implements OsmDataStore {
	private List<OsmNode> nodes;
	private List<OsmWay> ways;
	private List<OsmRelation> relations;

	public OsmDataStoreImpl(List<OsmNode> n, List<OsmWay> w, List<OsmRelation> r) {
		this.nodes = n;
		this.ways = w;
		this.relations = r;
	}

	@Override
	public List<OsmNode> getNodes() {
		return this.nodes;
	}

	@Override
	public List<OsmRelation> getRelations() {
		return this.relations;
	}

	@Override
	public List<OsmWay> getWays() {
		return this.ways;
	}
}