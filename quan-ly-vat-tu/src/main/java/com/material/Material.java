package com.material;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.object.MaterialObject;

public interface Material {
    boolean addMaterial(MaterialObject item);
    boolean editMaterial(MaterialObject item);
    boolean deleteMaterial(MaterialObject item);

    ArrayList<ResultSet> getMaterials(MaterialObject similar, int at, byte total);
    ResultSet getMaterial(int id);
    ResultSet getMaterial(String materialName, int supplierId);
}
