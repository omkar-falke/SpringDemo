package com.dao;

import java.util.List;

import com.model.Deparment;

public interface Dao {
public void addDeparment(Deparment d);

public List<Deparment> showData();

public void deleteData(int  id);
}
