package penjualan;

import javax.swing.JTable;

public interface SupplierInterface {
    
    public void read(JTable tbl);
    
    public void create(Supplier sup);
    
    public void update(Supplier sup);
    
    public void delete(int id);
    
    public void search(JTable jt, String nama);
    
}
