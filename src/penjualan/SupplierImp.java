/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kodetr
 */
public class SupplierImp implements SupplierInterface {

    private String[] kolom = {"ID", "NAMA", "QTY", "HARGA", "TOTAL HARGA"};

    private List<Supplier> list = new ArrayList<>();

    @Override
    public void read(JTable tbl) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object[] oj = new Object[5];
            oj[0] = list.get(i).getId();
            oj[1] = list.get(i).getNama();
            oj[2] = list.get(i).getQty();
            oj[3] = list.get(i).getHarga();
            oj[4] = list.get(i).getTotal_harga();
            dtm.addRow(oj);
        }
        tbl.setModel(dtm);
    }

    @Override
    public void create(Supplier sup) {
       list.add(sup);
       JOptionPane.showMessageDialog(null, "Berhasil disimpan");
    }

}
