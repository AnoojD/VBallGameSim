import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class CellHighlighterRenderer extends DefaultTableCellRenderer {
	private int num;
	private static final long serialVersionUID = 1L;

	public CellHighlighterRenderer(int number) {
		num = number;
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		if (row == num && column == 1) {
			setBackground(Color.YELLOW);
			setOpaque(true);
		} else {
			setBackground(table.getBackground());
			setOpaque(isSelected);
		}
		return this;
	}

}