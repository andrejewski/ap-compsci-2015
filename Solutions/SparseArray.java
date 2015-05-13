
import java.util.List;
import java.util.ArrayList;

/*
	Question 3

	Variables and methods provided by the exam 
	unless otherwise specified.
*/
public class SparseArray {

	private int numRows;
	private int numCols;
	private List<SparseArrayEntry> entries;

	public SparseArray() {
		entries = new ArrayList<SparseArrayEntry>();
	}

	/*
		This method was not provided, but is needed
		for a proper intialization and later testing.
	*/
	public SparseArray(int r, int c, List<SparseArrayEntry> list) {
		numRows = r;
		numCols = c;
		entries = list;
	}

	public int getNumRows() {
		return numRows;
	}

	public int getNumCols() {
		return numCols;
	}

	/*
		Again, not provided but needed for testing.
	*/
	public List<SparseArrayEntry> getEntries() {
		return entries;
	}

	/*
		Part A:
		Returns the value of the element at row index row and column index col in the sparse array.
		
		Precondition: 	0 < row < getNumRows()
						0 < col < getNumCols()
	*/
	public int getValueAt(int row, int col) {
		for(SparseArrayEntry entry : entries) {
			if(row == entry.getRow() && col == entry.getCol()) {
				return entry.getValue();
			}
		}
		return 0;
	}

	/*
		Part B:
		Removes the column col from the sparse array. 

		Precondition: 	0 < col < getNumCols()

		=== Chris's considerations:
		Note: Iteration should not be done with an 
		enhanced for-loop because of the removal.

		Advanced note: An Iterator cannot be used
		as some entries need to be replaced; they
		cannot be mutated as there is no
		SparseArrayEntry.setCol(int) method.
	*/
	public void removeColumn(int col) {
		List<SparseArrayEntry> list = new ArrayList<SparseArrayEntry>();
		for(int i = 0; i < entries.size(); i++) {
			SparseArrayEntry entry = entries.get(i);
			int c = entry.getCol();
			if(c > col) {
				list.add(new SparseArrayEntry(entry.getRow(), c - 1, entry.getValue()));
			} else if(c < col) {
				list.add(entry);
			}
		}
		numCols--;
		entries = list;
	}

}
