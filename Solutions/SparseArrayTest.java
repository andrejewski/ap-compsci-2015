
import java.util.ArrayList;

public class SparseArrayTest {
	public static void main(String[] args) {

		// Part A: int getValueAt(int, int)
		SparseArrayEntry e1 = new SparseArrayEntry(2,3,4);
		ArrayList<SparseArrayEntry> es = new ArrayList<SparseArrayEntry>();
		es.add(e1);
		SparseArray array = new SparseArray(4,4,es);

		Assert.equal(0, array.getValueAt(1,1));
		Assert.equal(0, array.getValueAt(3,3));
		Assert.equal(4, array.getValueAt(2,3));

		// Part B: void removeColumn(int)
		SparseArrayEntry e_c1 = new SparseArrayEntry(4, 1, 5);
		SparseArrayEntry e_c2 = new SparseArrayEntry(2, 2, 3);
		SparseArrayEntry e_c3 = new SparseArrayEntry(1, 3, 8);

		ArrayList<SparseArrayEntry> e_cs = new ArrayList<SparseArrayEntry>();
		e_cs.add(e_c1);
		e_cs.add(e_c2);
		e_cs.add(e_c3);

		SparseArray mat = new SparseArray(5,5, e_cs);

		Assert.equal(5, mat.getNumCols());
		Assert.equal(3, mat.getEntries().size());
		Assert.equal(3, mat.getValueAt(2,2));
		Assert.equal(8, mat.getValueAt(1,3));
		Assert.equal(0, mat.getValueAt(1,2));

		mat.removeColumn(2);

		// number of columns should have decremented
		Assert.equal(4, mat.getNumCols());

		// number of entries should have decremented
		// as the removed column had one entry
		Assert.equal(2, mat.getEntries().size());

		// (2,2) should be gone
		Assert.equal(0, mat.getValueAt(2,2));
		
		// (1,3) should have shifted to (1,2)
		Assert.equal(0, mat.getValueAt(1,3));
		Assert.equal(8, mat.getValueAt(1,2));

	}
}
