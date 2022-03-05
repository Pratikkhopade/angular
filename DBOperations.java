package com.app.dao;

import java.util.Map;
import java.util.List;

public interface DBOperations {
public int insert(int no, String name,String job,long sal);
public Map<String,Object> ListEmpDetails(int no);
public List<Map<String,Object>> ListAllEmpDetails();
public int updateEmpsalary(int no,int newsal);
public int deletemp(int no);
}
