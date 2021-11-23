package ExProject.Services;

import ExProject.VehicleException;

public interface TransService<E> {
   public void add(E e);
    public void edit(String signal,E newE) ;
    public void delete(String signal) ;
    public boolean search(String signal) throws VehicleException;
    public void display();
}
