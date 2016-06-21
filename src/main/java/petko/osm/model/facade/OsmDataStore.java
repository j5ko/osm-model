package petko.osm.model.facade;

import java.util.List;

public interface OsmDataStore {

	public List<OsmNode> getNodes();

	public List<OsmRelation> getRelations();

	public List<OsmWay> getWays();

}