package com.materialcategory;
import java.sql.*;
import java.util.*;

import com.object.MaterialCategoryObject;

public interface MaterialCategory {
    boolean addCategory(MaterialCategoryObject item);
    boolean editCategory(MaterialCategoryObject item);
    boolean deleteCategory(MaterialCategoryObject item);

    ArrayList<ResultSet> getCategory(MaterialCategoryObject similar, int at, byte total);
    ResultSet getCategory(int id);
    ResultSet getCategory(String categoryName);
}