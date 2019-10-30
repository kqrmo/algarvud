/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algarvudUI;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karmo.tutk
 */
class MyTableModel extends DefaultTableModel {
    String[] header;
    List<String[]> data = new ArrayList<>();
    
    public MyTableModel(String[] header, List<String[]> data) {
        this.header = header;
        this.data = data;
        
        for (String head : header) {
            addColumn(head);
        }
        
        for (int i = 0; i < data.size(); i++) {
            addRow(data.get(i));
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        return super.getValueAt(row, column);
    }
    
    @Override
    public String getColumnName(int column) {
        return super.getColumnName(column);
    }
    
    @Override
    public int getColumnCount() {
        return super.getColumnCount();
    }
    
    @Override
    public int getRowCount() {
        return super.getRowCount();
    }
}
