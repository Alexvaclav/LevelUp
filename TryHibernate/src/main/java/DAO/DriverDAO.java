package DAO;

import logic.Bus;
import logic.Driver;
import logic.Route;

import java.sql.SQLException;
import java.util.Collection;

public interface DriverDAO {

    public void addDriver(Driver driver) throws SQLException;
    public void updateDriver(Long driver_id, Driver driver) throws SQLException;
    public Bus getDriverById(Long driver_id) throws SQLException;
    public Collection getAllDrivers() throws SQLException;
    public void deleteDriver(Driver driver) throws SQLException;
    public Collection getDriversByBus(Bus bus) throws SQLException;
    public Collection getDriversByRoute(Route route) throws SQLException;
}
