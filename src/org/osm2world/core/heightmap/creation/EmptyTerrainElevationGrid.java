package org.osm2world.core.heightmap.creation;

import org.osm2world.core.heightmap.data.AbstractCellularTerrainElevation;
import org.osm2world.core.math.AxisAlignedBoundingBoxXZ;
import org.osm2world.core.math.VectorXZ;

public class EmptyTerrainElevationGrid extends
		AbstractCellularTerrainElevation {
	
	public EmptyTerrainElevationGrid(AxisAlignedBoundingBoxXZ bounds,
			int numPointsX, int numPointsZ) {
		super(bounds, numPointsX, numPointsZ);
	}
	
	@Override
	protected Float getElevation(VectorXZ pos) {
		return null;
	}
	
}
