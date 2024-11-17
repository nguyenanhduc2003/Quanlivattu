package com.export;

import com.object.ExportObject;
import java.sql.*;
import java.util.ArrayList;

public interface Export {

    boolean addExport(ExportObject export);
    boolean editExport(ExportObject export);
    boolean deleteExport(ExportObject export);

    ArrayList<ResultSet> getExports(ExportObject similar, int offset, byte total);
    ResultSet getExport(int exportId);
    ResultSet getExport(String department, String status);
}
